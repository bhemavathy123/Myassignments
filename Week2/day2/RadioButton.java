package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']//a")).click();
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
				
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		boolean c = driver.findElement(By.xpath("(//label[text()='Firefox'])[2]")).isSelected();
		{
			System.out.println("button is not selected" + c);
		}
		boolean b = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
				{
			System.out.println("button is selected" + b);
		}
		
			
		
	}

}
