package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class KiwiPages {
    public KiwiPages() {

        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(), this);


    }


}
