package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSelect {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bragg Gaming");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mirtika2");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopinath1");
		
		//selecting employee from drop down
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(source);
		opt.selectByIndex(4);
		
		//selecting automobile from drop down
		WebElement camp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select data=new Select(camp);
		data.selectByVisibleText("Automobile");

		//selecting corporation from drop down
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select opt1=new Select(owner);
		opt1.selectByValue("OWN_CCORP");
		
		driver.findElement(By.xpath("//span[text()='Phone Number']/following::input")).sendKeys("9884396555");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle().contains("View Lead");
		
			}

}
