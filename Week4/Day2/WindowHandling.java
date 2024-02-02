package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println("window name is " + windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(window.get(1));
				
		String title = driver.getTitle();
		System.out.println("title of the page : " + title);
		
		
		driver.switchTo().window(window.get(0));
		driver.close();
		
		
	}

}
