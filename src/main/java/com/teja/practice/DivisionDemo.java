package com.teja.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DivisionDemo {


    public static void main(String[] args) {
        BigDecimal two = new BigDecimal(3);
        BigDecimal three = new BigDecimal(7);
        System.out.println(two.divide(three,5, RoundingMode.HALF_EVEN));
        System.out.println(two.divide(three,5, RoundingMode.HALF_UP));
        System.out.println(two.divide(three,5, RoundingMode.HALF_DOWN));
    }
}
