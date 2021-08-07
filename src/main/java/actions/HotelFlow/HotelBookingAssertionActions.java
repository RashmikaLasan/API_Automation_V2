package actions.HotelFlow;

import utilities.Log;
import io.restassured.response.ValidatableResponse;
import org.apache.log4j.Logger;
import org.testng.Assert;

import static actions.HotelFlow.AddPaymentActions6.addPaymentResponse;
import static actions.HotelFlow.CapturePaymentActions5.capturePaymentResponse;
import static actions.HotelFlow.ConfirmCartActions7.confirmCartResponse;
import static actions.HotelFlow.CreateCartActions2.cartId;
import static actions.HotelFlow.CreateCartActions2.createCartResponse;
import static actions.HotelFlow.CreatePaymentSessionActions4.createPaymentSessionResponse;
import static actions.HotelFlow.RetrieveActions.retrieveResponse;
import static actions.HotelFlow.SearchActions1.*;
import static actions.HotelFlow.UpdatePassengerAction3.updatePassengerResponse;
import static org.hamcrest.Matchers.equalTo;


public class HotelBookingAssertionActions {

    public static ValidatableResponse validatableResponse;
    public static String totalPriceCreateCart;
    public static String choiceKeyCreateCart;
    public static String totalPriceUpdatePassenger;
    public static String totalPriceCreatePaymentSession;
    public static String transactionIdentifier;
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

        choiceKeyCreateCart = createCartResponse.path("data[0].products[0].roomSet.choiceKey").toString();
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

