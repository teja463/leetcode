package com.teja.practice.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println("Valid anagram: " + isAnagram("anagram", "nagaram"));
        System.out.println("Valid anagram: " + isAnagram("bnagram", "nagaram"));
        System.out.println("Valid anagram: " + isAnagram("bagram", "nagaram"));
    }


    /**
     * Solution with using two maps to store count
     * @param s
     * @param t
     * @return boolean
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c: s.toCharArray()){
            Integer count = sMap.getOrDefault(c, 0) + 1;
            sMap.put(c, count);

            Integer count1 = tMap.getOrDefault(c, 0) + 1;
            tMap.put(c, count1);
        }
        for(char c: s.toCharArray()){
            if(!Objects.equals(sMap.get(c), tMap.get(c))){
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        for(char c : s.toCharArray()){

        }

        return true;
    }
}
