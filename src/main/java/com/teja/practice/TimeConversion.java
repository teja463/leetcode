package com.teja.practice;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22AM"));
    }

    public static String timeConversion(String s) {
        if (s.endsWith("AM")) {
            String substring = s.substring(0, (s.length() - 2));
            if (substring.substring(0, 2).equals("12")) {
                substring = substring.replaceFirst("12", "00");
            }
            return substring;
        } else {
            String substring = s.substring(0, (s.length() - 2));
            String start = substring.substring(0, 2);
            if (!start.equals("12")) {
                if (start.startsWith("0")) {
                    start = start.substring(1);
                }
                Integer i = Integer.valueOf(start);
                i = i + 12;
                return i + substring.substring(2, substring.length());
            } else {
                return substring;
            }
        }
    }
}
