package Week2.day1;

public class Browser {

	public String launchbrowser (String browsername) {
		browsername= browsername+" is loaded successfully";
	return browsername;
	
}
	public void loadUrl() {
		System.out.println("Url loaded successfully");
	}
	public static void main(String[] args) {
		Browser browserObj = new Browser();
		String print = browserObj.launchbrowser("suji Browser");
		System.out.println(print);
		browserObj.loadUrl();
	}
}

