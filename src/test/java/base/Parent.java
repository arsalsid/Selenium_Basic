package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Parent {

    @Test
    public void test(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Get url from browser//
        driver.get("https://github.com/");
//
//        //Get Website title//
//        System.out.println(driver.getTitle());
//
//        // Validate your're landed on correct page or not
//        System.out.println(driver.getCurrentUrl());

        //Get page source code from webiste
        //System.out.println(driver.getPageSource());

        driver.get("http://the-internet.herokuapp.com/");
        driver.navigate().forward();

        driver.quit();

    }

    public static void main(String[] args) {

        Parent m = new Parent();
        m.test();
    }
}
