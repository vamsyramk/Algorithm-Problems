import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        String theDate = "";
        if(y == 1918){
            theDate = "26.09.1918";
        }else if (y>=1700 && y<=1917){
            if(y%4 == 0){
                theDate = "12.09."+y;
            }else{
                theDate = "13.09."+y;
            }
        }else if (y>=1919 && y<=2700){
            if((y%400 ==0)||((y%4==0)&&(y%100 != 0))){
                theDate = "12.09."+y;
            }else{
                theDate = "13.09."+y;
            }
        }else{
            System.out.println("Invalid Input");
        }
        System.out.println(theDate);
    }
}