package Actions.HotelFlow;

import Utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;
import org.testng.Assert;

import static Actions.HotelFlow.CreateCartActions2.createCartResponse;
import static Actions.HotelFlow.SearchActions1.*;
import static org.hamcrest.Matchers.equalTo;


public class HotelBookingAssertionActions {

    public static ValidatableResponse validatableResponse;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Hotel Search Status Code Validation
    public void hotelSearchStatusCode(int statusCode) {

        validatableResponse = SearchActions1.searchResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Hotel Search Response");

    }

    //Create Cart Status Code Validation
    public void createCartStatusCode(int statusCode) {

        createCartResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Create Cart Response");

    }

    //Create Cart Hotel Name Validation
    public void createCartHotelNameAssertion() {

        createCartResponse.then().body(("data[0].products[0].summary.name"), equalTo(hotelName));
        logger.info("Hotel Name Validation Success for Create Cart Response");

    }

    //Create Cart Hotel Code Validation
    public void createCartHotelCodeAssertion() {

        createCartResponse.then().body(("data[0].products[0].detail.hotelCode"), equalTo(hotelCode));
        logger.info("Hotel Code Validation Success for Create Cart Response");

    }

    //Create Cart Service Start Date Validation
    public void createCartStartDateAssertion() {

        createCartResponse.then().body(("data[0].products[0].summary.serviceStartDate"), equalTo(serviceStartDate));
        logger.info("Service Start Date Validation Success for Create Cart Response");

    }

    //Create Cart Service End Date Validation
    public void createCartEndDateAssertion() {

        createCartResponse.then().body(("data[0].products[0].summary.serviceEndDate"), equalTo(serviceEndDate));
        logger.info("Service End Date Validation Success for Create Cart Response");

    }

    //Create Cart Duration Validation
    public void createCartDurationAssertion() {

//        String CartNightCount = createCartResponse.then().body("data[0].products[0].summary.duration");
        int cartNightCount = createCartResponse.path("data[0].products[0].summary.duration");
        Assert.assertEquals(cartNightCount, nightCount);
//        equalTo(nightCount));
        logger.info("Night Count Validation Success for Create Cart Response");

    }

    //Create Cart ChoiceKey Validation
    public void createCartChoiceKeyAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.choiceKey"), equalTo(choiceKey));
        logger.info("ChoiceKey Validation Success for Create Cart Response");

    }

    //Create Cart Price Validation
    public void createCartPriceAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rate.price"), equalTo(totalPrice));
        logger.info("Total Price Validation Success for Create Cart Response");

    }

    //Create Room Type Validation
    public void createCartRoomTypeAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].typeName"), equalTo(roomType));
        logger.info("Room Type Validation Success for Create Cart Response");
    }

    //Create Meal Plan Validation
    public void createCartMealPlanAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].mealPlanName"), equalTo(roomType));
        logger.info("Meal Plan Validation Success for Create Cart Response");
    }

    //Create Passenger Combination Validation
    public void createCartPaxCombinationAssertion() {

        createCartResponse.then().body(("data[0].products[0].travellerInfo.adult"), equalTo(adultCount));
        logger.info("Adult Count Validation Success for Create Cart Response");

        createCartResponse.then().body(("data[0].products[0].travellerInfo.child"), equalTo(childCount));
        logger.info("Child Count Validation Success for Create Cart Response");

        createCartResponse.then().body(("data[0].products[0].travellerInfo.infant"), equalTo(childCount));
        logger.info("Infant Count Validation Success for Create Cart Response");
    }
}
