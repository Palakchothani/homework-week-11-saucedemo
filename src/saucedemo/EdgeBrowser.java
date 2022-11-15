package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser
{
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        //Get current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Get page Source
        System.out.println("Page source: " + driver.getPageSource());

        //Navigate to Login page
        //driver.navigate().to(loginUrl);

        //Navigate to Login page by clicking on login Link
        //WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //loginLink.click();

        //Find the email field element abd send the email
        WebElement userField = driver.findElement(By.name("user-name"));
        //Type email to send email
        userField.sendKeys("standard_user");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
    }
}
