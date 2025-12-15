package week3.day1;

public class Chrome extends Browser {
	
	public void Openincognito()
	{
		System.out.println("incognito on");
	}
	
	public void clearCache()
	{
	System.out.println("cache cleared");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		Chrome s2= new Chrome();
		s2.clearCache();
		s2.Openincognito();
		s2.Closebrowser();
		s2.navigate();
		s2.OpenUrl();
	}
	}
}
