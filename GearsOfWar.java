import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i =0; i<a;i++){
            int b = sc.nextInt();
            if(b%2==0){
                System.out.println("Yes");                
            }else{
                System.out.println("No");
            }
        }
    }
}