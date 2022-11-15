import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    //Creating main method
    public static void main(String[] args) {

        //Declaring String type local variable to store given url
        String weburl = "https://opensource-demo.orangehrmlive.com/";

        //1.Setting up the Edge browser
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Creating object of WebDriver Interface
        WebDriver driveP2E = new EdgeDriver();

        //2. Opening the Url in Edge browser
        driveP2E.get(weburl);

        //Maximising the window
        driveP2E.manage().window().maximize();

        //Setting timeout limit for page to load completely
        driveP2E.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print title page
        System.out.println("The title page is: " + driveP2E.getTitle());

        //4. Printing the current url in the console
        System.out.println("The current URL is: " + driveP2E.getCurrentUrl());

        //5.Printing the sorurce code of the page
        String sCode = driveP2E.getPageSource();
        System.out.println("The source code is: " + sCode);

        //6. Getting th web element for username field and entering username
        WebElement usernameF = driveP2E.findElement(By.name("username"));
        usernameF.sendKeys("nik11");

        //7. Getting the web element for password field and entering passsword
        WebElement passF = driveP2E.findElement(By.name("password"));
        passF.sendKeys("xbc111");

        //8. Closing the Edge browser
        driveP2E.quit();
    }
}
