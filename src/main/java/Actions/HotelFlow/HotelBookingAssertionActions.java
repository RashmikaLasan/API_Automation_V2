package Actions.HotelFlow;

import Utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;
import org.hamcrest.CoreMatchers;

import static Actions.HotelFlow.CreateCartActions2.cartId;
import static Actions.HotelFlow.CreateCartActions2.createCartResponse;
import static Actions.HotelFlow.SearchActions1.*;
import static org.hamcrest.CoreMatchers.hasItem;
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
}
