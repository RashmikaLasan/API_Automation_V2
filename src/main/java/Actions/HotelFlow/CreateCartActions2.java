package Actions.HotelFlow;

import Utilities.Log;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static Actions.HotelFlow.SearchActions1.keyControls;
import static Actions.HotelFlow.SearchActions1.payload;
import static Constants.EndPoints.BaseEnvironmet;
import static Constants.EndPoints.CreateCartURLPara;
import static io.restassured.RestAssured.given;

public class CreateCartActions2 {

    public static Response createCartResponse;
    public static JsonObject createCartBody;
    public static String cartId;
    public static String TravellersKeyOne;
    public static String TravellersKeyTwo;
    final Logger logger = Log.getLogData(Log.class.getName());

    //Create Cart Request Body
    public void createCartBody() {

        createCartBody = new JsonObject();
        createCartBody.add("keyControls", keyControls);
        createCartBody.add("payload", payload);

    }

    //Send Add to Cart Request
    public void sendCreateCartRequest() {

        createCartResponse = given().contentType("application/json").
                body(createCartBody.toString()).when().post(BaseEnvironmet + CreateCartURLPara);

//        createCartResponse.prettyPrint();

    }

    //Store the Cart ID
    public void storeCartId() {

        cartId = createCartResponse.path("data[0].summary.id").toString();
        logger.info("Cart ID is: " + cartId + " in Create Cart Response");

    }

    //Store the Travellers Key of First Passenger
    public void storeTravellersKeyOne() {

        TravellersKeyOne = createCartResponse.path("data[0].travellers[0].key").toString();
        logger.info("Travellers Key one is: " + TravellersKeyOne + " in Create Cart Response");

    }

    //Store the Travellers Key of Second Passenger
    public void storeTravellersKeyTwo() {

        TravellersKeyTwo = createCartResponse.path("data[0].travellers[1].key").toString();
        logger.info("Travellers Key one is: " + TravellersKeyTwo + " in Create Cart Response");

    }

}
