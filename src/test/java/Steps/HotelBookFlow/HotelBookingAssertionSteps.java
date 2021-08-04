package Steps.HotelBookFlow;

import Actions.HotelFlow.CreatePaymentSessionActions4;
import Actions.HotelFlow.HotelBookingAssertionActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class HotelBookingAssertionSteps {

    HotelBookingAssertionActions hotelBookingAssertionActions = new HotelBookingAssertionActions();
    CreatePaymentSessionActions4 createPaymentSessionActions4 = new CreatePaymentSessionActions4();
    @Then("I should get a successful response as status code (\\d+) for Hotel Search")
    public void iShouldGetASuccessfulResponseAsStatusCodeForHotelSearch(int statusCode) {

        hotelBookingAssertionActions.hotelSearchStatusCode(statusCode);
    }

    @Then("I should get a successful response as status code (\\d+) Add to Cart")
    public void iShouldGetASuccessfulResponseAsStatusCodeAddToCart(int statusCode) {

        hotelBookingAssertionActions.createCartStatusCode(statusCode);

    }

    @Then("check the Hotel Name is correct in Create Cart Response")
    public void checkTheHotelNameIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartHotelNameAssertion();
    }

    @Then("check the Hotel Code is correct in Create Cart Response")
    public void checkTheHotelCodeIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartHotelCodeAssertion();
    }


    @Then("check the Service Start Date is correct in Create Cart Response")
    public void checkTheServiceStartDateIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartStartDateAssertion();

    }

    @Then("check the Service End Date is correct in Create Cart Response")
    public void checkTheServiceEndDateIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartEndDateAssertion();
    }


    @Then("check the Nights Count is correct in Create Cart Response")
    public void checkTheNightsCountIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartDurationAssertion();
    }

    @Then("check the Choice Key is correct in Create Cart Response")
    public void checkTheChoiceKeyIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartChoiceKeyAssertion();
    }


    @Then("check the Price of the Booking is correct in Create Cart Response")
    public void checkThePriceOfTheBookingIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartPriceAssertion();

    }


    @Then("check the Room Type is correct in Create Cart Response")
    public void checkTheRoomTypeIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartRoomTypeAssertion();

    }


    @Then("check the Meal Plan is correct in Create Cart Response")
    public void checkTheMealPlanIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartMealPlanAssertion();

    }

    @Then("check the Pax Combination is correct in Create Cart Response")
    public void checkThePaxCombinationIsCorrectInCreateCartResponse() {

        hotelBookingAssertionActions.createCartPaxCombinationAssertion();
    }


    //Update Passenger Assertions
    @Then("I should get a successful response as status code (\\d+) Update Passenger")
    public void iShouldGetASuccessfulResponseAsStatusCodeUpdatePassenger(int statusCode) {

        hotelBookingAssertionActions.updatePassengerStatusCode(statusCode);
    }

    @Then("check the Cart ID is correct in Update Passenger Response")
    public void checkTheCartIDIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerCartIdAssertion();
    }

    @Then("check the Hotel Name is correct in Update Passenger Response")
    public void checkTheHotelNameIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerHotelNameAssertion();
    }

    @Then("check the Hotel Code is correct in Update Passenger Response")
    public void checkTheHotelCodeIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerHotelCodeAssertion();
    }

    @Then("check the Service Start Date is correct in Update Passenger Response")
    public void checkTheServiceStartDateIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerStartDateAssertion();
    }

    @Then("check the Service End Date is correct in Update Passenger Response")
    public void checkTheServiceEndDateIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerEndDateAssertion();
    }

    @Then("check the Nights Count is correct in Update Passenger Response")
    public void checkTheNightsCountIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerDurationAssertion();
    }

    @Then("check the Choice Key is correct in Update Passenger Response")
    public void checkTheChoiceKeyIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerChoiceKeyAssertion();
    }

    @Then("check the Price of the Booking is correct in Update Passenger Response")
    public void checkThePriceOfTheBookingIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerPriceAssertion();
    }

    @Then("check the Room Type is correct in Update Passenger Response")
    public void checkTheRoomTypeIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerRoomTypeAssertion();
    }

    @Then("check the Meal Plan is correct in Update Passenger Response")
    public void checkTheMealPlanIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerMealPlanAssertion();
    }

    @Then("check the Pax Combination is correct in Update Passenger Response")
    public void checkThePaxCombinationIsCorrectInUpdatePassengerResponse() {

        hotelBookingAssertionActions.updatePassengerPaxCombinationAssertion();
    }


    //Create Payment Session Assertions
    @Then("I should get a successful response as status code (\\d+) for Create Payment Session")
    public void iShouldGetASuccessfulResponseAsStatusCodeForCreatePaymentSession(int statusCode) {

        hotelBookingAssertionActions.createPaymentSessionStatusCode(statusCode);

    }


    @Then("check the payment Amount is correct in Create Payment Session response")
    public void checkThePaymentAmountIsCorrectInCreatePaymentSessionResponse() {

        hotelBookingAssertionActions.createPaymentSessionPriceAssertion();
    }


    @Then("check the Transaction Identifier is equal to the Cart ID in Create Payment Session response")
    public void checkTheTransactionIdentifierIsEqualToTheCartIDInCreatePaymentSessionResponse() {

        hotelBookingAssertionActions.createPaymentSessionCartIdAssertion();
    }

    //    Capture Payment
    @Then("I should get a successful response as status code (\\d+) for Capture Payment Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForCapturePaymentRequest(int statusCode) {

        hotelBookingAssertionActions.capturePaymentStatusCode(statusCode);
    }

    //    Add Payments
    @Then("I should get a successful response as status code (\\d+) for Add Payment Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForAddPaymentRequest(int statusCode) {

        hotelBookingAssertionActions.addPaymentStatusCode(statusCode);
    }


    //Confirm Cart
    @Then("I should get a successful response as status code (\\d+) for Confirm Cart Request")
    public void iShouldGetASuccessfulResponseAsStatusCodeForConfirmCartRequest(int statusCode) {

        hotelBookingAssertionActions.confirmCartStatusCode(statusCode);
    }


    @And("the Booking Status Name should \"([^\"]*)\" in Confirm Cart Response")
    public void theBookingStatusNameShouldInConfirmCartResponse(String confirmed) {

        hotelBookingAssertionActions.confirmCartBookingStatus(confirmed);
    }

    @Then("check the Hotel Name is correct in Confirm Cart Response")
    public void checkTheHotelNameIsCorrectInConfirmCartResponse() {

        hotelBookingAssertionActions.confirmCartHotelName();
    }

    @Then("check the Hotel Code is correct in Confirm Cart Response")
    public void checkTheHotelCodeIsCorrectInConfirmCartResponse() {

        hotelBookingAssertionActions.confirmCartHotelCode();
    }

    @Then("check the Service Start Date is correct in Confirm Cart Response")
    public void checkTheServiceStartDateIsCorrectInConfirmCartResponse() {

        hotelBookingAssertionActions.confirmCartCheckInDate();
    }

    @Then("check the Service End Date is correct in Confirm Cart Response")
    public void checkTheServiceEndDateIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Nights Count is correct in Confirm Cart Response")
    public void checkTheNightsCountIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Choice Key is correct in Confirm Cart Response")
    public void checkTheChoiceKeyIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Price of the Booking is correct in Confirm Cart Response")
    public void checkThePriceOfTheBookingIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Room Type is correct in Confirm Cart Response")
    public void checkTheRoomTypeIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Meal Plan is correct in Confirm Cart Response")
    public void checkTheMealPlanIsCorrectInConfirmCartResponse() {
    }

    @Then("check the Pax Combination is correct in Confirm Cart Response")
    public void checkThePaxCombinationIsCorrectInConfirmCartResponse() {
    }


}
