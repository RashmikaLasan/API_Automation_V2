package actions.GenericFlow;

import utilities.Log;
import utilities.TimeHandler;
import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.JsonElement;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import static constants.EndPoints.*;
import static io.restassured.RestAssured.given;

public class GenericSearchAction1 {

    public static RequestSpecification genericRequestSpecification;
    public Response genericSearchResponse;
    public static String checkinDate;
    public static JsonElement genericKeyControls;
    public static JsonElement genericPayload;
    public static String productName;
    public static String productCode;
    public static String genericServiceStartDate;
    public static String genericServiceEndDate;
    public static String genericTourDuration;
    public static String genericChoiceKey;
    public static double genericTotalPrice;
    public static String genericCategoryCode;
    public static String genericCategoryName;
    public static String adultCountGen;
    public static String childCountGen;
    public static String infantCountGen;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Hotel Search Parameters create
    public void genericSearchRequestCreate(int futureDateCount, String productCode, String city) {

        checkinDate = TimeHandler.TravelDateOne(futureDateCount);

        logger.info(BaseEnvironmet + SearchURLParaGen + "?cmp=CT&channel=U&brand=CT&div=CTDIV_LON&cur=GBP&bkgType=STD&cliGrp=Direct&cliId=-1&cliType=DIRECT_CLIENT&srcCountry=GB&userId=8778&username=codegen&tax=true&quote=false&tbxResults=false&h2hResult=true&expand=all&adult=2~31~1990-01-01~1&supplier=" + productCode + "&city=" + city + "&startDate=" + checkinDate);

        genericRequestSpecification = given().
                queryParam("cmp", "CT").
                queryParam("channel", "U").
                queryParam("brand", "CT").
                queryParam("div", "CTDIV_LON").
                queryParam("cur", "GBP").
                queryParam("bkgType", "STD").
                queryParam("cliGrp", "Direct").
                queryParam("cliId", -1).
                queryParam("cliType", "DIRECT_CLIENT").
                queryParam("srcCountry", "GB").
                queryParam("userId", 8778).
                queryParam("username", "codegen").
                queryParam("tax", "true").
                queryParam("quote", "false").
                queryParam("tbxResults", "false").
                queryParam("h2hResult", "true").
                queryParam("expand", "all").
                queryParam("supplier", productCode).
                queryParam("city", city).
                queryParam("startDate", checkinDate).
                queryParam("adult", "2~31~1990-01-01~1");

    }

    //Send the Get Search Generic Request
    public void sendSearchRequest() {

        genericSearchResponse = genericRequestSpecification.
                when().get(BaseEnvironmet + SearchURLParaGen);


        logger.info("Generic Search Request Sent");

    }

    //Generic Search Status Code Validation
    public void hotelSearchStatusCode(int statusCode) {

        genericSearchResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Search Response");

    }

    //Store Key Controls of Generic Search
    public void storeGenericKeyControls() {

        Gson gson = new Gson();
        genericKeyControls = gson.toJsonTree(genericSearchResponse.jsonPath().getJsonObject("keyControls"));
        logger.info("Generic Key Controls are : -----> " + genericKeyControls);
    }

    //Store  Payload of Generic Search
    public void storeGenericPayload() {

        Gson gson = new Gson();
        genericPayload = gson.toJsonTree(genericSearchResponse.jsonPath().getJsonObject("data[0]"));
        logger.info("Generic Payload is : -----> " + genericPayload);

    }

    //Store Product Name
    public void storeProductName() {

        productName = genericSearchResponse.path("data[0].summary.name").toString();
        logger.info("Product Name in Generic Search is: " + productName);
    }

    //Store Product Code
    public void storeProductCode() {

        productCode = genericSearchResponse.path("data[0].source.supplier.code").toString();
        logger.info("Product Code  in Generic Search is: " + productCode);
    }

    //Store Generic Start Date
    public void storeGenericStartDate() {

        genericServiceStartDate = genericSearchResponse.path("data[0].summary.serviceStartDate").toString();
        logger.info("Start Date is in Generic Search is: " + genericServiceStartDate);
    }

    //Store Generic End Date
    public void storeGenericEndDate() {

        genericServiceEndDate = genericSearchResponse.path("data[0].summary.serviceEndDate").toString();
        logger.info("End Date is in Generic Search is: " + genericServiceEndDate);
    }

    //Store Tour Duration
    public void storeTourDuration() {

        genericTourDuration = genericSearchResponse.path("data[0].summary.durationDescription").toString();
        logger.info("Duration in Generic Search is: " + genericTourDuration);
    }

    //Store Generic Choice Key
    public void storeGenericChoiceKey() {

        genericChoiceKey = genericSearchResponse.path("data[0].category.choiceKey").toString().substring(6);
        logger.info("Choice Key in Generic Search is GEN~0~" + genericChoiceKey);
    }

    //Store Generic Total Price
    public void storeGenericPrice() {

        String genericTotalPriceString = genericSearchResponse.path("data[0].category.rate.price").toString();
        genericTotalPrice = Double.parseDouble(genericTotalPriceString);
        logger.info("Total Price in Generic Search is: " + genericTotalPrice);
    }

    //Store Generic Category Code
    public void storeGenericCategoryCode() {

        genericCategoryCode = genericSearchResponse.path("data[0].category.categoryCode").toString();
        logger.info("Category Code in Generic Search is: " + genericCategoryCode);
    }

    //Store Generic Category Name
    public void storeGenericCategoryName() {

        genericCategoryName = genericSearchResponse.path("data[0].category.categoryName").toString();
        logger.info("Category Name in Generic Search is: " + genericCategoryName);
    }

    //Store Pax Combination in Generic Search
    public void storeGenericPaxCombination() {

        adultCountGen = genericSearchResponse.path("data[0].travellerInfo.adult").toString();
        logger.info("Adult Count in Generic Search is: " + adultCountGen);

        childCountGen = genericSearchResponse.path("data[0].travellerInfo.child").toString();
        logger.info("Child Count in Generic Search is: " + childCountGen);

        infantCountGen = genericSearchResponse.path("data[0].travellerInfo.infant").toString();
        logger.info("Infant Count in Generic Search is: " + infantCountGen);
    }
}
