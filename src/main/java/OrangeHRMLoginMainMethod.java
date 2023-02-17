import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRMLoginMainMethod {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys();
        driver.findElement(By.name("password")).sendKeys();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String pageTile = driver.getTitle();
        if(pageTile.equalsIgnoreCase("")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
