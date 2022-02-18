package week4.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize(); 
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("http://www.leafground.com/pages/frame.html");
        driver.switchTo().frame(0);
        WebElement button = driver.findElement(By.xpath("//button[@id='Click']"));
         button.click();
         System.out.println( button.getText());
         //Nested
         driver.switchTo().defaultContent();
         driver.switchTo().frame(1);
         driver.switchTo().frame("frame2");
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
        button2.click();
        System.out.println(button2.getText());
       //  Get the count
       driver.switchTo().defaultContent();
       List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
       int framesize = totalframe.size(); 
       System.out.println(framesize);

}
}