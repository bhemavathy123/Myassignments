package week3.day1;

public class SafariP extends BrowserGP{

	public void rearMode()
	{
	System.out.println("rear mode");	
	}
	public void fullScreenMode()
	{
		System.out.println("full screen mode");
	}
	public static void main(String[] args) {
		SafariP c=new SafariP();
		c.rearMode();
		c.fullScreenMode();
		c.openURL();
		c.closeBrowser("safari");
		c.navigateBack();
	}
}
