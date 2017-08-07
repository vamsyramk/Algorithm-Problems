package io.vamsy.controller;

import java.util.HashMap;

/**
 * Created by vamsyramk on 8/7/2017.
 */
public class Anagram {

    public static int numberNeeded(String s1,String s2){
        int result =0;
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        for(char c: s1.toCharArray()){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                value++;
                hm.put(c,value);
            }else{
                hm.put(c,1);
            }
        }

        HashMap<Character,Integer> hm2 = new HashMap<Character, Integer>();
        for(char c :s2.toCharArray()){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                value--;
                if(value == 0){
                    hm.remove(c);
                }else if(value>0){
                    hm.put(c,value);
                }
            }else if(hm2.containsKey(c)){
                int value2 = hm2.get(c);
                value2++;
                hm2.put(c,value2);
            }else{
                hm2.put(c,1);
            }
        }
        for(char c:hm.keySet()){
            result+=hm.get(c);
        }
        for(char c:hm2.keySet()){
            result+=hm2.get(c);
        }
        return result;
    }
    public static void main(String[] args) {
        int result = numberNeeded("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println(result);
    }
}
