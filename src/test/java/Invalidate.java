import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Invalidate {

        public static void main(String[] args) {
            Xls_Reader xl = new Xls_Reader("C:\\Users\\user\\Desktop\\TestDataSheet.xlsx");
            int rowcount = xl.getRowCount("Sheet1");
            for(int i=2;i<=rowcount;i++)
            {
                String vTCName = xl.getCellData("Sheet1","Testcasename",i);
                if(vTCName.equals("TC01_InvalidCredential"))
                {
                    String url = xl.getCellData("Sheet1","URL",i);
                    String uname = xl.getCellData("Sheet1","Username",i);
                    String pwd = xl.getCellData("Sheet1","Password",i);

                    WebDriverManager.chromedriver().setup();

                    WebDriver driver = new ChromeDriver();

                    driver.get(url);
                    driver.findElement(By.name("email")).sendKeys(uname);
                    driver.findElement(By.name("password")).sendKeys(pwd);
                    driver.findElement(By.xpath("//input[@value='Login']")).click();
                    Boolean stat = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
                    if(stat)
                    {
                        xl.setCellData("Sheet1","Status",i,"Login functionality is not working for invalid credentials and hence testcase is passed");

                    }
                    else
                    {
                        xl.setCellData("Sheet1","Status",i,"Failed");

                    }
                }
                else
                {
                    System.out.println("Test cases not found in the excel sheet");
                }

            }

        }

    }

