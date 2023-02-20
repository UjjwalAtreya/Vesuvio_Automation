import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OrangeHRMLoginMainMethod {

    WebDriver driver;
    @BeforeMethod
    public void setup() throws InterruptedException {
        // Setting up webdriver and base url
        driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @Test
    public void testToVerifyPageTitle(){
        //Navigation and Asseertion
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String pageTile = driver.getTitle();
        Assert.assertEquals(pageTile,"OrangeHRM");
    }

    @Test
    public void forgetPassword() {
        // username blank, valid password
        String username = "";
        String password = "admin123";
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Check for the error message
        WebElement errorMessage = driver.findElement(By.className("//div[@class='oxd-form-row']//span"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Required";
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed. Expected error message: " + expectedErrorMessage
                    + ", but got: " + actualErrorMessage);
        }
    }

    @AfterMethod
    public void tearDown(){
        // Browser quit
        driver.quit();
    }


}


