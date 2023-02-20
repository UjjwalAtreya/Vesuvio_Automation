import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testToVerifyPageTitle(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickSubmit();
        String pageTitle = loginPage.getPageTitle();
        Assert.assertEquals(pageTitle,"OrangeHRM");
    }

    @Test

    public void forgetPassword() {
//        // username blank, valid password
//        Stding riusername = "";
//        String password = "admin123";
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        // Check for the error message
//        WebElement errorMessage = driver.findElement(By.className("//div[@class='oxd-form-row']//span"));
//        String actualErrorMessage = errorMessage.getText();
//        String expectedErrorMessage = "Required";
//        if (actualErrorMessage.equals(expectedErrorMessage)) {
//            System.out.println("Test passed.");
//        } else {
//            System.out.println("Test failed. Expected error message: " + expectedErrorMessage
//                    + ", but got: " + actualErrorMessage);
//        }
    }


    public void testToLoginWithoutCredentials(){
//        driver.findElement(By.name("username")).sendKeys("Abcde");
//        driver.findElement(By.name("password")).sendKeys("");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        String pageTile = driver.getTitle();
//        Assert.assertEquals(pageTile,"OrangeHRM");
    }





}
