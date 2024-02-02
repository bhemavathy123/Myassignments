package week4.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//going to alert box
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.sendKeys("i am checking you");
	alert.accept();
	String text = driver.findElement(By.id("confirm_result")).getText();
	System.out.println(text);
	
	
		

	}

}
