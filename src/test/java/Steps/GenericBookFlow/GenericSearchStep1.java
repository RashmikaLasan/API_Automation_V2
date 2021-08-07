package Steps.GenericBookFlow;

import Actions.GenericFlow.GenericSearchAction1;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericSearchStep1 {


    GenericSearchAction1 genericSearchAction1 = new GenericSearchAction1();

    @Given("I Enter the checkIn date as \"([^\"]*)\" Product Code as \"([^\"]*)\" City as \"([^\"]*)\" for two Adults")
    public void iEnterTheCheckInDateAsProductCodeAsCityAsForTwoAdults(int futureDateCount, String productCode, String city) {

        genericSearchAction1.genericSearchRequestCreate(futureDateCount, productCode, city);
    }

    @When("I click send request for Generic Search Request")
    public void iClickSendRequestForGenericSearchRequest() {

        genericSearchAction1.sendSearchRequest();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Search")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericSearch(int statusCode) {

        genericSearchAction1.hotelSearchStatusCode(statusCode);
    }

    @And("Store the Generic Key Controls")
    public void storeTheGenericKeyControls() {

        genericSearchAction1.storeGenericKeyControls();
    }

    @And("Store Generic Payload")
    public void storeGenericPayload() {

        genericSearchAction1.storeGenericPayload();
    }

    @Then("Store the Product Name")
    public void storeTheProductName() {

        genericSearchAction1.storeProductName();
    }

    @Then("Store the Product Code")
    public void storeTheProductCode() {

        genericSearchAction1.storeProductCode();
    }

    @Then("Store the Generic Service Start Date")
    public void storeTheGenericServiceStartDate() {

        genericSearchAction1.storeGenericStartDate();
    }

    @Then("Store the Generic Service End Date")
    public void storeTheGenericServiceEndDate() {

        genericSearchAction1.storeGenericEndDate();
    }

    @Then("Store the Duration of Tour")
    public void storeTheDurationOfTour() {

        genericSearchAction1.storeTourDuration();
    }
}
