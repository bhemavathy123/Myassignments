package week3.day1;

public class BrowserGP {
	
		
	public void openURL()
	{
		System.out.println("open url");
	}
	
	public void closeBrowser(String browserName)
	{
				System.out.println("close the browser : " + browserName);
	}
	public void navigateBack()
	{
		System.out.println("navigate back");
	}
public static void main(String[] args) {
	BrowserGP g=new BrowserGP();
	g.closeBrowser("firefox");
}
}
