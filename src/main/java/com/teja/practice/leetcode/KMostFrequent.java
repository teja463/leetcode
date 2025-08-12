package com.teja.practice.leetcode;

import java.util.*;

public class KMostFrequent {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(new KMostFrequent().topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 1)));
  }

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int [] result= new int[k];
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
    for(int i = 0; i< list.subList(0, k).size(); i++){
      result[i] = list.get(i).getKey();
    }
    return result;
  }

  
}
