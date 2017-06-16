package main.java.com.monotonic.testing.m2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNumber {
	public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
	
	public int findDuplicateNumber(List<Integer> numbers){
		Map<Integer,Integer> map =  new HashMap<>();
		for(Integer k : numbers){
			if(map.containsKey(k)){
				return k;
			}
			map.put(k, 1);
		}
		return 0;
	}
}
