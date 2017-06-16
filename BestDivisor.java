import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int n = 12;
        int result =0;
        int fresult = 0;
        int i = n;
        while(i>0){
            if(n%i == 0){
                int sum = 0;
                int num = i;
                while (num > 0) {
                    sum = sum + num % 10;
                    num = num / 10;
                }
                if(sum>=result){
                    result = sum;
                    fresult = i;
                }
            }
            i--;
        }
        System.out.println(fresult);
    }
}