package test.java.Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FaceBookNav {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\EEzirim\\Documents\\TESTIFY\\Testify-Automation_School\\Module4\\4B_Java_SeleniumWB_Automation\\4B\\Tasks\\test\\java\\Tasks\\Task1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //RemoteWebDriver dummy = new  RemoteWebDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //System.setProperty("webdriver.gecko.driver", "\\geckodriver.exe");
        driver.quit();
    }
}
