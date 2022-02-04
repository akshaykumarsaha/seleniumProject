import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("email")).sendKeys("Lebron");
        driver.findElement(By.name("password")).sendKeys("NBA");
        Thread.sleep(5000);


        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("password")).clear();


    }
}
