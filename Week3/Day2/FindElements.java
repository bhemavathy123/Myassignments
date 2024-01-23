package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List <Integer> ls= new ArrayList<Integer>();
		List<WebElement> fe = driver.findElements(By.className("a-price-whole"));
		
		
		for (WebElement data : fe) {
			String text = data.getText();
			//ls.add(text);
			//System.out.println(text);
			String replaceAll = text.replaceAll(",","");
			
			int parseInt = Integer.parseInt(replaceAll);
			ls.add(parseInt);
		}
		
		Collections.sort(ls);
		System.out.print(ls);
	}

}
