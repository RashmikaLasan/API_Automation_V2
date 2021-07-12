package Actions.HotelFlow;

import Utilities.TimeHandler;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.SearchURLPara;
import static io.restassured.RestAssured.given;

public class SearchActions1 {
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static String checkinDate;


    public void SearchRequestCreate(int FutureDateCount, String NightCount, String HotelCode, String City) {

        checkinDate = TimeHandler.TravelDateOne(FutureDateCount);


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
                queryParam("hotelCode", HotelCode).
                queryParam("city", City).
                queryParam("startDate", checkinDate).
                queryParam("nights", 3).
                queryParam("adult", "2~30~1990-01-01~1");
    }


    public void SendSearchRequest() {

        response = requestSpecification.
                when().get(BaseEnvironmet + SearchURLPara);
        response.prettyPrint();

    }

}
