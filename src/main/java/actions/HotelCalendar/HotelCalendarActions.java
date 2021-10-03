package actions.HotelCalendar;

import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonElement;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.json.JSONArray;
import utilities.Log;
import utilities.TimeHandler;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.HTLCalendar;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HotelCalendarActions {

    public static String hotelCalendarPrice;
    public static JsonObject HotelCalendarBody;
    public static String checkInDate;
    public static String checkOutDate;
    public static RequestSpecification requestSpecification;
    public static Response htlCalResponse;
    public static String htlCalDate;
    public static String htlCalPrice;
    final Logger logger = Log.getLogData(Log.class.getName());


    //Create Hotel Calendar Body
    public void HotelCalendarBody(String HotelID, int startDatesCount, int endDatesCount, String cityName, String currency) {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);

        JsonObject reqBody1 = new JsonObject();
        reqBody1.addProperty("cmp", "CT");
        reqBody1.addProperty("div", "CT_LON");
        reqBody1.addProperty("brand", "CT_OL");
        reqBody1.addProperty("channel", "U");
        reqBody1.addProperty("cliId", -1);
        reqBody1.addProperty("cliGrp", "Direct");
        reqBody1.addProperty("cliType", "DIRECT_CLIENT");
        reqBody1.addProperty("bkgType", "STD");
        reqBody1.addProperty("srcCountry", "GB");
        reqBody1.addProperty("cur", currency);
        reqBody1.addProperty("userId", 8778);
        reqBody1.addProperty("username", "codegen");

        JsonObject reqBody2 = new JsonObject();
        reqBody2.addProperty("city", cityName);
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

        htlCalResponse = requestSpecification.
                when().post(BaseEnvironmet + HTLCalendar);
        System.out.println(((RequestSpecificationImpl) requestSpecification).getBody());

//        htlCalResponse.prettyPrint();

    }

    //Store the price of the Hotel Calendar
    public void hotelCalendarPriceExtract() {

        hotelCalendarPrice = htlCalResponse.jsonPath().getString("data.products[0].dates[0][0].rateInfo.price");
        System.out.println("Price for " + checkInDate + " in Hotel Calendar is: " + hotelCalendarPrice);

    }

    //Get the Prices against the Dates in Cal
    public void htlCalPricing() {

        Gson htlGson = new Gson();
        JsonElement msd = htlGson.toJsonTree(htlCalResponse.jsonPath().getJsonObject("data[0].products[0].dates"));
        JsonArray priceArrayLength = msd.getAsJsonArray();
        logger.info("Date Count in Iteration is: " + priceArrayLength.size());

        for (int i = 0; i < priceArrayLength.size() - 1; i++) {

            htlCalDate = htlCalResponse.jsonPath().getString("data[0].products[0].dates[" + i + "].date");
            htlCalPrice = htlCalResponse.jsonPath().getString("data[0].products[0].dates[" + i + "].rateInfo.price");
            logger.info("Price for " + htlCalDate + " in Hotel Calendar is: " + htlCalPrice);

        }

    }


    //Hotel Calendar Hotel Code Validation
    public void htlCalendarProductCodeAssertion(String hotelId) {

        htlCalResponse.then().body(("data[0].products[0].hotelCode"), equalTo(hotelId));
        logger.info("Hotel Code Validation Success for Hotel Calendar Response & Hotel Code is: " + hotelId);

    }


    //Hotel Calendar Currency Code Validation
    public void htlCalendarCurrencyCodeAssertion(String currency) {

        htlCalResponse.then().body(("data[0].products[0].dates[0].rateInfo.currencyCode"), equalTo(currency));
        logger.info("Currency Code Validation Success for Hotel Calendar Response & Currency Code is: " + currency);

    }


