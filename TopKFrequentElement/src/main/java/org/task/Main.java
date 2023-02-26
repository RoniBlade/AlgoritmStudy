package org.task;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();

        int[] nums = {1,1,1,2,2,100};
        int k = 2;

        int[] a = s.topKFrequent(nums, k);

        for(int t : a)
        System.out.println(t + "\n");

    }
}