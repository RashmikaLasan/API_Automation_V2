package actions.GenericFlow;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.Assert;
import utilities.Log;

import static actions.GenericFlow.GenericCreateCartAction2.genCartId;
import static actions.GenericFlow.GenericSearchAction1.genericKeyControls;
import static actions.GenericFlow.GenericSearchAction1.genericTotalPrice;
import static constants.EndPoints.BaseEnvironmet;
import static constants.EndPoints.PaymentSessionURL;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GenericCreatePaymentSessionActions5 {

    public static Response createGenericPaymentSessionResponse;
    public static String genericPaymentReference;
    public static String totalGenPriceCreatePaymentSession;
    public static String genTransactionIdentifier;
    final Logger logger = Log.getLogData(Log.class.getName());
    public JsonObject CreatePaymentSessionBody;

    //Create Body of Payment Session
    public void createPaymentSessionBody(String currency, String brand, String receipt) {

        JsonObject PaymentSessionPayload = new JsonObject();
        PaymentSessionPayload.addProperty("batchReceiptInfo", receipt);
        PaymentSessionPayload.addProperty("bookingType", "STD");
        PaymentSessionPayload.addProperty("brand", brand);
        PaymentSessionPayload.addProperty("cardExpMonth", "");
        PaymentSessionPayload.addProperty("cardExpYear", "");
        PaymentSessionPayload.addProperty("cardHolderName", "");
        PaymentSessionPayload.addProperty("cardNumber", "");
        PaymentSessionPayload.addProperty("cardType", "");
        PaymentSessionPayload.addProperty("company", "CT");
        PaymentSessionPayload.addProperty("currency", currency);
        PaymentSessionPayload.addProperty("distributionChannel", "U");
        PaymentSessionPayload.addProperty("division", "CTDIV_LON");
        PaymentSessionPayload.addProperty("email", "test@test.test");
        PaymentSessionPayload.addProperty("isWeb", true);
        PaymentSessionPayload.addProperty("noOfDaysToDeparture", 10);
        PaymentSessionPayload.addProperty("paymentReference", "");
        PaymentSessionPayload.addProperty("paymentStatus", "");
        PaymentSessionPayload.addProperty("redirectUrl", "");
        PaymentSessionPayload.addProperty("total", genericTotalPrice);
        PaymentSessionPayload.addProperty("transactionIdentifier", "");
        PaymentSessionPayload.addProperty("userId", 0);
        PaymentSessionPayload.addProperty("web", true);
        PaymentSessionPayload.addProperty("cartId", genCartId);

        //Enter the Key Controls and create Full  Body
        CreatePaymentSessionBody = new JsonObject();
        CreatePaymentSessionBody.add("keyControls", genericKeyControls);
        CreatePaymentSessionBody.add("payload", PaymentSessionPayload);

    }

    //Create Payment Session Send the Request
    public void sendCreatePaymentSessionRequest() {

        createGenericPaymentSessionResponse = given().
                header("Content-Type", "application/json").
                body(CreatePaymentSessionBody.toString()).
                when().
                post(BaseEnvironmet + PaymentSessionURL);
//        createGenericPaymentSessionResponse.prettyPrint().toString();
    }

    //Create Payment Session Status Code Validation
    public void createPaymentSessionStatusCodeValidation(int statusCode) {

        createGenericPaymentSessionResponse.then().statusCode(statusCode);
        logger.info("Status Code 200 and its Success for Generic Create Payment Session");
    }

    //Store the Payment Reference
    public void storePaymentReference() {

        genericPaymentReference = createGenericPaymentSessionResponse.path("data[0].paymentReference").toString();
        logger.info("Payment Reference is: " + genericPaymentReference + " in Create Payment Session Response");

    }

    //Create Payment Session Price Validation
    public void createGenPaymentSessionPriceAssertion() {

        createGenericPaymentSessionResponse.then().body(("data[0].total"), equalTo((float) genericTotalPrice));
        logger.info("Total Price Validation Success for Generic Create Payment Session and Total Price is: " + genericTotalPrice);
    }

    //Create Payment Session Transaction Identifier Assertion
    public void createGenPaymentSessionCartIdAssertion() {

        genTransactionIdentifier = createGenericPaymentSessionResponse.path("data[0].transactionIdentifier").toString();
        Assert.assertEquals(genTransactionIdentifier, genCartId);
        logger.info("Transaction Identifier Validation success in Generic Create Payment Session and Transaction Identifier is: " + genTransactionIdentifier);


    }

    //Create Payment Session Transaction Identifier Assertion
    public void createGenPaymentSessionCurrencyAssertion(String currency) {

        String createGenPaymentSessionCurrency = createGenericPaymentSessionResponse.path("data[0].currency");
        Assert.assertEquals(createGenPaymentSessionCurrency, currency);
        logger.info("Currency Validation success in Generic Create Payment Session and Currency is: " + createGenPaymentSessionCurrency);

    }
}