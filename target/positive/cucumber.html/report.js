$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GenericBookingFlow.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the V2 Generic Booking Flow",
  "description": "",
  "id": "verify-the-v2-generic-booking-flow",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying V2 HTL Flow without the PromoCode",
  "description": "",
  "id": "verify-the-v2-generic-booking-flow;verifying-v2-htl-flow-without-the-promocode",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@gennopromo"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#1.Generic Search"
    }
  ],
  "line": 6,
  "name": "I Enter the checkIn date as \"\u003cFutureDateCount\u003e\" Product Code as \"\u003cProductCode\u003e\" City as \"\u003cCity\u003e\" Brand as \"\u003cBrand\u003e\" Currency as \"\u003cCurrency\u003e\" Division as \"\u003cDivision\u003e\" for two Adults",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click send request for Generic Search Request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response as status code 200 for Generic Search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store the Generic Key Controls",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Store Generic Payload",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Store the Product Name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Store the Product Code",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Store the Generic Service Start Date",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Store the Duration of Tour",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Store the Generic Service End Date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Store the Generic Choice Key",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Store the Price of the Generic Search",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Store the Category Code",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Store the Category Name",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Store the Generic Pax Combination",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#2.Add To Cart"
    }
  ],
  "line": 24,
  "name": "I want to Create Generic Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click send request for Generic Create Cart Request",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should get a successful response as status code 200 for Generic Create Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Store the Generic Cart ID",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Store the Generic TravellersKey of Passenger One",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Store the Generic TravellersKey of Passenger Two",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "check the Product Name is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "check the Product Code is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "check the Generic Service Start Date is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "check the Generic Service End Date is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#    Then check the Choice Key is correct in Create Cart Response"
    }
  ],
  "line": 36,
  "name": "check the Price of the Product is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "check the Category Code is correct in Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "check the Category Name is correct in Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "check the Pax Combination is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#4.Update Passenger"
    }
  ],
  "line": 43,
  "name": "I want to Create Update Passenger Body I Create Gen Contact Details",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I want to Create Update Passenger Body I Create Gen Address Details",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I want to Create Update Passenger Body I Create Gen Profile Details",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I want to Create Update Passenger Body I Create Gen Reference Details",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of all the Passengers",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I Combined the Gen Update Passenger details body",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I create Gen Update Passenger Body to Update Passenger Details",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "I click send request for Gen Update Passenger Request",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "I should get a successful response as status code 200 Gen Update Passenger",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "check the Cart ID is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "check the Product Name is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "check the Product Code is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "check the Generic Service Start Date is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "check the Generic Service End Date is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#    Then check the Choice Key is correct in Generic Update Passenger Response"
    }
  ],
  "line": 61,
  "name": "check the Price of the Product is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "check the Category Code is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "check the Category Name is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "check the Pax Combination is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 67,
      "value": "#5.Create Payment Session"
    }
  ],
  "line": 68,
  "name": "I want to create Generic Payment Session with Payment Currency as \"\u003cCurrency\u003e\" Brand as \"\u003cBrand\u003e\" Batch Receipt as \"\u003cbatchReceiptInfo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I click send request for Generic Create Payment Session Request",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "I should get a successful response as status code 200 for Generic Create Payment Session",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "Store the Payment Reference in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "check the payment Amount is correct in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "check the Transaction Identifier is equal to the Cart ID in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "check the Payment Currency is \"\u003cCurrency\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 78,
      "value": "#6.Capture Payment"
    }
  ],
  "line": 79,
  "name": "I want to send the Generic Capture Payment Request where Card Type as \"\u003ccardType\u003e\" and Currency as \"\u003cCurrency\u003e\" Batch Receipt as \"\u003cbatchReceiptInfo\u003e\" Brand as \"\u003cBrand\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "I click send request for Generic Capture Payment Request",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "I should get a successful response as status code 200 for Generic Capture Payment Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 84,
      "value": "#7.Add Payment"
    }
  ],
  "line": 85,
  "name": "I want to create Unique ID in Generic Add Payment Body",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I want to create Payment Details in Generic Add Payment Body where Card Type as \"\u003ccardType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "I want to create Payment Info in Generic Add Payment Body where Currency as \"\u003cCurrency\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "I want to Merge Full Body of Generic Add Payment Body",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "I click send request for Generic Add Payment Request",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "I should get a successful response as status code 200 for Generic Add Payment Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 93,
      "value": "#7.Confirm Cart"
    }
  ],
  "line": 94,
  "name": "I want to Generic Confirm Booking by creating the Confirm Cart Body",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "I click send Generic request for Confirm Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "I should get a successful response as status code 200 for Generic Confirm Cart Request",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "Store the Generic Booking ID in Confirm Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "Store the Generic Booking Reference in Confirm Cart Response",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 102,
      "value": "#Booking Retrieve"
    }
  ],
  "line": 103,
  "name": "I want to create the Generic Get Request as userId as \"877\" UserName as \"codegen\" ClientID as \"-1\" Expand as \"all\"",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "I click send Request for Generic Retrieve Request",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "I should get a successful response as status code 200 for Generic Retrieve Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 107,
      "value": "#Calculate the Cancellation Charge"
    }
  ],
  "line": 108,
  "name": "I want to check the Cancellation Charge of the Booking",
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "I click send Generic request for Calculate Cancellation Charge",
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "I should get a successful response with status code 200 for Cancellation Charge Calculation",
  "keyword": "Then "
});
formatter.step({
  "line": 111,
  "name": "display the Cancellation charge of the booking",
  "keyword": "And "
});
formatter.examples({
  "line": 113,
  "name": "",
  "description": "",
  "id": "verify-the-v2-generic-booking-flow;verifying-v2-htl-flow-without-the-promocode;",
  "rows": [
    {
      "cells": [
        "FutureDateCount",
        "ProductCode",
        "City",
        "Currency",
        "Brand",
        "cardType",
        "batchReceiptInfo",
        "Division"
      ],
      "line": 114,
      "id": "verify-the-v2-generic-booking-flow;verifying-v2-htl-flow-without-the-promocode;;1"
    },
    {
      "cells": [
        "90",
        "VT108266P12",
        "DXB",
        "GBP",
        "CT_OL",
        "VISA",
        "pm_card_amex_threeDSecureNotSupported",
        "CT_LON"
      ],
      "line": 115,
      "id": "verify-the-v2-generic-booking-flow;verifying-v2-htl-flow-without-the-promocode;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 115,
  "name": "Verifying V2 HTL Flow without the PromoCode",
  "description": "",
  "id": "verify-the-v2-generic-booking-flow;verifying-v2-htl-flow-without-the-promocode;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@gennopromo"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#1.Generic Search"
    }
  ],
  "line": 6,
  "name": "I Enter the checkIn date as \"90\" Product Code as \"VT108266P12\" City as \"DXB\" Brand as \"CT_OL\" Currency as \"GBP\" Division as \"CT_LON\" for two Adults",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    7
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click send request for Generic Search Request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response as status code 200 for Generic Search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Store the Generic Key Controls",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Store Generic Payload",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Store the Product Name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Store the Product Code",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Store the Generic Service Start Date",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Store the Duration of Tour",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Store the Generic Service End Date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Store the Generic Choice Key",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Store the Price of the Generic Search",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Store the Category Code",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Store the Category Name",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Store the Generic Pax Combination",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 23,
      "value": "#2.Add To Cart"
    }
  ],
  "line": 24,
  "name": "I want to Create Generic Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click send request for Generic Create Cart Request",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should get a successful response as status code 200 for Generic Create Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Store the Generic Cart ID",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Store the Generic TravellersKey of Passenger One",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Store the Generic TravellersKey of Passenger Two",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "check the Product Name is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "check the Product Code is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "check the Generic Service Start Date is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "check the Generic Service End Date is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#    Then check the Choice Key is correct in Create Cart Response"
    }
  ],
  "line": 36,
  "name": "check the Price of the Product is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "check the Category Code is correct in Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "check the Category Name is correct in Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "check the Pax Combination is correct in Generic Create Cart Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 42,
      "value": "#4.Update Passenger"
    }
  ],
  "line": 43,
  "name": "I want to Create Update Passenger Body I Create Gen Contact Details",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I want to Create Update Passenger Body I Create Gen Address Details",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I want to Create Update Passenger Body I Create Gen Profile Details",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "I want to Create Update Passenger Body I Create Gen Reference Details",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I want to Create Update Passenger Body I Create Gen Payload Details of all the Passengers",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I Combined the Gen Update Passenger details body",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I create Gen Update Passenger Body to Update Passenger Details",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "I click send request for Gen Update Passenger Request",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "I should get a successful response as status code 200 Gen Update Passenger",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "check the Cart ID is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "check the Product Name is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "check the Product Code is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "check the Generic Service Start Date is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "check the Generic Service End Date is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#    Then check the Choice Key is correct in Generic Update Passenger Response"
    }
  ],
  "line": 61,
  "name": "check the Price of the Product is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "check the Category Code is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "check the Category Name is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "check the Pax Combination is correct in Generic Update Passenger Response",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 67,
      "value": "#5.Create Payment Session"
    }
  ],
  "line": 68,
  "name": "I want to create Generic Payment Session with Payment Currency as \"GBP\" Brand as \"CT_OL\" Batch Receipt as \"pm_card_amex_threeDSecureNotSupported\"",
  "matchedColumns": [
    3,
    4,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "I click send request for Generic Create Payment Session Request",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "I should get a successful response as status code 200 for Generic Create Payment Session",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "Store the Payment Reference in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "check the payment Amount is correct in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "check the Transaction Identifier is equal to the Cart ID in Generic Create Payment Session response",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "check the Payment Currency is \"GBP\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 78,
      "value": "#6.Capture Payment"
    }
  ],
  "line": 79,
  "name": "I want to send the Generic Capture Payment Request where Card Type as \"VISA\" and Currency as \"GBP\" Batch Receipt as \"pm_card_amex_threeDSecureNotSupported\" Brand as \"CT_OL\"",
  "matchedColumns": [
    3,
    4,
    5,
    6
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "I click send request for Generic Capture Payment Request",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "I should get a successful response as status code 200 for Generic Capture Payment Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 84,
      "value": "#7.Add Payment"
    }
  ],
  "line": 85,
  "name": "I want to create Unique ID in Generic Add Payment Body",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "I want to create Payment Details in Generic Add Payment Body where Card Type as \"VISA\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "I want to create Payment Info in Generic Add Payment Body where Currency as \"GBP\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "I want to Merge Full Body of Generic Add Payment Body",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "I click send request for Generic Add Payment Request",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "I should get a successful response as status code 200 for Generic Add Payment Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 93,
      "value": "#7.Confirm Cart"
    }
  ],
  "line": 94,
  "name": "I want to Generic Confirm Booking by creating the Confirm Cart Body",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "I click send Generic request for Confirm Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "I should get a successful response as status code 200 for Generic Confirm Cart Request",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "Store the Generic Booking ID in Confirm Cart Response",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "Store the Generic Booking Reference in Confirm Cart Response",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 102,
      "value": "#Booking Retrieve"
    }
  ],
  "line": 103,
  "name": "I want to create the Generic Get Request as userId as \"877\" UserName as \"codegen\" ClientID as \"-1\" Expand as \"all\"",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "I click send Request for Generic Retrieve Request",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "I should get a successful response as status code 200 for Generic Retrieve Request",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 107,
      "value": "#Calculate the Cancellation Charge"
    }
  ],
  "line": 108,
  "name": "I want to check the Cancellation Charge of the Booking",
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "I click send Generic request for Calculate Cancellation Charge",
  "keyword": "Then "
});
formatter.step({
  "line": 110,
  "name": "I should get a successful response with status code 200 for Cancellation Charge Calculation",
  "keyword": "Then "
});
formatter.step({
  "line": 111,
  "name": "display the Cancellation charge of the booking",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "90",
      "offset": 29
    },
    {
      "val": "VT108266P12",
      "offset": 50
    },
    {
      "val": "DXB",
      "offset": 72
    },
    {
      "val": "CT_OL",
      "offset": 87
    },
    {
      "val": "GBP",
      "offset": 107
    },
    {
      "val": "CT_LON",
      "offset": 125
    }
  ],
  "location": "GenericSearchStep1.iEnterTheCheckInDateAsProductCodeAsCityAsBrandAsCurrencyAsDivisionAsForTwoAdults(int,String,String,String,String,String)"
});
formatter.result({
  "duration": 872460800,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.iClickSendRequestForGenericSearchRequest()"
});
formatter.result({
  "duration": 19038419800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericSearchStep1.iShouldGetASuccessfulResponseAsStatusCodeForGenericSearch(int)"
});
formatter.result({
  "duration": 41710700,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheGenericKeyControls()"
});
formatter.result({
  "duration": 565434700,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeGenericPayload()"
});
formatter.result({
  "duration": 61364800,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheProductName()"
});
formatter.result({
  "duration": 30492100,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheProductCode()"
});
formatter.result({
  "duration": 34281400,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheGenericServiceStartDate()"
});
formatter.result({
  "duration": 24911200,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheDurationOfTour()"
});
formatter.result({
  "duration": 25748700,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheGenericServiceEndDate()"
});
formatter.result({
  "duration": 30702500,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheGenericChoiceKey()"
});
formatter.result({
  "duration": 36213100,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeThePriceOfTheGenericSearch()"
});
formatter.result({
  "duration": 24991800,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheCategoryCode()"
});
formatter.result({
  "duration": 23564100,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheCategoryName()"
});
formatter.result({
  "duration": 17919800,
  "status": "passed"
});
formatter.match({
  "location": "GenericSearchStep1.storeTheGenericPaxCombination()"
});
formatter.result({
  "duration": 49243800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.iWantToCreateGenericCart()"
});
formatter.result({
  "duration": 8414800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.iClickSendRequestForGenericCreateCartRequest()"
});
formatter.result({
  "duration": 7978136000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericCreateCartSteps2.iShouldGetASuccessfulResponseAsStatusCodeForGenericCreateCart(int)"
});
formatter.result({
  "duration": 3160800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.storeTheGenericCartID()"
});
formatter.result({
  "duration": 31568600,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.storeTheGenericTravellersKeyOfPassengerOne()"
});
formatter.result({
  "duration": 22775000,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.storeTheGenericTravellersKeyOfPassengerTwo()"
});
formatter.result({
  "duration": 18411000,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheProductNameIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 94260500,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheProductCodeIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 18581300,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheGenericServiceStartDateIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 27103400,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheGenericServiceEndDateIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 27745400,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkThePriceOfTheProductIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 24981200,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheCategoryCodeIsCorrectInCreateCartResponse()"
});
formatter.result({
  "duration": 21759000,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkTheCategoryNameIsCorrectInCreateCartResponse()"
});
formatter.result({
  "duration": 20049100,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreateCartSteps2.checkThePaxCombinationIsCorrectInGenericCreateCartResponse()"
});
formatter.result({
  "duration": 50492900,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenContactDetails()"
});
formatter.result({
  "duration": 23455000,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenAddressDetails()"
});
formatter.result({
  "duration": 589700,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenProfileDetails()"
});
formatter.result({
  "duration": 750500,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenReferenceDetails()"
});
formatter.result({
  "duration": 692900,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenPayloadDetailsOfPassengerOne()"
});
formatter.result({
  "duration": 133400,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenPayloadDetailsOfPassengerOne()"
});
formatter.result({
  "duration": 94500,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iWantToCreateUpdatePassengerBodyICreateGenPayloadDetailsOfAllThePassengers()"
});
formatter.result({
  "duration": 206600,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iCombinedTheGenUpdatePassengerDetailsBody()"
});
formatter.result({
  "duration": 1216900,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iCreateGenUpdatePassengerBodyToUpdatePassengerDetails()"
});
formatter.result({
  "duration": 672300,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.iClickSendRequestForGenUpdatePassengerRequest()"
});
formatter.result({
  "duration": 5132262300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericPassengerUpdateSteps4.iShouldGetASuccessfulResponseAsStatusCodeGenUpdatePassenger(int)"
});
formatter.result({
  "duration": 819500,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheCartIDIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 24912600,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheProductNameIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 26616000,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheProductCodeIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 17516100,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheGenericServiceStartDateIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 35792800,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheGenericServiceEndDateIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 15834200,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkThePriceOfTheProductIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 27303500,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheCategoryCodeIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 19687000,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkTheCategoryNameIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 25994600,
  "status": "passed"
});
formatter.match({
  "location": "GenericPassengerUpdateSteps4.checkThePaxCombinationIsCorrectInGenericUpdatePassengerResponse()"
});
formatter.result({
  "duration": 128797400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 67
    },
    {
      "val": "CT_OL",
      "offset": 82
    },
    {
      "val": "pm_card_amex_threeDSecureNotSupported",
      "offset": 107
    }
  ],
  "location": "GenericCreatePaymentSessionSteps5.iWantToCreateGenericPaymentSessionWithPaymentCurrencyAsBrandAsBatchReceiptAs(String,String,String)"
});
formatter.result({
  "duration": 17665900,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreatePaymentSessionSteps5.iClickSendRequestForGenericCreatePaymentSessionRequest()"
});
formatter.result({
  "duration": 5400015800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericCreatePaymentSessionSteps5.iShouldGetASuccessfulResponseAsStatusCodeForGenericCreatePaymentSession(int)"
});
formatter.result({
  "duration": 840800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreatePaymentSessionSteps5.storeThePaymentReferenceInGenericCreatePaymentSessionResponse()"
});
formatter.result({
  "duration": 8915900,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreatePaymentSessionSteps5.checkThePaymentAmountIsCorrectInGenericCreatePaymentSessionResponse()"
});
formatter.result({
  "duration": 12634800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCreatePaymentSessionSteps5.checkTheTransactionIdentifierIsEqualToTheCartIDInGenericCreatePaymentSessionResponse()"
});
formatter.result({
  "duration": 10574200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 31
    }
  ],
  "location": "GenericCreatePaymentSessionSteps5.checkThePaymentCurrencyIs(String)"
});
formatter.result({
  "duration": 10388000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 71
    },
    {
      "val": "GBP",
      "offset": 94
    },
    {
      "val": "pm_card_amex_threeDSecureNotSupported",
      "offset": 117
    },
    {
      "val": "CT_OL",
      "offset": 166
    }
  ],
  "location": "GenericCapturePaymentSteps6.iWantToSendTheGenericCapturePaymentRequestWhereCardTypeAsAndCurrencyAsBatchReceiptAsBrandAs(String,String,String,String)"
});
formatter.result({
  "duration": 6597600,
  "status": "passed"
});
formatter.match({
  "location": "GenericCapturePaymentSteps6.iClickSendRequestForGenericCapturePaymentRequest()"
});
formatter.result({
  "duration": 17238238300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericCapturePaymentSteps6.iShouldGetASuccessfulResponseAsStatusCodeForGenericCapturePaymentRequest(int)"
});
formatter.result({
  "duration": 2460600,
  "status": "passed"
});
formatter.match({
  "location": "GenericAddPaymentSteps7.iWantToCreateUniqueIDInGenericAddPaymentBody()"
});
formatter.result({
  "duration": 12046700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 81
    }
  ],
  "location": "GenericAddPaymentSteps7.iWantToCreatePaymentDetailsInGenericAddPaymentBodyWhereCardTypeAs(String)"
});
formatter.result({
  "duration": 203600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 77
    }
  ],
  "location": "GenericAddPaymentSteps7.iWantToCreatePaymentInfoInGenericAddPaymentBodyWhereCurrencyAs(String)"
});
formatter.result({
  "duration": 453800,
  "status": "passed"
});
formatter.match({
  "location": "GenericAddPaymentSteps7.iWantToMergeFullBodyOfGenericAddPaymentBody()"
});
formatter.result({
  "duration": 145200,
  "status": "passed"
});
formatter.match({
  "location": "GenericAddPaymentSteps7.iClickSendRequestForGenericAddPaymentRequest()"
});
formatter.result({
  "duration": 5068283500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericAddPaymentSteps7.iShouldGetASuccessfulResponseAsStatusCodeForGenericAddPaymentRequest(int)"
});
formatter.result({
  "duration": 1124600,
  "status": "passed"
});
formatter.match({
  "location": "GenericConfirmCartSteps8.iWantToGenericConfirmBookingByCreatingTheConfirmCartBody()"
});
formatter.result({
  "duration": 11874000,
  "status": "passed"
});
formatter.match({
  "location": "GenericConfirmCartSteps8.iClickSendGenericRequestForConfirmCart()"
});
formatter.result({
  "duration": 17492105100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericConfirmCartSteps8.iShouldGetASuccessfulResponseAsStatusCodeForGenericConfirmCartRequest(int)"
});
formatter.result({
  "duration": 5670400,
  "status": "passed"
});
formatter.match({
  "location": "GenericConfirmCartSteps8.storeTheGenericBookingIDInConfirmCartResponse()"
});
formatter.result({
  "duration": 59651600,
  "status": "passed"
});
formatter.match({
  "location": "GenericConfirmCartSteps8.storeTheGenericBookingReferenceInConfirmCartResponse()"
});
formatter.result({
  "duration": 46077200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "877",
      "offset": 55
    },
    {
      "val": "codegen",
      "offset": 73
    },
    {
      "val": "-1",
      "offset": 95
    },
    {
      "val": "all",
      "offset": 110
    }
  ],
  "location": "GenericRetrieveSteps8.iWantToCreateTheGenericGetRequestAsUserIdAsUserNameAsClientIDAsExpandAs(String,String,String,String)"
});
formatter.result({
  "duration": 37825800,
  "status": "passed"
});
formatter.match({
  "location": "GenericRetrieveSteps8.iClickSendRequestForGenericRetrieveRequest()"
});
formatter.result({
  "duration": 10178904700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 50
    }
  ],
  "location": "GenericRetrieveSteps8.iShouldGetASuccessfulResponseAsStatusCodeForGenericRetrieveRequest(int)"
});
formatter.result({
  "duration": 1039400,
  "status": "passed"
});
formatter.match({
  "location": "GenericCalculateCnxChargeSteps9.iWantToCheckTheCancellationChargeOfTheBooking()"
});
formatter.result({
  "duration": 16016800,
  "status": "passed"
});
formatter.match({
  "location": "GenericCalculateCnxChargeSteps9.iClickSendGenericRequestForCalculateCancellationCharge()"
});
formatter.result({
  "duration": 12107001100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "GenericCalculateCnxChargeSteps9.iShouldGetASuccessfulResponseWithStatusCodeForCancellationChargeCalculation(int)"
});
formatter.result({
  "duration": 632300,
  "status": "passed"
});
formatter.match({
  "location": "GenericCalculateCnxChargeSteps9.displayTheCancellationChargeOfTheBooking()"
});
formatter.result({
  "duration": 13219400,
  "status": "passed"
});
});