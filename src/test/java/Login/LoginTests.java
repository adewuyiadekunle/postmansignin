package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        //Initiate a chrome driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Input the URL
        driver.get("https://identity.getpostman.com/login?addAccount=1");
        Thread.sleep(7000);

        //Maximize window
        driver.manage().window().maximize();

        //Get Postman page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Click on the username field and input the username
        driver.findElement(By.name("username")).sendKeys("adewuyi.adekunle@gmail.com");

        //Click on the password field and input the password
        driver.findElement(By.id("password")).sendKeys("arikemi4171");

        //Click on the login button
        driver.findElement(By.xpath("//button[@id='sign-in-btn']")).click();

        //Wait for the page to Login
        Thread.sleep(1000);

        //Printout the current URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        //Quit the browser
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

    }
