package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt90']/span")).click();
		String title = driver.getTitle();
		System.out.println("title of the page :" + title);
		
		//returning back to original screen
		driver.navigate().back();
		
		//check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		boolean bean = driver.findElement(By.xpath("//div[@class='card']/button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		if(bean==true)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disenabled");
		}
		
		//find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']/span[2]")).getLocation();
	    System.out.println("location is " + location);
	   
	    //Find and print the background color of the button
	    String value = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']/span[2]")).getCssValue("color");
	    System.out.println("color is "+ value);
	    
	    //Find and print the height and width of the button
	    Dimension size = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']/span[2]")).getSize();
	    System.out.println("height and width is "+ size);
	    
	    driver.close();
	}

}
