package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BaseScript {

    WebDriver driver;

    @Test (priority = 1)
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/");

    }

//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();
//
//        WebElement inputsLink = driver.findElement(By.linkText("Arsalan"));
//        inputsLink.click();
//
//        List<WebElement> Link = driver.findElements(By.tagName("a"));
//        System.out.println(Link.size());


//         WebElement menuLink = driver.findElement(By.linkText("shifting_content"));
//         menuLink.click();
//
//         driver.navigate().to("http://the-internet.herokuapp.com/shifting_content/menu");
//
//         WebElement  innerLink = driver.findElement(By.linkText("example"));
//         innerLink.click();
//
//
//
//
//         List <WebElement> innerElement = driver.findElements(By.tagName("li"));
//         System.out.println(innerElement.size());
//
//
//
//        System.out.println(driver.getTitle());
//        driver.quit();
//    }

    public static void main(String[] args) {
        BaseScript test = new BaseScript();
        test.setUp();
    }
}
