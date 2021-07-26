package Actions.HotelFlow;

import Utilities.Log;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.*;
import org.apache.log4j.Logger;

import static Actions.HotelFlow.CreateCartActions2.cartId;
import static Actions.HotelFlow.CreatePaymentSessionActions4.paymentReference;
import static Actions.HotelFlow.SearchActions1.keyControls;
import static Actions.HotelFlow.SearchActions1.totalPrice;
import static Constants.EndPoints.*;
import static io.restassured.RestAssured.given;

public class AddPaymentActions6 {

    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject uniqueId;
    public JsonObject paymentDetails;
    public JsonObject paymentInfo;
    public JsonObject note1;
    public JsonObject addPaymentBody;
    public Response createPaymentResponse;

    //Create Unique ID
    public void createUniqueId() {

        JsonObject uniqueId1 = new JsonObject();
        uniqueId1.addProperty("receiptIndex", 1);
        uniqueId1.addProperty("receiptType", "CRCD");

        uniqueId = new JsonObject();
        uniqueId.add("uniqueId", uniqueId1);

    }

    //Create Payment Details
    public void createPaymentDetails(String cardType) {

        JsonObject paymentDetails1 = new JsonObject();
        paymentDetails1.addProperty("cardCategory", "CreditCard");
        paymentDetails1.addProperty("cardType", cardType);
        paymentDetails1.addProperty("cardHolderName", "Rashmika");
        paymentDetails1.addProperty("maskedCardNumber", "************4444");
        paymentDetails1.addProperty("expireDate", "2044-04-30");
        paymentDetails1.addProperty("gatewayReference", "STRIPE");
        paymentDetails1.addProperty("transactionIdentifier", paymentReference);
        paymentDetails1.addProperty("rrn", "505471017057");
        paymentDetails1.addProperty("rrnKey", "");
        paymentDetails1.addProperty("authorised", true);
        paymentDetails1.addProperty("authorizationCode", "");
        paymentDetails1.addProperty("airlineMerchant", false);
        paymentDetails1.addProperty("cardCommission", 0);
        paymentDetails1.addProperty("cardCommissionTax", 0);
        paymentDetails1.addProperty("cardToken", "");
        paymentDetails1.addProperty("tokenVault", "");
        paymentDetails1.addProperty("voidPayment", false);


        paymentDetails = new JsonObject();
        paymentDetails.add("paymentDetails", paymentDetails1);

    }

    //Create Payment Info
    public void createPaymentInfo() {

        JsonObject paymentInfo1 = new JsonObject();
        paymentInfo1.addProperty("amount", totalPrice);
        paymentInfo1.addProperty("currencyCode", "GBP");
        paymentInfo1.addProperty("accountNo", "");
        paymentInfo1.addProperty("bankCode", "");
        paymentInfo1.addProperty("bankTransactionID", "");
        paymentInfo1.addProperty("depositBy", "10000");
        paymentInfo1.addProperty("payOrRefund", true);
        paymentInfo1.addProperty("realised", true);
        paymentInfo1.addProperty("realisedDate", "");
        paymentInfo1.addProperty("receiptToBaseExchangeRate", "1");
        paymentInfo1.addProperty("receiptToSellingExchangeRate", "1");
        paymentInfo1.addProperty("reconcile", true);
        paymentInfo1.addProperty("reconcileDate", "");
        paymentInfo1.addProperty("bouncedReceiptsExist", false);
        paymentInfo1.addProperty("transferReceiptId", 123);
        paymentInfo1.addProperty("receiptDate", "2021-04-21T10:47:06.818Z");
        paymentInfo1.addProperty("authorised", true);


        paymentInfo = new JsonObject();
        paymentInfo.add("paymentInfo", paymentInfo1);
    }

//    public void createNote(){
//
//        note1 = new JsonObject();
//        note1.addProperty("note","Credit Card Payment");
//
//    }

    public void createFullBody() {


        JsonObject payload1 = new JsonObject();
        payload1.addProperty("note", "Credit Card Payment");
        payload1.add("paymentDetails", paymentInfo);
        payload1.add("paymentInfo", paymentInfo);
        payload1.add("uniqueId", uniqueId);


        JsonArray payloadArray = new JsonArray();
        payloadArray.add(payload1);

        addPaymentBody = new JsonObject();
        addPaymentBody.add("keyControls", keyControls);
        addPaymentBody.add("payload", payloadArray);

        logger.info("addPaymentBody is " + addPaymentBody);
    }

    public void sendCreatePaymentRequest() {


        createPaymentResponse = given().
                header("Content-Type", "application/json").
                body(addPaymentBody.toString()).
                when().
                post(BaseEnvironmet + PromoPara1 + cartId + AddPaymentPara);
    }
}
