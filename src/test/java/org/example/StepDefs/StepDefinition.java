package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends  Steps{
    @Given("I'm on the home page")
    public void i_m_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        launchBrowser();

    }

    @When("I search and select book")
    public void i_search_and_select_book() {
        // Write code here that turns the phrase above into concrete actions
        searchItemAndSelectBook("Who are thou");

    }

    @Then("I add book to cart")
    public void i_add_book_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        addItemToCart();

    }

    @Then("i verify the correct book is added")
    public void i_verify_the_correct_book_is_added() {
        // Write code here that turns the phrase above into concrete actions
        verifyItem();
    }
}
