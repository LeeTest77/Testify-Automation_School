package test.java;

//CSS Locator

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\EEzirim\\Documents\\TESTIFY\\Testify-Automation_School\\Module4\\4B_Java_SeleniumWB_Automation\\4B\\Tasks\\test\\java\\Tasks\\Task1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //launch URl
        driver.get("https://www.saucedemo.com/");

        //Enter UserId
        driver.findElement(By.cssSelector("#user-name")).click();
        driver.findElement(By.cssSelector("#user-name")).sendKeys("visual_user");
        //Enter Password
        driver.findElement(By.cssSelector("#password")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        //click on the login button
        driver.findElement(By.cssSelector("#login-button")).click();

        Thread.sleep(500);
        //click on Add to cart
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        //Click on cart icon
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        Thread.sleep(1000);

        //Click on Checkout
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(500);


        driver.quit();
    }
}
