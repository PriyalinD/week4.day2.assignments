package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDroppable {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.get("https://jqueryui.com/droppable/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.switchTo().frame(0);
    	 WebElement from=driver.findElement(By.id("draggable"));
    	WebElement to=driver.findElement(By.id("droppable"));
    	Actions actions=new Actions(driver);
    	actions.dragAndDrop(from, to).perform();
    	Thread.sleep(2000);

}
}
//resizable