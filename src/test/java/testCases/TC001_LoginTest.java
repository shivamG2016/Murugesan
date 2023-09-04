package testCases;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC001_LoginTest extends  TestBase

    {
        //login test
        // enter user name
        // enter password
        // click on button

        // we have to create an obj of base class

        @Test

        public void verifyLoginPage(){

          LoginPage lp =  new LoginPage(driver);
          lp.setUserName("Admin");
          lp.setPassword("admin123");
          lp.clickONLoginButton();
            System.out.println("Debug");

        }

    }
