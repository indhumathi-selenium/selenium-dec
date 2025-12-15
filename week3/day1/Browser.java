package week3.day1;

public class Browser {

	public static Browser browserName;
	public static Browser browserVersion;
	
	
	public void OpenUrl() {
	 System.out.println("open the Url");
 }
	
	public void Closebrowser() {
		 System.out.println("close the browser");
	 }
		
	public void navigate() {
			 System.out.println("Navigate back");
		 }
		
			
		
		public static void main(String[] args) {

Browser s1=new Browser();
s1.OpenUrl();
s1.Closebrowser();
s1.navigate();
}
		}

