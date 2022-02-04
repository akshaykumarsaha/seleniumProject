import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultiWindowHandler {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> st= driver.getWindowHandles();
        Iterator<String> itr= st.iterator();
        while (itr.hasNext()){
            String Childwindow= itr.next();
            if(!parent.equals(Childwindow)){
                driver.switchTo().window(Childwindow);
                System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")));
                driver.switchTo().window(parent);
            }
        }
    }
}
