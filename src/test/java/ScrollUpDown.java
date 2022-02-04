import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScrollUpDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,300)");
        Thread.sleep(3000);
        js.executeScript("window,scrollTo(document.body.scrollHeight,0)");

    }

}
