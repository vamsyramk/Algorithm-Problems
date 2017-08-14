import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static HashSet<Character> hs = new HashSet<Character>();
    static HashSet<Character> hs2 = new HashSet<Character>();
    static int length = 0;
    public static int findString(String s) {
        for (char c : s.toCharArray()) {
            hs.add(c);
            hs2.add(c);
        }
        StringBuilder sb =null;
        for (char ctop : hs2) {
            for (char c : hs) {
                sb = new StringBuilder();
                for (char c1 : s.toCharArray()) {
                    if (c1 == c || c1 == ctop) {
                        sb.append(c1);
                    }
                    
                }
                if (isMatching(sb.toString())) {
            length = Math.max(sb.toString().length(),length);
        }
            }
        }
        
        return length;
    }

    public static boolean isMatching(String s){
        if(s.length()>1){
            char b = s.charAt(0);
            char c = s.charAt(1);
            if(b==c) return false;
            for(int i =0;i<s.length();i+=2){
                if(b!=s.charAt(i)){
                    return false;
                }
            }
            for(int i =1;i<s.length();i+=2){
                if(c!=s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.println(findString(s));
    }
}
