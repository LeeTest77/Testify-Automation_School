package test.java.Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class OperaNav {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\EEzirim\\Documents\\TESTIFY\\Testify-Automation_School\\Module4B\\Tasks\\test\\java\\Tasks\\Task1\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opera.com/");


    }
}
