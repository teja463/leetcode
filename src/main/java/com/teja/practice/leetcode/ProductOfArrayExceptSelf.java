package com.teja.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
  public static void main(String[] args) {

    int[] t = new int[]{1,2,3,4};
    
    
    System.out.println(Arrays.toString(productExceptSelf3(t)));
    // System.out.println(Arrays.toString(productExceptSelf(r)));
  }

  
  public static int[] productExceptSelf3(int[] nums) {
    int[] res = new int[nums.length];
    int [] prefix = new int[nums.length];
    int [] postfix = new int[nums.length];

    for(int i =0; i< nums.length; i++){
      if(i==0){
        prefix[i] = nums[i] * 1;
      }else{
        prefix[i] = nums[i] * prefix[i-1];
      }
    }

    for(int i = nums.length -1; i>=0; i--){
      if(i == nums.length -1 ){
        postfix[i] = nums[i] * 1;
      }else{
        postfix[i] = nums[i] * postfix[i+1];
      }
    }

    for(int i =0; i< nums.length; i++){
      if(i==0){
        res[i] = 1 * postfix[i+1];
      }else if(i == nums.length -1){
        res[i] = 1 * prefix[i -1] ;
      }else{
        res[i] = prefix[i-1] * postfix[i + 1];
      }
    }
    System.out.println(Arrays.toString(prefix));
    System.out.println(Arrays.toString(postfix));
   
    return res;
  }

  public static int[] productExceptSelf2(int[] nums) {
    int[] res = new int[nums.length];
    
    for (int i = 0; i < nums.length; i++) {
      int product = 1;
      for(int j = 0; j< nums.length; j++){
        if(i!=j){
          product = product * nums[j];
        }
      }
      res[i] = product;
    }
    return res;
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] res = new int[nums.length];
    List<Integer> list = new ArrayList<>();

    for (int i : nums) {
      list.add(i);
    }

    for (int i = 0; i < nums.length; i++) {
      List<Integer> dupList = new ArrayList<>(list);
      dupList.remove(i);
      int r = dupList.stream().reduce(1, (a, t) -> a * t);
      res[i] = r;
    }
    return res;
  }
}
