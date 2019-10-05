package com.verisign.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected static final Logger logger = LogManager.getLogger();


    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;



    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * @return page name
     */


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
            logger.info("Loader mask gone...");
        } catch (Exception e) {
            logger.error("Loader mask doesn't present.");
            logger.error(e);
        }
    }

    public String getPageTitle(){
        waitUntilLoaderScreenDisappear();
        return Driver.getDriver().getTitle();
    }

}
