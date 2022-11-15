package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");  //1 param key // 2 param values
        WebDriver driver = new ChromeDriver();
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
        //WebElement loginlink = driver.findElement(By.linkText("Log in"));
        //loginlink.click();

        //find the username field element
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("test123@gmail.com");

        //find the password field element
        WebElement PassowrdField = driver.findElement(By.name("password"));
        PassowrdField.sendKeys("test123");

        //Close the browser
        // driver.close();
        driver.quit();

    }

}
