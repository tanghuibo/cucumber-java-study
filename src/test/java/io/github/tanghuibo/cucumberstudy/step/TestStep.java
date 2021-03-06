package io.github.tanghuibo.cucumberstudy.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.tanghuibo.cucumberstudy.AbstractDefs;
import io.github.tanghuibo.cucumberstudy.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.Assert.*;

public class TestStep extends AbstractDefs {

    @Autowired
    WelcomeService welcomeService;

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Then("I say hello")
    public void iSayHello() {
        welcomeService.sayHello();
    }

    static class IsItFriday {
        static String isItFriday(String today) {
            if ("friday".equals(today)) {
                return "Right";
            }
            return "Nope";
        }
    }
}