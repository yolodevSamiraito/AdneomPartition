package net.adneom.test;

import java.util.ArrayList;
import java.util.List;

public class PartitionService {

    public <T> List<List<T>> partition(List<T> inputList, int size) {
        List<List<T>> outputList = new ArrayList<>();
        int start = 0;
        for (start = 0; start < inputList.size() / size; start++) {
            outputList.add(inputList.subList(start * size, (start * size) + size));
        }

        if (start * size < inputList.size())
            outputList.add(inputList.subList(start * size, inputList.size()));

        return outputList;
    }
}
