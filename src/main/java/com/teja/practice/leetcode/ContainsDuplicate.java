package com.teja.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{1,2,3,4}));
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{1,2,3,1}));
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{2,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int num: nums){
           if(map.containsKey(num)){
               return true;
           }
           map.put(num, num);
       }
       return false;
    }
}
