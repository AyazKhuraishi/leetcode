package com.leetcode.easy.math;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int index = 0; index < nums.length; index++){
            int current = nums[index];
            if(map.containsKey(target - current)){
                return new int[]{map.get(target-current), index};
            }else{
                map.put(current, index);
            } 
        }
        return null;
    }
}