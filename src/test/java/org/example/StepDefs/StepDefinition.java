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
    @Given("I select “White Papers & eBooks”")
    public void i_select_white_papers_e_books() {
        // Write code here that turns the phrase above into concrete actions
        navigate();
    }

    @Given("Verify Title reads “White Papers”")
    public void verify_title_reads_white_papers() {
        // Write code here that turns the phrase above into concrete actions
        verifyTitle();
    }

    @Given("Click on any white paper tile")
    public void click_on_any_white_paper_tile() {
        // Write code here that turns the phrase above into concrete actions
        navigatetoForm();
    }


    @Given("I Fill and submit the form")
    public void i_fill_and_submit_the_form() {
        // Write code here that turns the phrase above into concrete actions
        fillForm();
    }

    @Then("I Add screenshot of the error messages")
    public void i_add_screenshot_of_the_error_messages() {
        // Write code here that turns the phrase above into concrete actions
            takescreenshot();
    }

    @Then("I Validate all error messages")
    public void i_validate_all_error_messages() {
        // Write code here that turns the phrase above into concrete actions

    }

}
