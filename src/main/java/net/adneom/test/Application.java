package net.adneom.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        if(isInteger(args[0])){
            if(Integer.parseInt(args[0])==0)
                System.out.println("The size should be bigger than 0");
            else{
                PartitionService partitionService = new PartitionService();

                List<List<String>> partition = partitionService.partition(
                        Arrays.asList(Arrays.copyOfRange(args, 1, args.length)),
                        Integer.parseInt(args[0]));

                System.out.println(partition);
            }


        }

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException | NullPointerException e) {
            System.out.println("The size should be an Integer");

            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
