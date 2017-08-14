import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//check if the given string is pangram i.e it contains all the letters from a to z
public class Solution {
    
    static HashSet<Integer> hs = new HashSet<Integer>();
    public static boolean checkPanagram(String s){
        s = s.toLowerCase();
        for(Character c:s.toCharArray()){
            hs.add(c.hashCode());
        }
        for(int i=97;i<123;i++){
            if(!hs.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean f = checkPanagram(s);
        if(f){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}