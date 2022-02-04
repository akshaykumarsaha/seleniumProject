import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowntest {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Dropdown")).click();
        //driver.findElement(By.id("dropdown")).sendKeys("option 1");
        driver.findElement(By.xpath("//select[@id='dropdown']")).sendKeys("option 1");
    }
}
