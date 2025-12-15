package week3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[] number= {2, 5, 7, 7, 5, 9, 2, 3};
		int length=number.length;
 System.out.println("lenghth of array"+ length);
 
 Arrays.sort(number);
 System.out.println(number[0]);
 
 for(int i=0;i<number.length-1;i++) {
	 if(number[i]==number[i+1]);
	 System.out.println("Duplicates number are "+ number [i]);
	}
	}
}
