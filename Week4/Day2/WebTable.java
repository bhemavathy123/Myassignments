package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		driver.findElement(By.linkText("Crypto")).click();
		String text = driver.findElement(By.xpath("//div[@id='scr-res-table']/div/table/thead/tr/th[2]")).getText();
		System.out.println("currency name is " + text);
		String bitcoinUSD = driver.findElement(By.xpath("//td[text()='Bitcoin USD']")).getText();
		System.out.println("First currency is : "+ bitcoinUSD);
		
	}

}
