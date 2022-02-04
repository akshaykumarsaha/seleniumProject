import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
//        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("Kyrie Irwing");

        driver.navigate().refresh();
        Thread.sleep(4000);
        username.sendKeys("Kobe Bryant");

    }
}

