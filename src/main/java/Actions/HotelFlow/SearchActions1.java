package Actions.HotelFlow;

import Utilities.Log;
import Utilities.TimeHandler;
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
    public static Response searchResponse;
    public static String checkinDate;
    public static JsonElement keyControls;
    public static JsonElement payload;
    public static String hotelName;
    public static String hotelCode;
    public static String serviceStartDate;
    public static String serviceEndDate;
    public static String nightCount;
    public static String choiceKey;
    public static String totalPrice;
    public static String roomType;
    public static String mealPlan;
    public static String adultCount;
    public static String childCount;
    public static String infantCount;

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
                queryParam("nights", nightCount).
                queryParam("adult", "2~30~1990-01-01~1");

        logger.info("Get Request Parameters Created");
    }


    //Send the Get Search Request
    public void sendSearchRequest() {

        searchResponse = requestSpecification.
                when().get(BaseEnvironmet + SearchURLPara);
        logger.info(requestSpecification + BaseEnvironmet + SearchURLPara);
        logger.info("Search Request Send");
//        searchResponse.prettyPrint();

    }

    //Store Key Controls
    public void storeKeyControls() {

        Gson gson = new Gson();
        keyControls = gson.toJsonTree(searchResponse.jsonPath().getJsonObject("keyControls"));
        logger.info("Key Controls are : ----->" + keyControls);
    }

    //Store Payload
    public void storePayload() {

        Gson gson = new Gson();
        payload = gson.toJsonTree(searchResponse.jsonPath().getJsonObject("data[0]"));
        logger.info("Payload is : -----> " + payload);

    }

    //Store Hotel Name
    public void storeHotelName() {

        hotelName = searchResponse.path("data[0].summary.name").toString();
        logger.info("Hotel Name is: " + hotelName + " in Search");
    }

    //Store Hotel Code
    public void storeHotelCode() {

        hotelCode = searchResponse.path("data[0].detail.hotelCode").toString();
        logger.info("Hotel Code is: " + hotelCode + " in Search");
    }

    //Store Start Date
    public void storeStartDate() {

        serviceStartDate = searchResponse.path("data[0].summary.serviceStartDate").toString();
        logger.info("Start Date is: " + serviceStartDate + " in Search");
    }

    //Store End Date
    public void storeEndDate() {

        serviceEndDate = searchResponse.path("data[0].summary.serviceEndDate").toString();
        logger.info("End Date is: " + serviceEndDate + " in Search");
    }

    //Store Night Count
    public void storeNightsDate() {

        nightCount = searchResponse.path("data[0].summary.duration").toString();
        logger.info("Night Count is: " + nightCount + " in Search");
    }

    //Store Choice Key
    public void storeChoiceKey() {

        choiceKey = searchResponse.path("data[0].roomSet.choiceKey").toString().substring(6);
        logger.info("Choice Key is: HTL__0" + choiceKey + " in Search");
    }

    //Store Total Price
    public void storePrice() {

        totalPrice = searchResponse.path("data[0].roomSet.rate.price").toString();
        logger.info("Total Price is: " + totalPrice + " in Search");
    }

    //Store Room Type
    public void storeRoomType() {

        roomType = searchResponse.path("data[0].roomSet.rooms[0].typeName").toString();
        logger.info("Room Type is: " + roomType + " in Search");
    }

    //Store Meal Plan
    public void storeMealPlan() {

        mealPlan = searchResponse.path("data[0].roomSet.rooms[0].mealPlanName").toString();
        logger.info("Meal Plan is: " + mealPlan + " in Search");
    }

    //Store Pax Combination
    public void storePaxCombination() {

        adultCount = searchResponse.path("data[0].roomSet.rooms[0].travellerInfo.adult").toString();
        logger.info("Adult Count is: " + adultCount + " in Search");

        childCount = searchResponse.path("data[0].roomSet.rooms[0].travellerInfo.child").toString();
        logger.info("Child Count is: " + childCount + " in Search");

        infantCount = searchResponse.path("data[0].roomSet.rooms[0].travellerInfo.infant").toString();
        logger.info("Infant Count is: " + infantCount + " in Search");
    }

}