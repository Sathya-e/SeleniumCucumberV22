package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class HookSteps {
    @Before
    public void setUp() {
        System.out.println("Launching the browser...");
        System.out.println("Login to the application");
    }

    @After
    public void tearDown() {
        System.out.println("Closed Browser");
    }

    @Given("new user regitration")
    public void new_user_regitration() {
        System.out.println("New user Registration Process..");
    }

    @When("user fills the required details")
    public void user_fills_the_required_details() {
        System.out.println("Requires mandatory details");
    }

    @Then("user is added")
    public void user_is_added() {
        System.out.println("User registered succefully..");
    }

    @Given("the availability of the train with proper date and time")
    public void the_availability_of_the_train_with_proper_date_and_time() {
        System.out.println("Details of available trains");
    }

    @When("user select the seats for reservation and paid amount")
    public void user_select_the_seats_for_reservation_and_paid_amount() {
        System.out.println("User reservation seats and paid amount through online");
    }

    @Then("user should receive a confirmation message on the same")
    public void user_should_receive_a_confirmation_message_on_the_same() {
        System.out.println("Received registration confirmation message..");
    }

    @Given("the period of time available for cancellation")
    public void the_period_of_time_available_for_cancellation() {
        System.out.println("Check for the cancellation of the tickets..");
    }

    @When("user cancelling the reserved tickets within the time period mentioned for cancellation")
    public void user_cancelling_the_reserved_tickets_within_the_time_period_mentioned_for_cancellation() {
        System.out.println("confirm cancelling the tickets..");
    }

    @Then("user should receive a part of amount which he paid for the reservation")
    public void user_should_receive_a_part_of_amount_which_he_paid_for_the_reservation() {
        System.out.println("Amount paid back to the user..");
    }

    @Then("receive a cancellation message on the same")
    public void receive_a_cancellation_message_on_the_same() {
        System.out.println("Received cancellation confirmation message..");
    }

    @Then("the cancelled tickets should be available for the booking again")
    public void the_cancelled_tickets_should_be_available_for_the_booking_again() {
        System.out.println("Cancelled tickets were available for rebooking");
    }

}
