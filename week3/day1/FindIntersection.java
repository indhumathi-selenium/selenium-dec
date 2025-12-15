package week3.day1;

//import io.cucumber.java.lu.a;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare first array
		int[] a= {3,2,11,4,6,7};
// declare second array
		int[] b= {1,2,8,4,7,9};

//nested for loop to confirm arrays
		for(int i=0; i<=a.length;i++);{

		for(int j=0; j<=b.length; j++);

		{
	//comparing  both arrays		
	if(a[i]==b[j])
	{
		System.out.println("Matching value: "+ a[i]);
	}
		}
}
	}

}
