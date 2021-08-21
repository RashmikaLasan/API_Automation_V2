package actions.GenericFlow;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import utilities.Log;
import static actions.GenericFlow.GenericSearchAction1.*;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.CreateCartURLPara;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GenericCreateCartAction2 {
    public static Response genericCreateCartResponse;
    public static JsonObject genericCreateCartBody;
    public static String cartId;
    public static String TravellersKeyOne;
    public static String TravellersKeyTwo;
    final Logger logger = Log.getLogData(Log.class.getName());

    //Create Cart Request Body in Generic Create Cart
    public void createGenCartBody() {

        genericCreateCartBody = new JsonObject();
        genericCreateCartBody.add("keyControls", genericKeyControls);
        genericCreateCartBody.add("payload", genericPayload);

    }

    //Send Add to Cart Request in Generic Create Cart
    public void sendGenCreateCartRequest() {

        genericCreateCartResponse = given().contentType("application/json").
                body(genericCreateCartBody.toString()).when().post(BaseEnvironmet + CreateCartURLPara);

//        genericCreateCartResponse.prettyPrint();

    }

    //Generic Search Status Code Validation
    public void hotelSearchStatusCode(int statusCode) {

        genericCreateCartResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Create Cart Response");

    }

    //Store the Cart ID in Generic Create Cart
    public void storeGenCartId() {

        cartId = genericCreateCartResponse.path("data[0].summary.id").toString();
        logger.info("Cart ID in Generic Create Cart Response is: " + cartId);

    }

    //Store the Travellers Key of First Passenger in Generic Create Cart
    public void storeGenTravellersKeyOne() {

        TravellersKeyOne = genericCreateCartResponse.path("data[0].travellers[0].key").toString();
        logger.info("Travellers Key one  in Generic Create Cart Response is :" + TravellersKeyOne);

    }

    //Store the Travellers Key of Second Passenger in Generic Create Cart
    public void storeGenTravellersKeyTwo() {

        TravellersKeyTwo = genericCreateCartResponse.path("data[0].travellers[1].key").toString();
        logger.info("Travellers Key one  in Generic Create Cart Response is: " + TravellersKeyTwo);

    }

    //Create Cart Product Name Validation
    public void createCartGenProductNameAssertion() {

        genericCreateCartResponse.then().body(("data[0].products[0].summary.name"), equalTo(productName));
        logger.info("Product Name Validation Success for Generic Create Cart Response");

    }

    //Create Cart Product Code Validation
    public void createCartGenProductCodeAssertion() {

        genericCreateCartResponse.then().body(("data[0].products[0].source.supplier.code"), equalTo(productCode.substring(2)));
        logger.info("Product Code Validation Success for Generic Create Cart Response");
    }

    //Create Cart Service Start Date Validation
    public void createCartGenStartDateAssertion() {

        genericCreateCartResponse.then().body(("data[0].summary.returnDate"), equalTo(genericServiceStartDate));
        logger.info("Service Start Date Validation Success for Generic Create Cart Response");
    }

    //Create Cart Service Start Date Validation
    public void createCartGenEndDateAssertion() {

        genericCreateCartResponse.then().body(("data[0].summary.departureDate"), equalTo(genericServiceEndDate));
        logger.info("Service End Date Validation Success for Generic Create Cart Response");
    }

    //Create Cart Duration Validation
//    public void createCartGenDurationAssertion() {
//
//        genericCreateCartResponse.then().body(("data[0].summary.durationDescription"), equalTo(genericTourDuration));
//        logger.info("Duration Validation Success for Generic Create Cart Response");
//    }

    //Create Cart Price Validation
    public void createCartGenPriceAssertion() {

        genericCreateCartResponse.then().body(("data[0].summary.rate.price"), equalTo((float) genericTotalPrice));
        logger.info("Price Validation Success for Generic Create Cart Response");

    }

    //Create Cart Category Code Validation
    public void createCartGenCategoryCodeAssertion() {

        genericCreateCartResponse.then().body(("data[0].products[0].category.categoryCode"), equalTo(genericCategoryCode));
        logger.info("Category Code Validation Success for Generic Create Cart Response");
    }

    //Create Cart Category Name Validation
    public void createCartGenCategoryNameAssertion() {

        genericCreateCartResponse.then().body(("data[0].products[0].category.categoryName"), equalTo(genericCategoryName));
        logger.info("Category Name Validation Success for Generic Create Cart Response");
    }

}