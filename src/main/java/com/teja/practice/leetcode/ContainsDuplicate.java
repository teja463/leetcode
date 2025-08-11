package com.teja.practice.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{1,2,3,4}));
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{1,2,3,1}));
        System.out.println("Contains duplicate: " + containsDuplicate(new int[]{2,2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int num: nums){
        if(set.contains(num)){
            return true;
        }else{
            set.add(num);
        }
      }
      return false;
    }
}
