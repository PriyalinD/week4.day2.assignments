package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("https://jqueryui.com/resizable/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 WebElement drag=driver.findElement(By.xpath("/div[@id='resizable']//h3[1]"));
    	 Actions actions=new Actions(driver);
    	 actions.clickAndHold(drag).moveByOffset(20, 30).release().perform();
    	Thread.sleep(2000);
    	

}
}