//    -------------Excel Sheet Scenario----------------------


    //Create Hotel Calendar Body for Excel File
    public void HotelCalendarExcelBody(int startDatesCount, int endDatesCount) throws IOException {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        logger.info("Start Date for Hotel Calendar is: " + checkInDate);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);
        logger.info("End Date for Hotel Calendar is: " + checkOutDate);

        File file = new File("C:\\Users\\Lasan\\Downloads\\Cal_Codes.xls");

//        File file = new File("C:\\Users\\Lasan\\Desktop\\Viator_CNX_Policy\\Book1.csv");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xls file
        HSSFWorkbook wb = new HSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        HSSFSheet sheet = wb.getSheet("Cal_Codes");

        for (int i = 1; i < 10; i++) {
            //Create a row object to retrieve row at index 1
            HSSFRow row2 = sheet.getRow(i);

            //Create a cell object to retrieve cell at index 5
            HSSFCell cell = row2.getCell(0);

            //Get the address in a variable
            String hotelCodes = cell.getStringCellValue();
            logger.info("hotelCode is :" + hotelCodes);


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
            reqBody2.addProperty("endDate", checkOutDate);
            reqBody2.addProperty("hotelCode", hotelCodes);
            reqBody2.addProperty("startDate", checkInDate);

            HotelCalendarBody = new JsonObject();
            HotelCalendarBody.add("keyControls", reqBody1);
            HotelCalendarBody.add("payload", reqBody2);

            requestSpecification = given().contentType("application/json").body(HotelCalendarBody.toString());
            htlCalResponse = requestSpecification.
                    when().post("https://backend.travel.theculturetrip.com/hotel-search/v2/products/calendar");
            System.out.println(((RequestSpecificationImpl) requestSpecification).getBody());

            htlCalResponse.prettyPrint();
        }
    }


    //Create Generic Product for Excel File
    public void genViatorExcelBody(String productCode) throws IOException, InterruptedException {

        File file = new File("C:\\Users\\Lasan\\Desktop\\Viator_CNX_Policy\\57_60.xls");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //Creating workbook instance that refers to .xls file
        HSSFWorkbook wb = new HSSFWorkbook(inputStream);

        //Creating a Sheet object using the sheet Name
        HSSFSheet sheet = wb.getSheet("Book1");

        for (int i = 1; i < 2837; i++) {

            TimeUnit.MILLISECONDS.sleep(250);
            //Create a row object to retrieve row at index 1
            HSSFRow row2 = sheet.getRow(i);

            //Create a cell object to retrieve cell at index 5
            HSSFCell cell = row2.getCell(0);

            //Get the address in a variable
            productCode = cell.getStringCellValue();

            Response genViatorResponse = given()
                    .header("exp-api-key", "9572045f-0b56-42d1-8fdb-67263a73ff61")
                    .contentType(ContentType.JSON)
                    .when()
                    .get("http://viatorapi.viator.com/service/product?currencyCode=GBP&sortOrder=REVIEW_RATING_A&code=" + productCode + "&showUnavailability=false&excludeTourGradeAvailability=true");

            try {
                int len = genViatorResponse.jsonPath().getList("data.merchantTermsAndConditions.cancellationFromTourDate").size();

                for (int k = 0; k < len; k++) {

                    String code = genViatorResponse.jsonPath().getString("data.code");
                    String DATE_RANGE_MIN = genViatorResponse.jsonPath().getString("data.merchantTermsAndConditions.cancellationFromTourDate[" + k + "].dayRangeMin");
                    String DATE_RANGE_MAX = genViatorResponse.jsonPath().getString("data.merchantTermsAndConditions.cancellationFromTourDate[" + k + "].dayRangeMax");
                    String CNX_VALUE = genViatorResponse.jsonPath().getString("data.merchantTermsAndConditions.cancellationFromTourDate[" + k + "].percentageRefundable");
                    logger.info("2," + code + "," + DATE_RANGE_MIN + "," + DATE_RANGE_MAX + "," + CNX_VALUE + "," + "PERCENTAGE" + "," + code + ":" + k);

                }
            } catch (Exception e) {

            }


        }
    }


}