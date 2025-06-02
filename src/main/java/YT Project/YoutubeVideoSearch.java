package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class YoutubeVideoSearch {

    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();      
        driver.get("https://www.youtube.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
    
        searchBox.sendKeys("nature in 4k", Keys.ENTER);
        WebElement firstVideo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@id='video-title'])[1]")));
        firstVideo.click();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.quit();

     
        
    }
}
