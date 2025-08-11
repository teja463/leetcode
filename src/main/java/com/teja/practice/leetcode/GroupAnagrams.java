package com.teja.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static void main(String[] args) {

    System.out.println(groupAnagrams1(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
    System.out.println(groupAnagrams1(new String[] { "act", "pots", "tops", "cat", "stop", "hat" }));
    System.out.println(groupAnagrams1(new String[] { "", "b" }));
    System.out.println(groupAnagrams2(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
    System.out.println(groupAnagrams3(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
  }

  private static List<List<String>> groupAnagrams3(String[] strs) {
    Map<String, List<String>> res = new HashMap<>();
    for (String s : strs) {
      int[] count = new int[26];
      for (char c : s.toCharArray()) {
        count[c - 'a']++;
      }
      String key = Arrays.toString(count);
      res.putIfAbsent(key, new ArrayList<>());
      res.get(key).add(s);
    }
    return new ArrayList<>(res.values());
  }

  private static List<List<String>> groupAnagrams2(String[] strs) {
    Map<String, List<String>> map = new HashMap();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String s = new String(chars);
      var list = map.getOrDefault(s, new ArrayList<>());
      list.add(str);
      map.put(s, list);
    }
    System.out.println(map);
    return new ArrayList<>(map.values());

  }

  private static List<List<String>> groupAnagrams1(String[] s) {

    List<List<String>> outer = new ArrayList<>();
    List<String> alreadyDone = new ArrayList<>();
    for (int i = 0; i < s.length; i++) {
      if (alreadyDone.contains(s[i])) {
        continue;
      }
      List<String> inner = new ArrayList<>();
      for (int j = i + 1; j < s.length; j++) {
        if (isAnagram(s[i], s[j])) {
          inner.add(s[j]);
          alreadyDone.add(s[j]);
        }
      }
      inner.add(s[i]);
      outer.add(inner);
    }

    return outer;
  }

  private static boolean isAnagram(String s, String t) {
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
}
