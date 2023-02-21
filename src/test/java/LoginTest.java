import Utility.LoginDataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    @Test(dataProvider = "logindata",dataProviderClass = LoginDataProvider.class)
    public void testValidUserNamePassword(String username,String password){
        loginPage = new LoginPage(Helper.getDriver());
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmitBtn();
        String pageTitle = loginPage.getPageTitle();


    }
    @Test
    public void deriverThres(){
        System.out.println("Driver One"+Helper.getDriver());
    }

    @Test
    public void deriverTshddddres(){
        System.out.println("Driver Two"+Helper.getDriver());
    }
    @Test
    public void deriverTsshres(){
        System.out.println("Driver Two"+Helper.getDriver());
    }
    @Test
    public void derivderTsshres(){
        System.out.println("Driver Two"+Helper.getDriver());
    }
    @Test
    public void derivesddsrTshres(){
        System.out.println("Driver Two"+Helper.getDriver());
    }
}
