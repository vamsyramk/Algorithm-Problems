import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        String path = sc.next();
        int count =0;
        List<Integer> list = new ArrayList<Integer😠);
        list.add(0);
        for(char c: path.toCharArray()){
            if(c == 'D'){
                count-=1;
                list.add(-1);
            }else if(c=='U'){
                count+=1;
                list.add(1);
            }
            if(count == 0){
                list.add(0);
            }
        }
        int count1=0;
        int result = 0;
        boolean isSeaLevel = false;
        boolean valleyStart = false;
        for(Integer i :list){
            if(i==0){
                isSeaLevel = true;
                valleyStart = false;
                count1=0;
            }
            if(i==1 && isSeaLevel){
                valleyStart =false;
                isSeaLevel = false;
            }
            if(i == -1 && isSeaLevel){
                valleyStart = true;
                isSeaLevel = false;
            }
            if(valleyStart) {
                count1 += i;
                if (count1 == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}