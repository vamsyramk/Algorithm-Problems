package io.vamsy.controller;

/**
 * Created by vamsyramk on 7/13/2017.
 */
import java.util.*;

public class Test{

    static String findMostFrequentChar(String inputString){
        inputString = inputString.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        Integer count=0;
        String character = "";
        for(char c: inputString.toCharArray()){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                value++;
                hm.put(c,value);
            }else {
                hm.put(c,1);
            }
        }

        Set entrySet = hm.entrySet();

        Iterator it = entrySet.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            //System.out.println(me.getKey()+"           "+me.getValue());
            if(Integer.valueOf(me.getValue().toString())>count){
                count = Integer.valueOf(me.getValue().toString());
                character = me.getKey().toString();
            }
        }
        return character;

    }
    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.findMostFrequentChar("Contains"));
    }
}
