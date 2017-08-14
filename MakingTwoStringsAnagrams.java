import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//to check the number of characters to delete inorder to make two strings as anagrams
public class Solution {

    static HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
    static int count =0;
    public static int makingAnagrams(String s1,String s2){
        for(char c :s1.toCharArray()){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                value++;
                hm.put(c,value);
            }else{
                hm.put(c,1);
            }
        }
        //hm contains cde
        for(char c : s2.toCharArray()){
            if(hm.containsKey(c)){
                int value = hm.get(c);
                if(value>0){
                    value--;
                    hm.put(c,value);
                }else{
                    count++;
                    hm.remove(c);
                }
            }else{
                count++;
            }
        }
        for(char c :hm.keySet()){
            count+=hm.get(c);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
