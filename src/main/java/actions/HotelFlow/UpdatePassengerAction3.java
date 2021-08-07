package actions.HotelFlow;

import utilities.Log;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static actions.HotelFlow.CreateCartActions2.*;
import static actions.HotelFlow.SearchActions1.keyControls;
import static constants.EndPoints.*;
import static io.restassured.RestAssured.given;

public class UpdatePassengerAction3 {

    public static Response updatePassengerResponse;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonArray Contact;
    public JsonArray Addresses;
    public JsonObject profile1;
    public JsonObject reference1;
    public JsonObject reference2;
    public JsonObject payload1;
    public JsonObject payload2;
    public JsonObject updatePassengerBody;
    public JsonArray payloadBody;


    //Create Update Passenger Body
    public void createContactBody() {

        //Create Contact Body for Contact1
        JsonObject Contact1 = new JsonObject();
        Contact1.addProperty("contactNo", 1);
        Contact1.addProperty("contactType", "Telephone");
        Contact1.addProperty("value", "+94711996777");
        Contact1.addProperty("main", true);
        Contact1.addProperty("preferred", true);


        //Create Contact Body for Contact2
        JsonObject Contact2 = new JsonObject();
        Contact2.addProperty("contactNo", 2);
        Contact2.addProperty("contactType", "E-mail");
        Contact2.addProperty("value", "lasanrash@gmail.com");
        Contact2.addProperty("main", false);
        Contact2.addProperty("preferred", false);

        //Aggregate Contacts
        Contact = new JsonArray();
        Contact.add(Contact1);
        Contact.add(Contact2);
        logger.info("Contact is: " + Contact);
    }

    //Create Address Body Elements
    public void createAddressBody() {

        JsonObject Address = new JsonObject();
        Address.addProperty("no", 0);
        Address.addProperty("street", "MEL");
        Address.addProperty("city", "MEL");
        Address.addProperty("county", "");
        Address.addProperty("postalCode", "81000");
        Address.addProperty("country", "AU");
        Address.addProperty("main", true);
        Address.addProperty("houseNo", "travelnow");
        Address.addProperty("category", 0);
        Address.addProperty("external", false);
        Address.add("contacts", Contact);


        //Aggregate Address Elements
        Addresses = new JsonArray();
        Addresses.add(Address);
        logger.info("Addresses is :" + Addresses);

    }

    //Create Profile Elements
    public void createProfileBody() {

        //Frequent Fly Number and Membership Elements Create
        JsonArray frequentFlyerNumbers1 = new JsonArray();
        JsonArray memberships1 = new JsonArray();

        //Create Profile Body
        profile1 = new JsonObject();
        profile1.addProperty("title", "Mr");
        profile1.addProperty("firstName", "Lasan");
        profile1.addProperty("middleName", "LR");
        profile1.addProperty("lastName", "Rashmika");
        profile1.addProperty("type", "A");
        profile1.addProperty("subType", "A");
        profile1.addProperty("dob", "1990-01-01");
        profile1.addProperty("dobUnknown", false);
        profile1.addProperty("age", 31);
        profile1.addProperty("gender", "M");
        profile1.addProperty("vip", false);
        profile1.addProperty("smoker", false);
        profile1.addProperty("dummy", false);
        profile1.add("addresses", Addresses);
        profile1.add("frequentFlyerNumbers", frequentFlyerNumbers1);
        profile1.add("memberships", memberships1);

        logger.info("Profile is: " + profile1);

    }

    //Create Reference Body
    public void createReference() {

        //Create External Reference-Array Body
        JsonArray externalRefs1 = new JsonArray();
        JsonArray externalRefs2 = new JsonArray();

        //Create External Reference for Passenger One
        reference1 = new JsonObject();
        reference1.addProperty("key", TravellersKeyOne);
        reference1.add("externalRefs", externalRefs1);
        logger.info("Reference for Passenger One :" + reference1);

        //Create External Reference for Passenger Two
        reference2 = new JsonObject();
        reference2.addProperty("key", TravellersKeyTwo);
        reference2.add("externalRefs", externalRefs2);
        logger.info("Reference for Passenger Two :" + reference2);

    }

    //Create Payload Body of Passenger One
    public void createPayloadBodyOne() {

        payload1 = new JsonObject();
        payload1.addProperty("key", TravellersKeyOne);
        payload1.addProperty("no", 1);
        payload1.addProperty("lead", true);
        payload1.addProperty("driver", false);
        payload1.addProperty("activeForBooking", true);
        payload1.addProperty("refuseInsurance", false);
        payload1.addProperty("infantSeatRequired", false);
        payload1.addProperty("primaryPpForBooking", false);
        payload1.addProperty("endorsedPpForBooking", false);
        payload1.addProperty("endorsedPassengerNo", 0);
        payload1.addProperty("refuseInsurance", false);
        payload1.addProperty("allocatedForBooking", false);
        payload1.add("profile", profile1);
        payload1.add("reference", reference1);

    }

    //Create Payload Body of Passenger Two
    public void createPayloadBodyTwo() {

        payload2 = new JsonObject();
        payload2.addProperty("key", TravellersKeyTwo);
        payload2.addProperty("no", 2);
        payload2.addProperty("lead", false);
        payload2.addProperty("driver", false);
        payload2.addProperty("activeForBooking", true);
        payload2.addProperty("refuseInsurance", false);
        payload2.addProperty("infantSeatRequired", false);
        payload2.addProperty("primaryPpForBooking", false);
        payload2.addProperty("endorsedPpForBooking", false);
        payload2.addProperty("endorsedPassengerNo", 0);
        payload2.addProperty("refuseInsurance", false);
        payload2.addProperty("allocatedForBooking", false);
        payload2.add("profile", profile1);
        payload2.add("reference", reference2);
    }

    //Payload Full Body Create
    public void payloadFullBody() {

        payloadBody = new JsonArray();
        payloadBody.add(payload1);
        logger.info("payload1 is  " + payload1);
        payloadBody.add(payload2);
        logger.info("payload2 is " + payload2);

    }

    //Update Passenger Full Body Merge
    public void updatePassengerFullBody() {

        updatePassengerBody = new JsonObject();
        updatePassengerBody.add("keyControls", keyControls);
        updatePassengerBody.add("payload", payloadBody);
        logger.info("Update Passenger Body is: " + updatePassengerBody);
    }

    //Update Passenger Request send
    public void updatePassengerRequestSend() {

        updatePassengerResponse = given().
                header("Content-Type", "application/json").
                body(updatePassengerBody.toString()).
                when().
                put(BaseEnvironmet + PromoPara1 + cartId + UpdatePassengerPara);

        logger.info("Update Passenger Request URL is: " + BaseEnvironmet + PromoPara1 + cartId + UpdatePassengerPara);
//        updatePassengerResponse.prettyPrint().toString();

    }
}
