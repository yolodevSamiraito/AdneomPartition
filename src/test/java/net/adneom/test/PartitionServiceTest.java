package net.adneom.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class PartitionServiceTest {

    private PartitionService partitionService;

    @Before
    public void setup() {
        partitionService = new PartitionService();
    }

    @Test
    public void partition_success1() {
        // Given:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // When:
        List<List<Integer>> partition = partitionService.partition(list, 2);

        // Then:
        Assert.assertEquals(3, partition.size());
        Assert.assertEquals(Arrays.asList(1, 2), partition.get(0));
        Assert.assertEquals(Arrays.asList(3, 4), partition.get(1));
        Assert.assertEquals(Collections.singletonList(5), partition.get(2));
    }

    @Test
    public void partition_success2() {
        // Given:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // When:
        List<List<Integer>> partition = partitionService.partition(list, 3);

        // Then:
        Assert.assertEquals(2, partition.size());
        Assert.assertEquals(Arrays.asList(1, 2, 3), partition.get(0));
        Assert.assertEquals(Arrays.asList(4, 5), partition.get(1));
    }

    @Test
    public void partition_success3() {
        // Given:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // When:
        List<List<Integer>> partition = partitionService.partition(list, 1);

        // Then:
        Assert.assertEquals(5, partition.size());
        IntStream.rangeClosed(1, 5).forEach(value ->
                Assert.assertEquals(Collections.singletonList(value), partition.get(value - 1))
        );
    }

    @Test
    public void partition_success4() {
        // Given:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // When:
        List<List<Integer>> partition = partitionService.partition(list, 2);

        // Then:
        Assert.assertEquals(3, partition.size());
        Assert.assertEquals(Arrays.asList(1, 2), partition.get(0));
        Assert.assertEquals(Arrays.asList(3, 4), partition.get(1));
        Assert.assertEquals(Arrays.asList(5, 6), partition.get(2));
    }

}
