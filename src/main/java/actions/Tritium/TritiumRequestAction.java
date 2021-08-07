package actions.Tritium;

import utilities.Log;
import utilities.TimeHandler;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonPrimitive;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import static constants.EndPoints.TritiumURL;
import static io.restassured.RestAssured.given;

public class TritiumRequestAction {

    public static String GenCalPrice;
    public static String ViatorPricingMatrixPrice;
    public static String tritiumPrice;
    public static String TritStartDate;
    public static String TritEndDate;
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static String checkInDate;
    public static String checkOutDate;
    public static JsonObject reqBody;
    final Logger logger = Log.getLogData(Log.class.getName());


    public static void TritiumReqBody(String hotelID, int startDatesCount, int endDatesCount) {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);

        JsonObject reqBody1 = new JsonObject();
        reqBody1.addProperty("checkIn", checkInDate);
        reqBody1.addProperty("checkOut", checkOutDate);

        JsonObject reqBody2 = new JsonObject();
        reqBody2.addProperty("key", "sourceMarket");
        reqBody2.addProperty("value", "GB");

        JsonArray control = new JsonArray();
        control.add(reqBody2);

        JsonObject reqBody3 = new JsonObject();
        reqBody3.addProperty("infants", "0");
        reqBody3.addProperty("children", "0");
        reqBody3.addProperty("adults", "1");

        JsonArray roomsInfo = new JsonArray();
        roomsInfo.add(reqBody3);

        JsonArray jArray = new JsonArray();
        JsonPrimitive element = new JsonPrimitive(hotelID);
        jArray.add(element);


        JsonObject reqBody5 = new JsonObject();
        reqBody5.add("codes", jArray);


        reqBody = new JsonObject();
        reqBody.add("hotels", reqBody5);
        reqBody.addProperty("rateCategory", "PKG");
        reqBody.add("stayPeriod", reqBody1);
        reqBody.add("control", control);
        reqBody.add("roomsInfo", roomsInfo);

    }


    public static void sendTritiumRequest() {

        requestSpecification = given().
                contentType("application/json").
                body(reqBody.toString()).
                headers("user-key", "TEST_CT_2").
                headers("user-sig", "32e4b79370c0539efa1c3b3283095f7f193ed21233006026cdd69ccf51e6e874").
                header("timestamp", "1611779786").
                headers("Accept", "application/json").
                headers("Content-Type", "application/json");

    }

    public void getTritiumResponse() {

        response = requestSpecification.
                when().
                post(TritiumURL);
        logger.info(((RequestSpecificationImpl) requestSpecification).getBody());
        response.prettyPrint();

    }

    public void getPriceFromResponse() {

        tritiumPrice = response.jsonPath().getString("availability.hotels[0].rooms[0].rates[0].rate");
        logger.info("Price in Tritium Response for : "+ checkInDate +" is " + tritiumPrice);

    }
}
