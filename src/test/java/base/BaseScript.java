package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseScript {

    WebDriver driver;

    public void setUp() {

        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.stepstone.de/");
        System.out.println(driver.getTitle());

        driver.quit();
    }

    public static void main(String[] args) {
        BaseScript test = new BaseScript();
        test.setUp();
    }
}
