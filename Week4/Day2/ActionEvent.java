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

public class ActionEvent {

	public static void main(String[] args) throws SecurityException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement scroll = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions act=new Actions(driver);
		
		act.scrollToElement(scroll).perform();
		
				
		System.out.println("scrolled down " + scroll.getText());
		
		//taking screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		
		File dst= new File("./snap/snapshot.png");
		FileUtils.copyFile(source, dst);
		
		
			
		
	}

}
