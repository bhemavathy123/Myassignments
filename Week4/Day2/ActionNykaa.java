package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionNykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		/*WebElement element2 = driver.findElement(By.xpath("//div[@class='css-150nd8c']//a[1]"));
		act.scrollToElement(element2).perform();
		element2.click();*/
		//driver.findElement(By.xpath("//div[@class='css-150nd8c']//a[1]"));
		
		

	}

}
