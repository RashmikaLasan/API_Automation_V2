package Actions.HotelCalendar;

import Utilities.TimeHandler;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.HTLCalendar;
import static io.restassured.RestAssured.given;

public class HotelCalendarActions {

    public static String hotelCalendarPrice;
    public static JsonObject HotelCalendarBody;
    public static String checkInDate;
    public static String checkOutDate;
    public static RequestSpecification requestSpecification;
    public static Response response;


    //Create Hotel Calendar Body
    public void HotelCalendarBody(String HotelID, int startDatesCount, int endDatesCount,  String CityName) {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);

        JsonObject reqBody1 = new JsonObject();
        reqBody1.addProperty("cmp", "CT");
        reqBody1.addProperty("div", "CT_LON");
        reqBody1.addProperty("brand", "CT_OL");
        reqBody1.addProperty("channel", "U");
        reqBody1.addProperty("cliId", 10541);
        reqBody1.addProperty("cliGrp", "Direct");
        reqBody1.addProperty("cliType", "DIRECT_CLIENT");
        reqBody1.addProperty("bkgType", "STD");
        reqBody1.addProperty("srcCountry", "GB");
        reqBody1.addProperty("cur", "USD");
        reqBody1.addProperty("userId", 8778);
        reqBody1.addProperty("username", "codegen");

        JsonObject reqBody2 = new JsonObject();
        reqBody2.addProperty("city", CityName);
        reqBody2.addProperty("endDate", checkOutDate);
        reqBody2.addProperty("hotelCode", HotelID);
        reqBody2.addProperty("startDate", checkInDate);

        HotelCalendarBody = new JsonObject();
        HotelCalendarBody.add("keyControls", reqBody1);
        HotelCalendarBody.add("payload", reqBody2);

    }

    //Send the Hotel Calendar Request
    public void sendHotelCalendarRequest(){

        requestSpecification = given().contentType("application/json").body(HotelCalendarBody.toString());

    }

    //Print the Hotel Calendar Response
    public void getHotelCalendarResponse() {

        response = requestSpecification.
                when().post(BaseEnvironmet + HTLCalendar);
        System.out.println(((RequestSpecificationImpl) requestSpecification).getBody());

        response.prettyPrint();

    }

    //Store the price of the Hotel Calendar
    public void hotelCalendarPriceExtract(){

        hotelCalendarPrice = response.jsonPath().getString("data.products[0].dates[0][0].rateInfo.price");
        System.out.println("Price for " + checkInDate + " in Hotel Calendar is: "+ hotelCalendarPrice);

    }
}