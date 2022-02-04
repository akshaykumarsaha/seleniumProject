import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrokenImg {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Broken Images")).click();
        List<WebElement> Broken = driver.findElements(By.tagName("img"));
        System.out.println("size="+Broken.size());
        for(WebElement i:Broken)
        {
//         System.out.println("name="+ i.getAttribute("src").split("/"));
            System.out.println("name="+ i.getAttribute("src"));

        }

    }
}
