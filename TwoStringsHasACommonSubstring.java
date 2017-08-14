import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//to check if two string has a common substring
public class Solution {

    static HashSet<Character> hs=null;
    public static String twoStrings(String s1,String s2){
        hs = new HashSet<Character>();
        for(char c:s1.toCharArray()){
            hs.add(c);
        }
        for(char c :s2.toCharArray()){
            if(hs.contains(c)) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}