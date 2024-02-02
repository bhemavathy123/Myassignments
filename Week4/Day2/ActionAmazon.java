package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("price is:" + text);
		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("customer rating is " + text2);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		Set<String> wh=driver.getWindowHandles();
		
		List<String> wh1=new ArrayList<String>(wh);
		
		driver.switchTo().window(wh1.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dst= new File("./snap/snapshot.png");
		FileUtils.copyFile(source, dst);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Total is" + text3);
		driver.close();

	}

}
