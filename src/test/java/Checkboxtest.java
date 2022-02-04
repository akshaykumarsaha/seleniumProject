import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxtest {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Checkboxes")).click();
        //driver.findElement(By.id("Checkboxes")).sendKeys("Checkboxes 1");
        List<WebElement> lst= driver.findElements(By.xpath("//input[@type='checkbox']"));
        lst.get(0).click();
    }
}
