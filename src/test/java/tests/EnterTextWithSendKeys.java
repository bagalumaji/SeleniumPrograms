package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class EnterTextWithSendKeys {
    @Test
    public void enterTextWithOutSendKeys() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement txtName = driver.findElement(By.name("q"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String name= "Umaji Bagal";
        js.executeScript("arguments[0].value='"+name+"'",txtName);


        Thread.sleep(20);

       // driver.quit();
    }
}
