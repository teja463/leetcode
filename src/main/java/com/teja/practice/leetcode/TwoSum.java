package com.teja.practice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] input1 = new int[] { 3, 2, 4 };
        int output1 = 6;

        int[] input2 = new int[] { 2, 7, 11, 15 };
        int output2 = 9;

        System.out.println(Arrays.toString(twoSum(input1, output1)));
        System.out.println(Arrays.toString(twoSum2(input1, output1)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1; j< nums.length; j++){
                System.out.println(nums[i] + " " + nums[j]);
                if(nums[i]+nums[j] == target){
                    return new int []{i,j};
                }
            }
        }
        return null;

    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i =0; i< nums.length; i++){
            int t = target - nums[i];
            if(map.containsKey(t) && map.get(t)!=i){
                return new int []{i, map.get(t)};
            }
        }

        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int t= target - nums[i];
            if(map.containsKey(t)){
                return new int []{i, map.get(t)};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
