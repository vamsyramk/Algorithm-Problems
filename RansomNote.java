package io.vamsy.controller;
import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        String[] arr1 =  magazine.split(" ");
        for(String s : arr1){
            if(magazineMap.containsKey(s)){
                int value = magazineMap.get(s);
                value++;
                magazineMap.put(s,value);
            }else{
                magazineMap.put(s,1);
            }
        }
        String[] arr2 = note.split(" ");
        for(String s : arr2){
            if(noteMap.containsKey(s)){
                int value = noteMap.get(s);
                value++;
                noteMap.put(s,value);
            }else{
                noteMap.put(s,1);
            }
        }
    }

    public boolean solve() {
        for(String s : noteMap.keySet()){
            if(!magazineMap.containsKey(s)){
                return false;
            }
            else if(magazineMap.containsKey(s)){
                int notevalue = noteMap.get(s);
                int value = magazineMap.get(s);
                value-=notevalue;
                if(value ==0){
                    magazineMap.remove(s);
                }
                else if (value>0){
                    magazineMap.put(s,value);
                }else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}