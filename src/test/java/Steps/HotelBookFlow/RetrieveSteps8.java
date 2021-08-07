package Steps.HotelBookFlow;

import Actions.HotelFlow.RetrieveActions;
import cucumber.api.java.en.*;

public class RetrieveSteps8 {

    RetrieveActions retrieveActions = new RetrieveActions();

    @Given("I want to create the Get Request as userId as \"([^\"]*)\" UserName as \"([^\"]*)\" ClientID as \"([^\"]*)\" Expand as \"([^\"]*)\"")
    public void iWantToCreateTheGetRequestAsUserIdAsUserNameAsClientIDAsExpandAs(String userId, String userName, String clientID, String expand) {

        retrieveActions.retrieveRequestCreate(userId, userName, clientID, expand);
    }


    @When("I click send Request for Retrieve Request")
    public void iClickSendRequestForRetrieveRequest() {

        retrieveActions.sendRetrieveResponse();
    }

}
