package Steps.HotelBookFlow;

import Actions.HotelFlow.HotelBookingAssertionActions;
import cucumber.api.java.en.Then;


public class HotelBookingAssertionSteps {

    HotelBookingAssertionActions hotelBookingAssertionActions = new HotelBookingAssertionActions();

    @Then("I should get a successful response as status code (\\d+) for Hotel Search")
    public void iShouldGetASuccessfulResponseAsStatusCodeForHotelSearch(int statusCode) {

        hotelBookingAssertionActions.hotelSearchStatusCode(statusCode);
    }

    @Then("I should get a successful response as status code (\\d+) Add to Cart")
    public void iShouldGetASuccessfulResponseAsStatusCodeAddToCart(int statusCode) {

        hotelBookingAssertionActions.createCartStatusCode(statusCode);

    }

    @Then("check the Hotel Name is correct")
    public void checkTheHotelNameIsCorrect() {

        hotelBookingAssertionActions.createCartHotelNameAssertion();
    }

    @Then("check the Hotel Code is correct")
    public void checkTheHotelCodeIsCorrect() {

        hotelBookingAssertionActions.createCartHotelCodeAssertion();

    }

    @Then("check the Service Start Date is correct")
    public void checkTheServiceStartDateIsCorrect() {

        hotelBookingAssertionActions.createCartStartDateAssertion();

    }

    @Then("check the Service End Date is correct")
    public void checkTheServiceEndDateIsCorrect() {

        hotelBookingAssertionActions.createCartEndDateAssertion();
    }

    @Then("check the Nights Count is correct")
    public void checkTheNightsCountIsCorrect() {

    }

    @Then("check the Choice Key is correct")
    public void checkTheChoiceKeyIsCorrect() {

    }

    @Then("check the Price of the Booking is correct")
    public void checkThePriceOfTheBookingIsCorrect() {

    }

    @Then("check the Room Type is correct")
    public void checkTheRoomTypeIsCorrect() {

    }

    @Then("check the Meal Plan is correct")
    public void checkTheMealPlanIsCorrect() {

    }

    @Then("check the Pax Combination is correct")
    public void checkThePaxCombinationIsCorrect() {

    }
}
