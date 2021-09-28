package steps.GenericBookFlow;

import actions.GenericFlow.GenericRetrieveActions8;
import actions.HotelFlow.RetrieveActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericRetrieveSteps8 {

    GenericRetrieveActions8 genericRetrieveActions8 = new GenericRetrieveActions8();

    @Given("I want to create the Generic Get Request as userId as \"([^\"]*)\" UserName as \"([^\"]*)\" ClientID as \"([^\"]*)\" Expand as \"([^\"]*)\"")
    public void iWantToCreateTheGenericGetRequestAsUserIdAsUserNameAsClientIDAsExpandAs(String userId, String userName, String clientID, String expand) {

        genericRetrieveActions8.genRetrieveRequestCreate(userId, userName, clientID, expand);
    }

    @When("I click send Request for Generic Retrieve Request")
    public void iClickSendRequestForGenericRetrieveRequest() {

        genericRetrieveActions8.sendGenRetrieveResponse();
    }

    @Then("I should get a successful response as status code (\\d+) for Generic Retrieve Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForGenericRetrieveRequest(int statusCode) {

    }
}
