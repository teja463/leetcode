package com.teja.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(23);
        candles.add(45);
        candles.add(4);
        candles.add(56);
        candles.add(56);

        Collections.sort(candles);
        Integer max = candles.get(candles.size() -1);
        long count = candles.stream().filter(i -> i.equals(max)).count();
        System.out.println(count);
    }
}
