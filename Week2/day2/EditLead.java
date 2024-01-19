package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	public class EditLead {
		
			public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Bragg");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kanisha4");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("gopinath4");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("test");
			driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
			driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("sanity");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("hema1@gmail.com");
			
			WebElement tes = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select data = new Select(tes);
			data.selectByIndex(3);
			//data.selectByVisibleText("Afghanistan");
			//data.selectByValue("NOR");
			
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Seleniym");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			String title = driver.getTitle();
			System.out.println("title of the page :" + title);
			driver.close();
				
			
}
	}
