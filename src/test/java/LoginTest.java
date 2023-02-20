import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    @Test
    public void testValidUserNamePassword(){
        loginPage = new LoginPage(this.driver);
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickSubmitBtn();
        String pageTitle = loginPage.getPageTitle();

    }
}
