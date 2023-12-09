package hellocucumber

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.junit.jupiter.api.Assertions


class IsItFridayStepDefinitions {
    private var today: String = ""
    private var actualAnswer: String = ""

    @Given("today is Sunday")
    fun today_is_Sunday() {
        today = "Sunday"
    }

    @Given("today is Friday")
    fun today_is_Friday() {
        today = "Friday"
    }

    @When("I ask whether it's Friday yet")
    fun i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today)
    }

    @Then("I should be told {string}")
    fun i_should_be_told(expectedAnswer: String) {
        Assertions.assertEquals(expectedAnswer, actualAnswer)
    }
}