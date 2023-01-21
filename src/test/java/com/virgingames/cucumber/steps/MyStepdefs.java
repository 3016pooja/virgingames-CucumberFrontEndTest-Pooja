package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOcookies();
    }

    @When("^I click on casino button$")
    public void iClickOnCasinoButton() {
        new HomePage().clickOncasino();
    }

    @Then("^I click on join now$")
    public void iClickOnJoinNow() {
        new HomePage().clickOjointnow();
    }
}
