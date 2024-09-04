package com.teja.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 18)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2,7,11,15}, 18)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i =0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i< nums.length; i++){
            int r = target - nums[i];
            if(map.containsKey(r)){
                return new int[]{i, map.get(r)};
            }
        }
        return null;
    }
    public static int[] twoSum3(int[] nums, int target) {
        return null;
    }
}
