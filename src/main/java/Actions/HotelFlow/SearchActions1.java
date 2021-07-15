package Actions.HotelFlow;

import Utilities.Log;
import Utilities.TimeHandler;
import com.fasterxml.jackson.databind.JsonNode;
import com.jayway.jsonpath.JsonPath;
import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.JsonElement;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.SearchURLPara;
import static io.restassured.RestAssured.given;

public class SearchActions1 {
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static String checkinDate;
    public static JsonElement keyControls;
    public static JsonElement payload;
    public static String hotelName;
    public static String hotelCode;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Hotel Search Cart Creation
    public void searchRequestCreate(int futureDateCount, String nightCount, String hotelCode, String city) {

        checkinDate = TimeHandler.TravelDateOne(futureDateCount);


        requestSpecification = given().
                queryParam("cmp", "CT").
                queryParam("channel", "U").
                queryParam("bkgType", "STD").
                queryParam("cliGrp", "Direct").
                queryParam("cliId", -1).
                queryParam("cliType", "DIRECT_CLIENT").
                queryParam("cur", "GBP").
                queryParam("srcCountry", "GB").
                queryParam("userId", 8778).
                queryParam("username", "codegen").
                queryParam("div", "CTDIV_LON").
                queryParam("brand", "CT").
                queryParam("tax", "true").
                queryParam("quote", "false").
                queryParam("tbxResults", "false").
                queryParam("h2hResult", "true").
                queryParam("expand", "all").
                queryParam("hotelCode", hotelCode).
                queryParam("city", city).
                queryParam("startDate", checkinDate).
                queryParam("nights", 3).
                queryParam("adult", "2~30~1990-01-01~1");

        logger.info("Body Created");
    }


    //Send the Get Search Request
    public void sendSearchRequest() {

        response = requestSpecification.
                when().get(BaseEnvironmet + SearchURLPara);
        logger.info("Search Request Send");
//        response.prettyPrint();

    }

    //Store Key Controls
    public void storeKeyControls() {

        Gson gson = new Gson();
        keyControls = gson.toJsonTree(response.jsonPath().getJsonObject("keyControls"));
        logger.info("Key Controls are : ----->" + keyControls);
    }

    //Store Payload
    public void storePayload() {

        Gson gson = new Gson();
        payload = gson.toJsonTree(response.jsonPath().getJsonObject("data[0]"));
        logger.info("Payload is : -----> " + payload);

    }

    //Store Hotel Name
    public void storeHotelName() {

        hotelName = response.path("data[0].summary.name").toString();
        logger.info("Hotel Name is: " + hotelName);
    }

    //Store Hotel Code
    public void storeHotelCode() {

        hotelCode = response.path("data[0].detail.hotelCode").toString();
        logger.info("Hotel Code is: " + hotelCode);
    }

}