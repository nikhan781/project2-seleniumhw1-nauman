import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    //Declaring main method of the class
    public static void main(String[] args) {
        //Declaring the String variable of local type to store given URL
        String webUrl = "https://opensource-demo.orangehrmlive.com/";
        //1. Setting up the Firefox browser
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
        //Creating Interface object of web driver
        WebDriver driverP2F = new FirefoxDriver();

        //2. Opening given url in FireFox
        driverP2F.get(webUrl);

        //Maximising window once opened
        driverP2F.manage().window().maximize();

        //Timeout limit for page to load completely
        driverP2F.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3. Printing the title page in console
        String title = driverP2F.getTitle();
        System.out.println("The title page is: " + title);

        //4. Printing the current Url
        System.out.println("The current Url is:" + driverP2F.getCurrentUrl());

        //5. Printing the source code in console
        System.out.println("The source code is: " + driverP2F.getPageSource());

        //6.a Getting the web elements for username field
        WebElement username = driverP2F.findElement(By.name("username"));

        //6.b Entering the username
        username.sendKeys("nik");

        //7.a Getting th web elements for password field
        WebElement pass = driverP2F.findElement(By.name("password"));
        //7.b Enter the password in password field
        pass.sendKeys("abc123");

        //8. Closing the Firefox browser
        driverP2F.quit();

    }
}
