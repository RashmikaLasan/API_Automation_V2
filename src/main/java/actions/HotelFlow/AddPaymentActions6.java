package actions.HotelFlow;

import utilities.Log;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static actions.HotelFlow.CreateCartActions2.cartId;
import static actions.HotelFlow.CreatePaymentSessionActions4.paymentReference;
import static actions.HotelFlow.SearchActions1.keyControls;
import static actions.HotelFlow.SearchActions1.totalPrice;
import static constants.EndPoints.*;
import static io.restassured.RestAssured.given;

public class AddPaymentActions6 {

    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject uniqueId;
    public JsonObject paymentDetails;
    public JsonObject paymentInfo;
    public JsonObject addPaymentBody;
    public static Response addPaymentResponse;

    //Create Unique ID
    public void createUniqueId() {

        uniqueId = new JsonObject();
        uniqueId.addProperty("receiptIndex", 1);
        uniqueId.addProperty("receiptType", "CRCD");

    }

    //Create Payment Details
    public void createPaymentDetails(String cardType) {

        paymentDetails = new JsonObject();
        paymentDetails.addProperty("cardCategory", "CreditCard");
        paymentDetails.addProperty("cardType", cardType);
        paymentDetails.addProperty("cardHolderName", "Rashmika");
        paymentDetails.addProperty("maskedCardNumber", "************4444");
        paymentDetails.addProperty("expireDate", "2044-04-30");
        paymentDetails.addProperty("gatewayReference", "STRIPE");
        paymentDetails.addProperty("transactionIdentifier", paymentReference);
        paymentDetails.addProperty("rrn", "505471017057");
        paymentDetails.addProperty("rrnKey", "");
        paymentDetails.addProperty("authorised", true);
        paymentDetails.addProperty("authorizationCode", "");
        paymentDetails.addProperty("airlineMerchant", false);
        paymentDetails.addProperty("cardCommission", 0);
        paymentDetails.addProperty("cardCommissionTax", 0);
        paymentDetails.addProperty("cardToken", "");
        paymentDetails.addProperty("tokenVault", "");
        paymentDetails.addProperty("voidPayment", false);

    }

    //Create Payment Info
    public void createPaymentInfo(String currency) {

        paymentInfo = new JsonObject();
        paymentInfo.addProperty("amount", totalPrice);
        paymentInfo.addProperty("currencyCode", currency);
        paymentInfo.addProperty("accountNo", "");
        paymentInfo.addProperty("bankCode", "");
        paymentInfo.addProperty("bankTransactionID", "");
        paymentInfo.addProperty("depositBy", "10000");
        paymentInfo.addProperty("payOrRefund", true);
        paymentInfo.addProperty("realised", true);
        paymentInfo.addProperty("realisedDate", "");
        paymentInfo.addProperty("receiptToBaseExchangeRate", "1");
        paymentInfo.addProperty("receiptToSellingExchangeRate", "1");
        paymentInfo.addProperty("reconcile", true);
        paymentInfo.addProperty("reconcileDate", "");
        paymentInfo.addProperty("bouncedReceiptsExist", false);
        paymentInfo.addProperty("transferReceiptId", 123);
        paymentInfo.addProperty("receiptDate", "2021-04-21T10:47:06.818Z");
        paymentInfo.addProperty("authorised", true);

    }

    //Create Full Body Including Key Controls
    public void createFullBody() {

        //Aggregate Payload Segments
        JsonObject payload = new JsonObject();
        payload.addProperty("note", "Credit Card Payment");
        payload.add("paymentDetails", paymentDetails);
        payload.add("paymentInfo", paymentInfo);
        payload.add("uniqueId", uniqueId);

        //Add payload Segments to an Array
        JsonArray payloadArray = new JsonArray();
        payloadArray.add(payload);

        //Aggregate Full Body
        addPaymentBody = new JsonObject();
        addPaymentBody.add("keyControls", keyControls);
        addPaymentBody.add("payload", payloadArray);

        logger.info("addPaymentBody is " + addPaymentBody);
    }

    //Send the Request
    public void sendAddPaymentRequest() {

        addPaymentResponse = given().
                header("Content-Type", "application/json").
                body(addPaymentBody.toString()).
                when().
                post(BaseEnvironmet + PromoPara1 + cartId + AddPaymentPara);

//        addPaymentResponse.prettyPrint().toString();
        logger.info("Add Payment Request URL is: " + BaseEnvironmet + PromoPara1 + cartId + AddPaymentPara);
    }
}
