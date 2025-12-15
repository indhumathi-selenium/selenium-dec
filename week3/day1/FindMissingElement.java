package week3.day1;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int[] a= {1,4,3,2,8,7};
 Arrays.sort(a); 

for (int i = a[0]; i < a.length; i++) {
	if (a[i - 1] != i) {
        System.out.println("Missing Number: " + i);
        break; // Step 4: Break after printing
	}
}
}
}