package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(10000);
		driver.close();
	}

}
