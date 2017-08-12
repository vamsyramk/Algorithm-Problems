package io.vamsy.controller;

import java.util.HashMap;

/**
 * Created by vamsyramk on 8/12/2017.
 */
public class MathScore {

    static HashMap<Character,Integer> hm = new HashMap<Character, Integer>();


    public static int calculateScore(String s){
        s = s.toLowerCase();
        int count =0;
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)){
                count+= hm.get(c);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        hm.put('f',3);
        hm.put('j',6);
        hm.put('x',12);
        hm.put('a',2);
        hm.put('i',2);
        hm.put('e',2);
        hm.put('o',2);
        hm.put('t',5);
        int score = calculateScore("Jabbt");
        System.out.println(score);
    }
}
