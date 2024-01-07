package week1.day2;

public class Browser {
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched");
		return browserName;
	}
	
	public String loadUrl(String url)
	{
				return url;
	}
	
	public static void main(String[] args) {
		Browser bw=new Browser();
		String browserName=bw.launchBrowser("chrome");
		System.out.println("Browser name : " + browserName);
		String url=bw.loadUrl("google");
		System.out.println("link name: " + url);
		
	}

}
