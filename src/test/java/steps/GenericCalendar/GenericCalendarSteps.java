package steps.GenericCalendar;

import actions.GenericCalendar.GenericCalendarActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class GenericCalendarSteps {

    GenericCalendarActions genericCalendarActions = new GenericCalendarActions();

    @Given("I want to search for one Viator Product")
    public void iWantToSearchForOneViatorProduct() {

    }

    @When("^I click Gen Product Availability of \"([^\"]*)\" FromDate as \"([^\"]*)\" ToDate as \"([^\"]*)\"$")
    public void i_click_gen_product_availability_of_something_fromdate_as_something_todate_as_something(String productId, int startDateCount, int endDateCount) {

        genericCalendarActions.setRequest(productId, startDateCount, endDateCount);
    }

    @Then("^I should get a successful response with status code 200 for Gen Calendar$")
    public void i_should_get_a_successful_response_with_status_code_200_for_gen_calendar() throws Throwable {
        throw new PendingException();
    }

    @And("^response should return Product Name as \"([^\"]*)\" in response$")
    public void response_should_return_product_name_as_something_in_response(String suppliername, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^response should return Product Code as \"([^\"]*)\"$")
    public void response_should_return_product_code_as_something(String productid, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^extract Gen Calendar Price from the response response for StartDateCount Date$")
    public void extract_gen_calendar_price_from_the_response_response_for_startdatecount_date() throws Throwable {
        throw new PendingException();
    }

}
