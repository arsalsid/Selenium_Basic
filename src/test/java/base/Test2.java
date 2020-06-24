package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
        //Regular Expression :37
        //Syntax Xpath: tagName[contains{@attribute ,'value'}]
        //Syntax Css: tagName[attribute*'value']
    @Test (priority = 1)
    public void express (){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\asiddique\\Downloads\\Git repo\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


    }
}
