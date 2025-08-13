package com.teja.practice.leetcode;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EncodeAndDecodeString {
  public static void main(String[] args) {

    List<String> list = List.of("One", "Two", "three");
    // List<String> list = List.of("");


    // String encoded = encode1(list);
    // System.out.println(encoded); 

    // List<String> decoded = decode1(encoded);
    // System.out.println(decoded);

    String encoded2 = encode2(list);
    System.out.println(encoded2);
    System.out.println(decode2(encoded2));
  }

  private static String encode2(List<String> list) {
    
    StringBuilder sb = new StringBuilder("");
    list.forEach(s -> {
      sb.append(s.length()).append("#").append(s);
    });
    return sb.toString();
  }

  private static List<String> decode2(String src) {
    
    List<String> list = new ArrayList<>();
    int i = 0;
    while (i< src.length()){
      int j = i;
      while(src.charAt(j) != '#'){
        j++;
      }
      int count = Integer.parseInt(src.substring(i, j));
      // System.out.println(count);
      i =  j + 1;
      j = i + count;
      list.add(src.substring(i, j));
      i = j;
    }

    return list;
  }

  private static String encode1(List<String> list) {
    if(list.isEmpty()){
      return "";
    }
    StringBuilder sb = new StringBuilder();

    for (String s : list) {
      String t = s.chars().map(ch -> ch + 37).mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
      sb.append(t).append("@-@");
    }

    
    return sb.toString();
  }

  private static List<String> decode1(String src) {
    if(src.length() == 0 ){
      return new ArrayList<>();
    }
    if(src.equals("@-@")){
      List<String> list = new ArrayList<>();
      list.add("");
      return list;
    }
    String[] split = src.split("@-@");
    List<String> out = new ArrayList<>();
    for (String s : split) {
      String t = s.chars().map(ch -> ch -37).mapToObj(ch -> String.valueOf((char)ch)).collect(Collectors.joining());
      out.add(t);
    }
    return out;
  }

}
