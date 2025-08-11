package com.teja.practice.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println("Valid anagram: " + isAnagram("anagram", "nagaram"));
        System.out.println("Valid anagram: " + isAnagram("test", "befg"));
        System.out.println("Valid anagram: " + isAnagram("teja", "ajet"));
    }

    /**
     * Solution with using two maps to store count
     * 
     * @param s
     * @param t
     * @return boolean
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);

        }

        return sMap.equals(tMap);
    }

    public static boolean isAnagram2(String s, String t) {
        return false;
    }
}
