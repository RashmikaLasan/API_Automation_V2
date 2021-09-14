package actions.GenericCalendar;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.TimeHandler;

import java.time.LocalDate;

import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.GENCalendar;
import static io.restassured.RestAssured.given;

public class GenericCalendarActions {

    public static String checkInDate;
    public static String checkOutDate;
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static String GenCalPrice;


    public void setRequest(String productID, int startDatesCount, int endDatesCount) {

        checkInDate = TimeHandler.TravelDateOne(startDatesCount);
        checkOutDate = TimeHandler.TravelDateTwo(endDatesCount);


        response = given().
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
        response.prettyPrint();
        System.out.println(BaseEnvironmet + GENCalendar + "?cmp=CT&channel=U&brand=CT&div=CTDIV_LON&cur=GBP&bkgType=STD&cliGrp=Direct&cliId=-1&cliType=DIRECT_CLIENT&srcCountry=GB&searchType=CACHE_AND_LIVE_SEARCH&supplierCodes=" + productID + "&fromDate=" + checkInDate + "&toDate=" + checkOutDate);


        GenCalPrice = response.jsonPath().getString("data[0].products[0].dates[0].rateInfo.price");
        System.out.println("Price for " + checkInDate + " in Gen Calendar is: " + GenCalPrice);


    }

}
