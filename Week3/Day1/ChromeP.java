package week3.day1;

public class ChromeP extends BrowserGP{
	
	public void openIncognito()
	{
		System.out.println("openIncognito");
	}
	public void clearCache()
	{
		System.out.println("clear cache");
	}
	
	public static void main(String[] args) {
		ChromeP c=new ChromeP();
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser("chrome");
		c.navigateBack();
	}

}
