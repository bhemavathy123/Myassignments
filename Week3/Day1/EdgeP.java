package week3.day1;

public class EdgeP extends BrowserGP {

	public void takeSnap()
	{
		System.out.println("take the snap");
	}
	
	//in BrowserGP we have same method but here it performs differnt logic means overriding
	public void openURL()
	{
		System.out.println("open url overrides");
	}
	public void clearCookies()
	{
		System.out.println("clear the cookies");
	}
	public static void main(String[] args) {
		EdgeP c=new EdgeP();
		c.openURL();
		c.closeBrowser("edge");
		c.navigateBack();
		c.takeSnap();
		c.clearCookies();
	}
}
