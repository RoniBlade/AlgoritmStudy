package org.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        //Counting
        for (int num : nums)
            count.merge(num, 1, Integer::sum);

        for (int key : count.keySet()){
            System.out.println(key + " " + count.get(key));
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
            System.out.println("bucket[freq] " + bucket[freq] + " freq: " + freq + "\n");
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
    }
}
