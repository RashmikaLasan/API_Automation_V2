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

    }


}
