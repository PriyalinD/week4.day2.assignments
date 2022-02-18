package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("https://jqueryui.com/draggable/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.switchTo().frame(0);
    	WebElement element=driver.findElement(By.id("draggable"));
    	 Actions actions=new Actions(driver);
    	 actions.dragAndDropBy(element,100,100).perform();

}
}



