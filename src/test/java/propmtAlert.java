import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propmtAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();

        driver.get("file:///C:/Users/user/Downloads/Prompt.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();
        Thread.sleep(4000);

        driver.switchTo().alert().sendKeys("Jordan");
        Thread.sleep(4000);
        driver.switchTo().alert().accept();




    }
}
