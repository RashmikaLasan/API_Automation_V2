package Steps.HotelBookFlow;

import Actions.HotelFlow.SearchActions1;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class SearchSteps1 {

    SearchActions1 searchActions1 = new SearchActions1();

    @Given("^I Enter the checkIn date as \"([^\"]*)\" Night Count as \"([^\"]*)\" Hotel Code as \"([^\"]*)\" City as \"([^\"]*)\" for two Adults$")
    public void iEnterTheCheckInDateAsNightCountAsHotelCodeAsCityAsForTwoAdults(int FutureDateCount, String NightCount, String HotelCode, String City) {

        searchActions1.searchRequestCreate(FutureDateCount, NightCount, HotelCode, City);

    }

    @When("^I click send request for Hotel Search Request$")
    public void iClickSendRequestForHotelSearchRequest() {

        searchActions1.sendSearchRequest();

    }


    @And("^Store the Key Controls$")
    public void storeTheKeyControls() {

        searchActions1.storeKeyControls();

    }

    @And("^Store Payload$")
    public void storePayload() {

        searchActions1.storePayload();

    }

    @Then("^Store the Hotel Name$")
    public void storeTheHotelName() throws Throwable {

        searchActions1.storeHotelName();

    }

    @Then("^Store the Hotel Code$")
    public void storeTheHotelCode() throws Throwable {

        searchActions1.storeHotelCode();
    }

    @Then("^Store the Service Start Date$")
    public void storeTheServiceStartDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Service End Date$")
    public void storeTheServiceEndDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Nights Count$")
    public void storeTheNightsCount() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Choice Key$")
    public void storeTheChoiceKey() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Price of the Booking$")
    public void storeThePriceOfTheBooking() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Room Type$")
    public void storeTheRoomType() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Store the Meal Plan$")
    public void storeTheMealPlan() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