    //Create Cart Room Type Validation
    public void createCartRoomTypeAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].typeName"), equalTo(roomType));
        logger.info("Room Type Validation Success for Create Cart Response");
    }

    //Create Cart Meal Plan Validation
    public void createCartMealPlanAssertion() {

        createCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].mealPlanName"), equalTo(mealPlan));
        logger.info("Meal Plan Validation Success for Create Cart Response");
    }

    //Create Cart Passenger Combination Validation
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

        updatePassengerResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Create Cart Response");
    }

    //Update Passenger Cart ID Assertion
    public void updatePassengerCartIdAssertion() {

        String cartIdUpdatePassenger = updatePassengerResponse.path("data[0].summary.id").toString();
        Assert.assertEquals(cartIdUpdatePassenger, cartId);
        logger.info("Cart ID Validation success in Updates Passenger and Cart ID is: " + cartId);
    }

    //Update Passenger Hotel Name Assertion
    public void updatePassengerHotelNameAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].summary.name"), equalTo(hotelName));
        logger.info("Hotel Name Validation Success for Update Passenger Response and Hotel Name is: " + hotelName);
    }

    //Update Passenger Hotel Code Assertion
    public void updatePassengerHotelCodeAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].detail.hotelCode"), equalTo(hotelCode));
        logger.info("Hotel Name Validation Success for Update Passenger Response and Hotel Code is: " + hotelCode);
    }

    //Update Passenger Service Start Date Validation
    public void updatePassengerStartDateAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].summary.serviceStartDate"), equalTo(serviceStartDate));
        logger.info("Service Start Date Validation Success for Update Passenger Response and Service Start Date: " + serviceStartDate);

    }

    //Update Passenger Service End Date Validation
    public void updatePassengerEndDateAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].summary.serviceEndDate"), equalTo(serviceEndDate));
        logger.info("Service End Date Validation Success for Update Passenger Response and Service End Date: " + serviceEndDate);

    }

    //Update Passenger Duration Validation
    public void updatePassengerDurationAssertion() {

        String durationUpdatePassenger = updatePassengerResponse.path("data[0].products[0].summary.duration").toString();
        Assert.assertEquals(durationUpdatePassenger, nightCount);
        logger.info("Night Count Validation Success for Update Passenger Response and Night Count is: " + nightCount);

    }

    //Update Passenger ChoiceKey Validation
    public void updatePassengerChoiceKeyAssertion() {

        String choiceKeyUpdatePassenger = updatePassengerResponse.path("data[0].products[0].roomSet.choiceKey").toString();
        Assert.assertEquals(choiceKeyUpdatePassenger, choiceKeyCreateCart);
        logger.info("ChoiceKey Validation Success for Update Passenger Response and ChoiceKey is: " + choiceKeyCreateCart);

    }

    //Update Passenger Price Validation
    public void updatePassengerPriceAssertion() {

        totalPriceUpdatePassenger = (updatePassengerResponse.path(("data[0].products[0].roomSet.rate.price"))).toString();
        Assert.assertEquals(totalPriceUpdatePassenger, totalPrice);
        logger.info("Total Price Validation Success for Update Passenger Response and Total Price is: " + totalPrice);

    }

    //Update Passenger Room Type Validation
    public void updatePassengerRoomTypeAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].roomSet.rooms[0].typeName"), equalTo(roomType));
        logger.info("Room Type Validation Success for Update Passenger Response and Room Type is: " + roomType);
    }

    //Update Passenger Meal Plan Validation
    public void updatePassengerMealPlanAssertion() {

        updatePassengerResponse.then().body(("data[0].products[0].roomSet.rooms[0].mealPlanName"), equalTo(mealPlan));
        logger.info("Meal Plan Validation Success for Update Passenger Response" + " And Meal Plan is: " + mealPlan);
    }

    //Update Passenger Passenger Combination Validation
    public void updatePassengerPaxCombinationAssertion() {

        String adultCountUpdatePassengerResponse = Integer.toString((updatePassengerResponse.path(("data[0].products[0].travellerInfo.adult"))));
        Assert.assertEquals(adultCountUpdatePassengerResponse, adultCount);
        logger.info("Adult Count Validation Success for Update Passenger Response and Adult Count is: " + adultCount);

        int childCountUpdatePassengerResponse = createCartResponse.path(("data[0].products[0].travellerInfo.child"));
        Assert.assertEquals(childCountUpdatePassengerResponse, Integer.parseInt(childCount));
        logger.info("Child Count Validation Success for Update Passenger Response and Child Count is: " + childCount);


        int infantCountUpdatePassengerResponse = createCartResponse.path(("data[0].products[0].travellerInfo.infant"));
        Assert.assertEquals(infantCountUpdatePassengerResponse, Integer.parseInt(infantCount));
        logger.info("Infant Count Validation Success for Update Passenger Response and Infant Count is: " + infantCount);

    }

    //Create Payment Session Status Code Validation
    public void createPaymentSessionStatusCode(int statusCode) {

        createPaymentSessionResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Create Payment Session");
    }

    //Create Payment Session Price Validation
    public void createPaymentSessionPriceAssertion() {

        totalPriceCreatePaymentSession = (createPaymentSessionResponse.path(("data[0].total"))).toString();
        Assert.assertEquals(totalPriceUpdatePassenger, totalPrice);
        logger.info("Total Price Validation Success for Create Payment Session and Total Price is: " + totalPriceCreatePaymentSession);

    }

    //Create Payment Session Transaction Identifier Assertion
    public void createPaymentSessionCartIdAssertion() {

        transactionIdentifier = createPaymentSessionResponse.path("data[0].transactionIdentifier").toString();
        Assert.assertEquals(transactionIdentifier, cartId);
        logger.info("Transaction Identifier Validation success in Create Payment Session and Transaction Identifier is: " + transactionIdentifier);
    }

    //Capture Payment Status Code Validation
    public void capturePaymentStatusCode(int statusCode) {

        capturePaymentResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Capture Payment Response");
    }


    //Add Payments Status Code Validation
    public void addPaymentStatusCode(int statusCode) {

        addPaymentResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Add Payments Response");
    }

    //Confirm Cart Status Code Validation
    public void confirmCartStatusCode(int statusCode) {

        confirmCartResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Confirm Cart Response");
    }

    //Confirm Cart Booking Status
    public void confirmCartBookingStatus(String Confirmed) {

        confirmCartResponse.then().body(("data[0].summary.bookingStatusName"), equalTo(Confirmed));
        logger.info("Booking Status Validation Success for Confirm Cart Response and Booking Status is: " + Confirmed);
    }

    //Confirm Cart Hotel Name Assertion
    public void confirmCartHotelName() {

        confirmCartResponse.then().body(("data[0].products[0].summary.name"), equalTo(hotelName));
        logger.info("Hotel Name Validation Success for Confirm Cart Response and Hotel Name is: " + hotelName);
    }

    //Confirm Cart Hotel Code Assertion
    public void confirmCartHotelCode() {

        confirmCartResponse.then().body(("data[0].products[0].detail.hotelCode"), equalTo(hotelCode));
        logger.info("Hotel Code Validation Success for Confirm Cart Response and Hotel Code is: " + hotelCode);
    }

    //Confirm Cart Service Start Date Assertion
    public void confirmCartCheckInDate() {

        confirmCartResponse.then().body(("data[0].products[0].summary.serviceStartDate"), equalTo(serviceStartDate));
        logger.info("Service Start Date Validation Success for Confirm Cart Response and Start Date is: " + serviceStartDate);
    }

    //Confirm Cart Service End Date Assertion
    public void confirmCartCheckOutDate() {

        confirmCartResponse.then().body(("data[0].products[0].summary.serviceEndDate"), equalTo(serviceEndDate));
        logger.info("Service Start End Validation Success for Confirm Cart Response and End Date is :" + serviceEndDate);
    }

    //Confirm Cart Service Night Count Assertion
    public void confirmCartNightCount() {

        String durationConfirmCart = confirmCartResponse.path("data[0].products[0].summary.duration").toString();
        Assert.assertEquals(durationConfirmCart, nightCount);
        logger.info("Night Count Validation Success for Confirm Cart Response and Night Count is: " + nightCount);
    }

    //Confirm Cart Service Night Count Assertion
    public void confirmCartTotalPrice() {

        String totalConfirmCart = (confirmCartResponse.path(("data[0].products[0].roomSet.rate.price"))).toString();
        Assert.assertEquals(totalConfirmCart, totalPrice);
        logger.info("Total Price Validation Success for Confirm Cart Response and Total Price is: " + totalPrice);
    }

    //Confirm Cart Room Type Assertion
    public void confirmCartRoomType() {

        confirmCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].typeName"), equalTo(roomType));
        logger.info("Room Type Validation Success for Confirm Cart Response and Room Type is :" + roomType);
    }

    //Confirm Cart Meal Plan Assertion
    public void confirmCartMealPlan() {

        confirmCartResponse.then().body(("data[0].products[0].roomSet.rooms[0].mealPlanName"), equalTo(mealPlan));
        logger.info("Room Type Validation Success for Confirm Cart Response and Meal Plan is :" + mealPlan);
    }

    //Confirm Cart Passenger Assertion
    public void confirmCartPax() {

        String adultCountConfirmCartResponse = Integer.toString((confirmCartResponse.path(("data[0].products[0].travellerInfo.adult"))));
        Assert.assertEquals(adultCountConfirmCartResponse, adultCount);
        logger.info("Adult Count Validation Success for Confirm Cart Response and Adult Count is: " + adultCount);

        int childCountConfirmCartResponse = confirmCartResponse.path(("data[0].products[0].travellerInfo.child"));
        Assert.assertEquals(childCountConfirmCartResponse, Integer.parseInt(childCount));
        logger.info("Child Count Validation Success for Confirm Cart Response and Child Count is: " + childCount);

        int infantCountConfirmCartResponse = confirmCartResponse.path(("data[0].products[0].travellerInfo.infant"));
        Assert.assertEquals(infantCountConfirmCartResponse, Integer.parseInt(infantCount));
        logger.info("Infant Count Validation Success for Confirm Cart Response and Infant Count is: " + infantCount);

    }


    //Retrieve Status Code Validation
    public void retrieveStatusCode(int statusCode) {

        retrieveResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Retrieve Response");
    }

}
