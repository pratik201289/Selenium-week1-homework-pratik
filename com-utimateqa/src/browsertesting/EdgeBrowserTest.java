package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
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

        //Navigate to Sign In Page by clicking on Sign In link
        WebElement signinlink = driver.findElement(By.linkText("Sign In"));
        signinlink.click();

        //find the email field element
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("pratik@gmail.com");

        //find the password field element
        WebElement PassowrdField = driver.findElement(By.name("user[password]"));
        PassowrdField.sendKeys("test123");

        //Close the browser
        // driver.close();
        driver.quit();

    }
}