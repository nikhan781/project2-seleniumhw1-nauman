import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    //Declaring static variable of static type to store browser name
    static String browser = "Edge";

    //Declaring static variable of String type to store target url
    static String webUrl = "https://opensource-demo.orangehrmlive.com/";

    //Initialising static variable of WebDriver type to store web driver value
    static WebDriver driverMulti;

    //Creating main method
    public static void main(String[] args) {

        //Using condition statement to set up required browser
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driverMulti = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driverMulti = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driverMulti = new EdgeDriver();
        } else {
            System.out.println("Invalid Browser");
        }

        //Opening selected browser inside try-catch block to handle exception
        try {
            driverMulti.get(webUrl);
        } catch (Exception e) {
            System.out.println("End of program due to invalid entry (" + e.getMessage() + ")");
            System.exit(0);
        }
        //Maximising browser window upon openning
        driverMulti.manage().window().maximize();

        //Providing timeout for complete loading of page
        driverMulti.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Printing title of selected browser in console
        System.out.println("title of page is: " + driverMulti.getTitle());

        //4. Printing the current url
        System.out.println("The current url is: " + driverMulti.getCurrentUrl());

        //5. Printing the source for page
        System.out.println("The source of page is: " + driverMulti.getPageSource());

        //6. Getting web element for user field and entering the username in the field
        WebElement userName = driverMulti.findElement(By.name("username"));
        userName.sendKeys("nik111");

        //7. Getting web element for password field and entering the password in the field
        WebElement pass = driverMulti.findElement(By.name("password"));
        pass.sendKeys("xyz000");

        //8. Closing the selected browser
        driverMulti.quit();


    }

}
