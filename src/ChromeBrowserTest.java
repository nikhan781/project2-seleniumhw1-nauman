import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    //Creating main method of the class
    public static void main(String[] args) {
        //Declaring String type local variable
        String webUrl = "https://opensource-demo.orangehrmlive.com/";
        //1. Setting up the Chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //Initialising Interface object
        WebDriver driverP2 = new ChromeDriver();

        //2. Opening Url in Chrome
        driverP2.get(webUrl);
        //Maximising window upon opening
        driverP2.manage().window().maximize();
        //timeout for page to load
        driverP2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print title page
        System.out.println("Title page is: " + driverP2.getTitle());

        //4. Print current URL
        String currentUrl = driverP2.getCurrentUrl();
        System.out.println("The current Url is: " + currentUrl);

        //5. Get page source code
        System.out.println("Page source code is: " + driverP2.getPageSource());

        //6.Get username field element and enter username
        WebElement user = driverP2.findElement(By.name("username"));
        user.sendKeys("nauman111");

        //7. Get password field element and enter password
        WebElement password = driverP2.findElement(By.name("password"));
        password.sendKeys("Abc123");

        //8. Closing the Chrome browser
        driverP2.quit();


    }
}
