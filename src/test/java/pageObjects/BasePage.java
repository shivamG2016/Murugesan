package pageObjects;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver ;
    public BasePage(WebDriver driver){

      this.driver = driver;
      PageFactory.initElements(driver,this);

    }
}
// this key word represent the