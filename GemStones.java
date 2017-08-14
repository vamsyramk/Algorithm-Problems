package io.vamsy.controller;

import java.util.HashSet;

/**
 * Created by vamsyramk on 8/14/2017.
 */
 //to see if a particular element is repeating in all the rocks(i.e no.of characters repeating in all the strings)
public class GemStones {
    static HashSet<Character> hs = new HashSet<Character>();
    static HashSet<Character> hs1 = new HashSet<Character>();
    static int gemstones(String[] arr){
        String s1 = arr[0];
        for(char c:s1.toCharArray()){
            hs.add(c);
        }
        for(int i=1;i<arr.length;i++){
            String s = arr[i];
            for(char c :s.toCharArray()){
                if(hs.contains(c)){
                    hs1.add(c);
                }
            }
            hs.clear();
            hs.addAll(hs1);
            hs1.clear();
        }
        return hs.size();
    }

    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "abcdde";
        arr[1] = "baccd";
        arr[2] = "eeabg";
        int result = gemstones(arr);
        System.out.println(result);
    }
}
