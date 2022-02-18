package week4.day2.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div#left-content-column>div>div:nth-of-type(2)>ul>li:nth-of-type(4)>a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("Priyalin");
	driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("Lemy");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Merge")).click();
    Thread.sleep(2000);
	 Alert alert= driver.switchTo().alert();
     alert.accept();
     String title = driver.getTitle();
	    System.out.println(title);
     
}
}
//}ComboBox_partyIdFrom
