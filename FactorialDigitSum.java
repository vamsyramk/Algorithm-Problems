package io.vamsy.controller;

import java.math.BigInteger;

/**
 * Created by vamsyramk on 8/12/2017.
 */
public class FacotrialDigitSum {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1");
        for(Integer i =100;i>0;i--){
            String s = i.toString();
            bi = bi.multiply(new BigInteger(s));
        }
        String digits = bi.toString();
        int sum =0;
        for(int i = 0; i < digits.length(); i++) {
            int digit = (int) (digits.charAt(i) - '0');
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
