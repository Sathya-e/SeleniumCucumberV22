package StepDefinition;

import cucumber.api.java.en.*;

public class TaggingSteps {

    @Given("This is valid Login Test")
    public void this_is_valid_Login_Test() {
        System.out.println("This is login test..");
    }

    @Given("This is logout Test")
    public void this_is_logout_Test() {
        System.out.println("This is logout test..");
    }

    @Given("This is Search Test")
    public void this_is_Search_Test() {
        System.out.println("This is Search Test..");
    }

    @Given("This is Advanced Search")
    public void this_is_Advanced_Search() {
        System.out.println("This is advanced search test..");
    }

    @Given("This is Prepaid Recharge")
    public void this_is_Prepaid_Recharge() {
        System.out.println("This is Prepaid Recharge test..");
    }

    @Given("This is Postpaid Recharge")
    public void this_is_Postpaid_Recharge() {
        System.out.println("This is Postpaid Recharge Test..");
    }

}
