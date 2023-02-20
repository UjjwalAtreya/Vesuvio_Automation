import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;


    @FindBy(name = "username")
    WebElement usernameElement;

    @FindBy(name = "password")
    WebElement passwordElement;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String username){
        usernameElement.sendKeys(username);
    }

    public void  enterPassword(String password){
        passwordElement.sendKeys(password);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

}
