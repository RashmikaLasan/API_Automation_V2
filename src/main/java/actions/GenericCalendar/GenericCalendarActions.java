package actions.GenericCalendar;

import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonElement;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import utilities.Log;
import utilities.TimeHandler;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.GENCalendar;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GenericCalendarActions {

    public static String checkInDate;
    public static String checkOutDate;
    public static RequestSpecification requestSpecification;
    public static Response genCalResponse;
    public static String genCalPrice;
    public static String genCalDate;
    final Logger logger = Log.getLogData(Log.class.getName());


    public void setRequest(String productID, int startDatesCount, int endDatesCount) {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);


        genCalResponse = given().
                queryParam("cmp", "CT").
                queryParam("channel", "U").
                queryParam("brand", "CT_OL").
                queryParam("div", "CT_LON").
                queryParam("cur", "GBP").
                queryParam("bkgType", "STD").
                queryParam("cliGrp", "Direct").
                queryParam("cliType", "DIRECT_CLIENT").
                queryParam("srcCountry", "GB").
                queryParam("cliId", -1).
                queryParam("fromDate", checkInDate).
                queryParam("toDate", checkOutDate).
                queryParam("supplierCodes", productID).
                queryParam("searchType", "CACHE_AND_LIVE_SEARCH").
                when().get(BaseEnvironmet + GENCalendar);
//        genCalResponse.prettyPrint();
        logger.info(BaseEnvironmet + GENCalendar + "?cmp=CT&channel=U&brand=CT&div=CTDIV_LON&cur=GBP&bkgType=STD&cliGrp=Direct&cliId=-1&cliType=DIRECT_CLIENT&srcCountry=GB&searchType=CACHE_AND_LIVE_SEARCH&supplierCodes=" + productID + "&fromDate=" + checkInDate + "&toDate=" + checkOutDate);

    }

    //Gen Calendar Status Code Validation
    public void genCalendarStatusCode(int statusCode) {

        genCalResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Gen Calendar Response");
    }

    //Gen Calendar Product Name Validation
    public void genCalendarProductNameAssertion(String productName) {

        genCalResponse.then().body(("data[0].products[0].supplierName"), equalTo(productName));
        logger.info("Product Name Validation Success for Gen Calendar Response & Product Name is: " + productName);

    }

    //Gen Calendar Product Code Validation
    public void genCalendarProductCodeAssertion(String productId) {

        genCalResponse.then().body(("data[0].products[0].supplierCode"), equalTo(productId));
        logger.info("Product Code Validation Success for Gen Calendar Response & Product Code is: " + productId);

    }

    //Get the Prices against the Dates
    public void genCalPricing() {

        Gson gson = new Gson();
        JsonElement msd = gson.toJsonTree(genCalResponse.jsonPath().getJsonObject("data[0].products[0].dates"));
        JsonArray priceArrayLength = msd.getAsJsonArray();
        logger.info("Date Count in Iteration is: " + priceArrayLength.size());

        for (int i = 0; i < priceArrayLength.size() - 1; i++) {

            genCalDate = genCalResponse.jsonPath().getString("data[0].products[0].dates[" + i + "].date");
            genCalPrice = genCalResponse.jsonPath().getString("data[0].products[0].dates[" + i + "].rateInfo.price");
            logger.info("Price for " + genCalDate + " in Gen Calendar is: " + genCalPrice);

        }

    }
}
