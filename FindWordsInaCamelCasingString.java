package io.vamsy.controller;

/**
 * Created by vamsyramk on 7/13/2017.
 */
import java.util.*;
//finding the total number of words in a given camel casing string
public class Test {
    public static void main(String[] args) {
        String s = "helloWorldIsBeauty";
        int count =1;
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
