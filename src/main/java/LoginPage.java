import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver driver;

    @FindBy(name = "username") WebElement username;
    @FindBy(name = "password") WebElement password;
    @FindBy(xpath = "//button[@type='submit']") WebElement submitBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

   public void enterUserName(String userName){
        username.sendKeys(userName);
   }

   public void enterPassword(String pass){
        password.sendKeys(pass);
   }

   public void clickSubmit(){
        submitBtn.click();
   }

   public String getPageTitle(){
        return driver.getTitle();
   }
}


