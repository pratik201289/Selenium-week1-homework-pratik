package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");//1 param key // 2 param values
        WebDriver driver = new EdgeDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximize the windows
        driver.manage().window().maximize();
        //we give implicit time to deliver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title name of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get the page Source
        System.out.println("Page Source: " + driver.getPageSource());

        //Navigate to URL
        //String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //driver.navigate().to(loginURL);

        //Navigate to Login Page by clicking on login link
      //  WebElement loginlink = driver.findElement(By.linkText("Log in"));
       // loginlink.click();

        //find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("pratik@gmail.com");

        //find the password field element
        WebElement PassowrdField = driver.findElement(By.name("password"));
        PassowrdField.sendKeys("test123");

        //Close the browser
        // driver.close();
        driver.quit();

    }
}