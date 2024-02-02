package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(findElement).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String text = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println("total count is " + text);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
	//	WebElement st = driver.findElement(By.xpath("//ul[@class='sort-value hidden']/li"));
		
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/div")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();
		
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		findElement2.clear();
		
		findElement2.sendKeys("500");
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='toVal']"));
		findElement3.clear();
		
		findElement3.sendKeys("700");
		
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		Thread.sleep(2000);
		
		WebElement findElement4 = driver.findElement(By.xpath("//picture[@class='picture-elem']/img"));
		Actions act1=new Actions(driver);
		act1.moveToElement(findElement4).perform();
		
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dst= new File("./snap/snapshot.png");
		FileUtils.copyFile(source, dst);
		Thread.sleep(2000);
		
		String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("cost is : " + text2);
		
		String text3 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("discount is : " + text3);
	}

}
