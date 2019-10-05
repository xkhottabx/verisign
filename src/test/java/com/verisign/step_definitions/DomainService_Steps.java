package com.verisign.step_definitions;

import com.verisign.utilities.Driver;
import com.verisign.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.*;

public class DomainService_Steps {
    WebDriver driver=Driver.getDriver();
    Pages pages=new Pages();

    @Given("User on a Home Page")
    public void user_on_a_Home_Page() {
        pages.homePage().goToHomePage();
    }

    @When("User navigates to Domain Services")
    public void user_navigates_to_Domain_Services() {
        pages.homePage().services.click();
    }

    @Then("Page title is contains {string}")
    public void page_title_is_contains(String word) {
        assertTrue(driver.getTitle().contains(word));
    }

    @When("User clicks on About Verisign")
    public void user_clicks_on_About_Verisign() {
        pages.homePage().aboutVerisign.click();
        pages.homePage().executiveTeam.click();
    }

    @Then("Page title is contain words")
    public void page_title_is_contain_words(List<String> words) {
       for (String word: words){
           assertTrue(driver.getTitle().contains(word));
       }
    }
}
