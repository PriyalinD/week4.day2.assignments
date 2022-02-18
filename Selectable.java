package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("https://jqueryui.com/selectable/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.switchTo().frame(0);
    	 WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 1']"));
    	WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 2']"));
    	WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 3']"));
    	WebElement ele4=driver.findElement(By.xpath("//li[text()='Item 4']"));
    	 WebElement ele5=driver.findElement(By.xpath("//li[text()='Item 5']"));
     	WebElement ele6=driver.findElement(By.xpath("//li[text()='Item 6']"));
     	WebElement ele7=driver.findElement(By.xpath("//li[text()='Item 7']"));
    	Actions actions=new Actions(driver);
    	actions.keyDown(Keys.CONTROL).click(ele1).click(ele2).click(ele3).click(ele4).click(ele5).click(ele6).click(ele7).keyUp(Keys.CONTROL).perform();
    	Thread.sleep(2000);

}
}


