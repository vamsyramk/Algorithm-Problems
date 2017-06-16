import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = 0;
        if(n==0||p==0||p==1||n==p){
            result = 0;
        }else{
            if((p/2)<=((n-p)/2)){
                result = p/2;
            }else{result = (n-p)/2;}
        }
        System.out.println(result);
    }
}