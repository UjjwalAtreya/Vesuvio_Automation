import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver ;

    @BeforeMethod
    public void setup() throws InterruptedException {
        // Setting up webdriver and base url
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }
    @AfterMethod
    public void tearDown(){
        // Browser quit
        driver.quit();
    }
}
