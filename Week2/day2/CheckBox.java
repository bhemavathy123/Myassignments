package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='menuform:j_idt39']//a")).click();
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[5]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		boolean enabled = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		
		if(enabled==true)
		{
			System.out.println("button is disabled : " + enabled);
		}
		else {
			System.out.println("button is enabled" + enabled);
		}
		//selecting check boxes in drop down
		driver.findElement(By.xpath("//div[@role='combobox']//ul[1]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Miami']//label[1]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']//label[1]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Rome']//label[1]")).click();
	

	}

}
