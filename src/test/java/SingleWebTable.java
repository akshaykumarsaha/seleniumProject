import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingleWebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/user/Downloads/WbTable.html");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[1]")).getText());


    }
}
