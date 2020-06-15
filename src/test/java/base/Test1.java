package base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {



    @Test (priority = 1)
    public void login (){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\arsalan\\Downloads\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // facebook page//
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");

        driver.findElement(By.id("email")).sendKeys("03152865702");
        driver.findElement(By.name("pass")).sendKeys("arsal4820");
//      driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

        driver.findElement(By.linkText("Forgotten account?")).click();
        driver.findElement(By.cssSelector("input#identify_email.inputtext")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

//      driver.findElement(By.name("firstname")).sendKeys("Muhammad");
//      driver.findElement(By.name("lastname")).sendKeys("Arsalan");

    }

    @Test (priority = 2)
    public void login2 () {

        //Salesforce page//
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\arsalan\\Downloads\\New folder\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=in");

        driver.findElement(By.id("username")).sendKeys("Bilal");
        driver.findElement(By.id("password")).sendKeys("abc123");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
       // System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        System.out.println(driver.findElement(By.id("error")).getText());
       // driver.switchTo().window("https://login.salesforce.com/?locale=in");
    }


    public static void main(String[] args) {

        //Object of tests
        Test1 run = new Test1 ();
  //      run.login();
          run.login2();


    }

}
