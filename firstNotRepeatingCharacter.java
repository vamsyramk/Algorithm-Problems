package io.vamsy.controller;

import java.util.HashMap;

/**
 * Created by vamsyramk on 6/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String s = "asdfsvsadf";
        char i = t.find(s);
        System.out.println(i);
    }

    public char find(String s) {
        char c = '_';

        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();

        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch))
                hm.put(ch,2);
            else hm.put(ch,1);
        }
        for(char ch : s.toCharArray()){
            if(hm.get(ch) ==1){
                c = ch;
                break;
            }
        }
        return c;
    }
}
