package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("https://jqueryui.com/sortable/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.switchTo().frame(0);
    	Actions actions=new Actions(driver);
        WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 1']"));
     	WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 2']"));
     	WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 3']"));
     	WebElement ele4=driver.findElement(By.xpath("//li[text()='Item 4']"));
     	actions.click(ele2).dragAndDrop(ele2,ele1).perform();
    	
    	Thread.sleep(2000);
    	
}
}