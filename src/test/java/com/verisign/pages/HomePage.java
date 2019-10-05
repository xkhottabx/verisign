package com.verisign.pages;

import com.verisign.utilities.BasePage;
import com.verisign.utilities.ConfigurationReader;
import com.verisign.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

   @FindBy(css="a[class='services-button white uppercase']")
    public WebElement services;

    @FindBy(xpath="(//a[.= 'About Verisign'])[1]")
    public WebElement aboutVerisign;

    @FindBy(xpath="(//a[.= 'Executive Team'])[2]")
    public WebElement executiveTeam;



    public void goToHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

}
