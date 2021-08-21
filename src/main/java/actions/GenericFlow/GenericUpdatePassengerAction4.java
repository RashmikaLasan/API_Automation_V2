package actions.GenericFlow;

import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import utilities.Log;

import static actions.GenericFlow.GenericCreateCartAction2.*;
import static actions.GenericFlow.GenericSearchAction1.genericKeyControls;
import static actions.GenericFlow.GenericSearchAction1.genericPayload;
import static actions.HotelFlow.CreateCartActions2.TravellersKeyOne;
import static actions.HotelFlow.CreateCartActions2.TravellersKeyTwo;
import static constants.EndPoints.*;
import static constants.EndPoints.UpdatePassengerPara;
import static io.restassured.RestAssured.given;

public class GenericUpdatePassengerAction4 {

    public static Response updateGenPassengerResponse;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonArray Contact;
    public JsonArray Addresses;
    public JsonObject profile1;
    public JsonObject reference1;
    public JsonObject reference2;
    public JsonObject payload1;
    public JsonObject payload2;
    public JsonObject updatePassengerBody;
    public JsonArray payloadGenBody;

    //Create Update Passenger Body
    public void createGenContactBody() {

        //Create Contact Body for Contact1
        JsonObject Contact1 = new JsonObject();
        Contact1.addProperty("contactNo", 1);
        Contact1.addProperty("contactType", "Telephone");
        Contact1.addProperty("value", "+94711996777");
        Contact1.addProperty("main", true);
        Contact1.addProperty("preferred", true);


        //Create Gen Contact Body for Contact2
        JsonObject Contact2 = new JsonObject();
        Contact2.addProperty("contactNo", 2);
        Contact2.addProperty("contactType", "E-mail");
        Contact2.addProperty("value", "lasanrash@gmail.com");
        Contact2.addProperty("main", false);
        Contact2.addProperty("preferred", false);

        //Aggregate Gen Contacts
        Contact = new JsonArray();
        Contact.add(Contact1);
        Contact.add(Contact2);
        logger.info("Contact is: " + Contact);
    }

    //Create Gen Address Body Elements
    public void createGenAddressBody() {

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


        //Aggregate Gen Address Elements
        Addresses = new JsonArray();
        Addresses.add(Address);
        logger.info("Addresses is :" + Addresses);

    }

    //Create Gen Profile Elements
    public void createGenProfileBody() {

        //Frequent Fly Number and Membership Elements Create
        JsonArray frequentFlyerNumbers1 = new JsonArray();
        JsonArray memberships1 = new JsonArray();

        //Create Gen Profile Body
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

    //Create Gen Reference Body
    public void createGenReference() {

        //Create External Reference-Array Body
        JsonArray externalRefs1 = new JsonArray();
        JsonArray externalRefs2 = new JsonArray();

        //Create External Reference for Passenger One
        reference1 = new JsonObject();
        reference1.addProperty("key", genTravellersKeyTwo);
        reference1.add("externalRefs", externalRefs1);
        logger.info("Reference for Passenger One :" + reference1);

        //Create External Reference for Passenger Two
        reference2 = new JsonObject();
        reference2.addProperty("key", genTravellersKeyTwo);
        reference2.add("externalRefs", externalRefs2);
        logger.info("Reference for Passenger Two :" + reference2);

    }

    //Create Payload Body of Passenger One
    public void createGenPayloadBodyOne() {

        payload1 = new JsonObject();
        payload1.addProperty("key", genTravellersKeyOne);
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
    public void createGenPayloadBodyTwo() {

        payload2 = new JsonObject();
        payload2.addProperty("key", genTravellersKeyTwo);
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
    public void payloadGenFullBody() {

        payloadGenBody = new JsonArray();
        payloadGenBody.add(payload1);
        logger.info("payload1 is  " + payload1);
        payloadGenBody.add(payload2);
        logger.info("payload2 is " + payload2);

    }

    //Update Passenger Full Body Merge
    public void updatePassengerGenFullBody() {

        updatePassengerBody = new JsonObject();
        updatePassengerBody.add("keyControls", genericKeyControls);
        updatePassengerBody.add("payload", payloadGenBody);
        logger.info("Update Passenger Body is: " + updatePassengerBody);
    }

    //Update Passenger Request send
    public void updatePassengerGenRequestSend() {

        updateGenPassengerResponse = given().
                header("Content-Type", "application/json").
                body(updatePassengerBody.toString()).
                when().
                put(BaseEnvironmet + PromoPara1 + genCartId + UpdatePassengerPara);

        logger.info("Update Passenger Request URL is: " + BaseEnvironmet + PromoPara1 + genCartId + UpdatePassengerPara);
        updateGenPassengerResponse.prettyPrint().toString();

    }

    //Generic Search Status Code Validation
    public void genericSearchStatusCode(int statusCode) {

        updateGenPassengerResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Update Passenger Response");

    }
}

