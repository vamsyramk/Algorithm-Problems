package main.java.com.monotonic.testing.m2;

public class Max2NumsOfArray {
	public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        Max2NumsOfArray max2 = new Max2NumsOfArray();
        max2.printTwoMaxNumbers(num);
    }
	
	public void printTwoMaxNumbers(int[] nums){
		int m1=0;
		int m2=0;
		for(int i : nums){
			if(i>m1){
				m2=m1;
				m1 = i;
			}else if(i>m2){
				m2=i;
			}
		}
		System.out.println(m1+"         "+m2);
	}

}
