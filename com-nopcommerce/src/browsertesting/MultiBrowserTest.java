package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "firefox";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");  //1 param key // 2 param values
            driver = new ChromeDriver();
            driver.get(baseUrl);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);

        } else if (browser.equalsIgnoreCase("Edge")) {

            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);

        } else {
            System.out.println("Wrong Browser Name");
        }

        //find the baseURL
        driver.get(baseUrl);
        //maximize the window of current URL
        driver.manage().window().maximize();
        // implict time to deliver wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title name of the page
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);

        //Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get the page Source
        System.out.println("Page Source: " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("pratik@gmail.com");

        //find the password field element
        WebElement PasswordField = driver.findElement(By.name("Password"));
        PasswordField.sendKeys("pra123");

        //close the browser
        driver.close();
    }

}
