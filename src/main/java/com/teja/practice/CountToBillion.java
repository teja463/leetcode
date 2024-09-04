package com.teja.practice;

public class CountToBillion {
    public static void main(String[] args) {
        long i = 1;
        long start = System.currentTimeMillis();
        while(i < 1_000_000_000){
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
