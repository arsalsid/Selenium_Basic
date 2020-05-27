package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;

    @Test
    public void login (){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        driver.findElement(By.id("email")).sendKeys("03152865702");
        driver.findElement(By.name("pass")).sendKeys("arsal4820");

//        WebElement login = driver.findElement(By.id("submit"));
//        login.click();

        driver.findElement(By.name("firstname")).sendKeys("Muhammad");
        driver.findElement(By.name("lastname")).sendKeys("Arsalan");


    }

}
