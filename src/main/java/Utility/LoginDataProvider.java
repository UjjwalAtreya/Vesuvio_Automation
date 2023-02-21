package Utility;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name="logindata")
    public Object[][] TestDataFeed(){
//        Object [][] twitterdata=new Object[2][2];
//        twitterdata[0][0]="username1@gmail.com";
//        twitterdata[0][1]="Password1";
//        twitterdata[1][0]="username2@gmail.com";
//        twitterdata[1][1]="Password2";
//        return twitterdata[0][0];

        return new Object [][] {
                {"Admin","admin123"},
                {"Admin","admi1234"},
                {"Admi", "sd"},
                {"asdljasd","jghdajgsd"}

        };
    }



}
