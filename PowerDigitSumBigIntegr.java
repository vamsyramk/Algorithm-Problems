package io.vamsy.controller;

import java.math.BigInteger;

/**
 * Created by vamsyramk on 8/12/2017.
 */
 //calculate the sum of the digits of 2 power 1000
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        for(int i=1;i<=1000;i++){
            result = result.multiply(new BigInteger("2"));
        }
        String digits = result.toString();
        int sum =0;
        for(int i = 0; i < digits.length(); i++) {
            int digit = (int) (digits.charAt(i) - '0');
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
