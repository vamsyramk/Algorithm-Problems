package io.vamsy.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vamsyramk on 8/12/2017.
 */
public class TitleCapitalization {
    static String[] strs = {"a","the","to","at","in","with","and","but","or"};
    static List<String> list = Arrays.asList(strs);

    public static String capitalizeWord(String word){
        String result = "";
        if(word.length()>1){
            result = (word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
        }else{
            result = (word.toUpperCase());
        }
        return result;
    }

    public static String capitalize(String s){
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
            if(i==0||i==arr.length-1){
                String word = capitalizeWord(arr[i]);
                result.append(word);
                result.append(" ");
            }
            else{
                if(list.contains(arr[i].toLowerCase())){
                    result.append(arr[i].toLowerCase());
                }else{
                    String word = capitalizeWord(arr[i]);
                    result.append(word);
                }
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

        String result = capitalize("the At run cow");
        System.out.println(result);
    }
}
