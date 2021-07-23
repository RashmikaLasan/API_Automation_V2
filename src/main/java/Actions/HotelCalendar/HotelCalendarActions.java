package Actions.HotelCalendar;

import Utilities.Log;
import Utilities.TimeHandler;
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
import java.io.FileNotFoundException;
import java.io.IOException;

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
    final Logger logger = Log.getLogData(Log.class.getName());


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
    public void hotelCalendarPriceExtract() {

        hotelCalendarPrice = response.jsonPath().getString("data.products[0].dates[0][0].rateInfo.price");
        System.out.println("Price for " + checkInDate + " in Hotel Calendar is: " + hotelCalendarPrice);

    }


    //Create Hotel Calendar Body for Excel File
    public void HotelCalendarExcelBody(int startDatesCount, int endDatesCount) throws IOException {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        logger.info("Start Date for Hotel Calendar is: " + checkInDate);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);
        logger.info("End Date for Hotel Calendar is: " + checkOutDate);

        File file = new File("C:\\Users\\Lasan\\Downloads\\Cal_Codes.xls");

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
            response = requestSpecification.
                    when().post("https://backend.travel.theculturetrip.com/hotel-search/v2/products/calendar");
            System.out.println(((RequestSpecificationImpl) requestSpecification).getBody());

            response.prettyPrint();
        }
    }


}