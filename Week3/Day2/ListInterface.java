package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='facet-linkhead']/label[@for='Men - Fashion Bags']")).click();
		
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='facet-linkhead']/label[@for='Men - Fashion Bags']"));
		
		
		for(WebElement data: bags)
		{
		String text = data.getText();
		System.out.println(text);
		}
	}
	
	
	
	

}
