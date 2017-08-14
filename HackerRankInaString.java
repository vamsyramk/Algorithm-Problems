package io.vamsy.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vamsyramk on 8/13/2017.
 */
 
//Have to find if we can make hackerrank in sequence with the given string
public class HackerrankString {

    public static boolean findString(String s){
        String hr = "hackerrank";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        s:for(char c:hr.toCharArray()){
            for(char c1:sb.toString().toCharArray()){
                if(c==c1){
                    if(sb.indexOf(String.valueOf(c))+1<sb.length()){
                    sb = sb.delete(0,sb.indexOf(String.valueOf(c))+1);
                    result.append(c);
                    break;
                    }else{
                        result.append(c);
                        break s;
                    }
                }
            }
        }
        if(result.toString().equals("hackerrank")){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        boolean flag = findString("hhhackkerbanker");
        System.out.println(flag);
    }

}
