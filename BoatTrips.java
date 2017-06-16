import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//no of trips
        int c = in.nextInt();//capacity
        int m = in.nextInt();//nub of boats
        int[] p = new int[n];
        String result = "";
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            if(p[p_i]<=m*c){
                result = "Yes";
            }else if(p[p_i]>m*c){
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}