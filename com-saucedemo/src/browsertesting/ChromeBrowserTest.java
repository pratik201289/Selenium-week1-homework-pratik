package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl="https://www.saucedemo.com/";
         System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //launch the URL
        driver.get(baseUrl);
        //maximize the windows
        driver.manage().window().maximize();
        //we give implict time to deliver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
        //Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //Get the Page Source
        System.out.println("Page Source: "+ driver.getPageSource());
        //find the username field element
        WebElement usernamefield= driver.findElement(By.name("user-name"));
        usernamefield.sendKeys("Rio");
        //find the password field element
        WebElement passwordfield= driver.findElement(By.name("password"));
        passwordfield.sendKeys("1234");

        //close the browser
        driver.quit();

    }
}
