import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int acount = 0;
        int ocount = 0;
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(((apple[apple_i]+a) >= s)&&((apple[apple_i]+a) <= t)){
                acount++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(((orange[orange_i]+b) >= s)&&((orange[orange_i]+b) <= t)){
                ocount++;
            }
        }
        System.out.println(acount);
        System.out.println(ocount);
    }
}
