package Week2.day1;

public class StringReverse {
	public static void main(String[] args) {
		String str = "I am a software engineer";
		String rev = "";
		StringBuilder s = new StringBuilder(str);
		
		System.out.println("using string reverse:"+s.reverse());
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
		
		System.out.println("using normal reverse:");

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
	}

}
