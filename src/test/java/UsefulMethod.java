import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethod {
    public static void main(String args[]) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Boolean bol = driver.findElement(By.name("email")).isEnabled();
        //Boolean bol = driver.findElement(By.name("email")).isDisplayed();
        if (bol)
        {
            System.out.println("Testcase is passed and user name is visible on the Webpage");
        }
        else
        {
            System.out.println("Testcase is Failed as username field is not visible on the webpage");
        }
    }
}
