package Steps.HotelBookFlow;

import Actions.HotelFlow.AddPaymentActions6;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddPaymentSteps6 {

    AddPaymentActions6 addPaymentActions6 = new AddPaymentActions6();

    @Given("I want to create Unique ID in Add Payment Body")
    public void iWantToCreateUniqueIDInAddPaymentBody() {

        addPaymentActions6.createUniqueId();
    }


    @Given("I want to create Payment Details in Add Payment Body where Card Type as \"([^\"]*)\"")
    public void iWantToCreatePaymentDetailsInAddPaymentBodyWhereCardTypeAs(String cardType) {

        addPaymentActions6.createPaymentDetails(cardType);
    }

    @Given("I want to create Payment Info  in Add Payment Body where Currency as \"([^\"]*)\"")
    public void iWantToCreatePaymentInfoInAddPaymentBodyWhereCurrencyAs(String currency) {

        addPaymentActions6.createPaymentInfo(currency);
    }

    @Given("I want to create Note in Add Payment Body")
    public void iWantToCreateNoteInAddPaymentBody() {
    }

    @Then("I want to Merge the Full Body")
    public void iWantToMergeTheFullBody() {

        addPaymentActions6.createFullBody();
    }

    @Then("I click send request for Add Payment Request")
    public void iClickSendRequestForAddPaymentRequest() {

        addPaymentActions6.sendAddPaymentRequest();
    }


}
