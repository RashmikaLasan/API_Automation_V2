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
    public static String totalPriceCreateCart;
    public static String choiceKeyCreateCart;
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

        String durationCreateCart = createCartResponse.path("data[0].products[0].summary.duration").toString();
        Assert.assertEquals(durationCreateCart, nightCount);
        logger.info("Night Count Validation Success for Create Cart Response");

    }

    //Create Cart ChoiceKey Validation
    public void createCartChoiceKeyAssertion() {

        String choiceKeyCreateCart = createCartResponse.path("data[0].products[0].roomSet.choiceKey").toString();
        String choiceKeyCart = choiceKeyCreateCart.substring(7);
        Assert.assertEquals(choiceKeyCart, choiceKey);
        logger.info("Choice Key in Create Cart Response is: " + choiceKeyCreateCart);
        logger.info("ChoiceKey Validation Success for Create Cart Response");

    }

    //Create Cart Price Validation
    public void createCartPriceAssertion() {

        totalPriceCreateCart = (createCartResponse.path(("data[0].products[0].roomSet.rate.price"))).toString();
        Assert.assertEquals(totalPriceCreateCart, totalPrice);
        logger.info("Total Price Validation Success for Create Cart Response");

    }

    //Create Room Type Validation
    public void createCartRoomTypeAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].typeName"), equalTo(roomType));
        logger.info("Room Type Validation Success for Create Cart Response");
    }

    //Create Meal Plan Validation
    public void createCartMealPlanAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].mealPlanName"), equalTo(mealPlan));
        logger.info("Meal Plan Validation Success for Create Cart Response");
    }

    //Create Passenger Combination Validation
    public void createCartPaxCombinationAssertion() {

        String adultCountCreateCart = Integer.toString((createCartResponse.path(("data[0].products[0].travellerInfo.adult"))));
        Assert.assertEquals(adultCountCreateCart, adultCount);
        logger.info("Adult Count Validation Success for Create Cart Response");

        int childCountCreateCart = createCartResponse.path(("data[0].products[0].travellerInfo.child"));
        Assert.assertEquals(childCountCreateCart, Integer.parseInt(childCount));
        logger.info("Child Count Validation Success for Create Cart Response");


        int infantCountCreateCart = createCartResponse.path(("data[0].products[0].travellerInfo.infant"));
        Assert.assertEquals(infantCountCreateCart, Integer.parseInt(infantCount));
        logger.info("Infant Count Validation Success for Create Cart Response");

    }

    //Update Passenger Status Code Validation
    public void updatePassengerStatusCode(int statusCode) {

        createCartResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Create Cart Response");

    }
}
