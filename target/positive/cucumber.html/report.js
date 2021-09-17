$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HotelCalendar.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Hotel Pricing Details",
  "description": "",
  "id": "verify-the-hotel-pricing-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying price for Hotel Calendar Request",
  "description": "",
  "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Htl"
    },
    {
      "line": 3,
      "name": "@all"
    },
    {
      "line": 3,
      "name": "@htlcal"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click create user HotelID as \"\u003cHotelID\u003e\" ToDate as \"\u003cStartDateCount\u003e\" FromDate as \"\u003cEndDateCount\u003e\" City as \"\u003cCityName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click create calendar body",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click send request for Hotel Calendar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response with status code 200 for HTL Calendar Response",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "extract price from the response for StartDateCount Date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract the price for dates",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 12,
      "value": "#QA"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;",
  "rows": [
    {
      "cells": [
        "HotelID",
        "StartDateCount",
        "EndDateCount",
        "CityName"
      ],
      "line": 14,
      "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;1"
    },
    {
      "cells": [
        "TRIEAN19681371",
        "5",
        "120",
        "NYC"
      ],
      "line": 15,
      "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;2"
    },
    {
      "cells": [
        "TRIEAN1397608",
        "5",
        "120",
        "HKG"
      ],
      "line": 16,
      "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Verifying price for Hotel Calendar Request",
  "description": "",
  "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@htlcal"
    },
    {
      "line": 3,
      "name": "@Htl"
    },
    {
      "line": 3,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click create user HotelID as \"TRIEAN19681371\" ToDate as \"5\" FromDate as \"120\" City as \"NYC\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click create calendar body",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click send request for Hotel Calendar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response with status code 200 for HTL Calendar Response",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "extract price from the response for StartDateCount Date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract the price for dates",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "TRIEAN19681371",
      "offset": 32
    },
    {
      "val": "5",
      "offset": 59
    },
    {
      "val": "120",
      "offset": 75
    },
    {
      "val": "NYC",
      "offset": 89
    }
  ],
  "location": "HotelCalendarSteps.iClickCreateUserHotelIDAsToDateAsFromDateAsCityAs(String,int,int,String)"
});
formatter.result({
  "duration": 157394700,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickCreateCalendarBody()"
});
formatter.result({
  "duration": 663638700,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickSendRequestForHotelCalendar()"
});
formatter.result({
  "duration": 12223159400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "HotelCalendarAssertionSteps.iShouldGetASuccessfulResponseWithStatusCodeForHTLCalendarResponse(int)"
});
formatter.result({
  "duration": 125435500,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.extractPriceFromTheResponseForStartDateCountDate()"
});
formatter.result({
  "duration": 1104883000,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.extractThePriceForDates()"
});
formatter.result({
  "duration": 5417490500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verifying price for Hotel Calendar Request",
  "description": "",
  "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@htlcal"
    },
    {
      "line": 3,
      "name": "@Htl"
    },
    {
      "line": 3,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I click create user HotelID as \"TRIEAN1397608\" ToDate as \"5\" FromDate as \"120\" City as \"HKG\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click create calendar body",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click send request for Hotel Calendar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response with status code 200 for HTL Calendar Response",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "extract price from the response for StartDateCount Date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract the price for dates",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "TRIEAN1397608",
      "offset": 32
    },
    {
      "val": "5",
      "offset": 58
    },
    {
      "val": "120",
      "offset": 74
    },
    {
      "val": "HKG",
      "offset": 88
    }
  ],
  "location": "HotelCalendarSteps.iClickCreateUserHotelIDAsToDateAsFromDateAsCityAs(String,int,int,String)"
});
formatter.result({
  "duration": 28202800,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickCreateCalendarBody()"
});
formatter.result({
  "duration": 1399700,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickSendRequestForHotelCalendar()"
});
formatter.result({
  "duration": 5166097100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "HotelCalendarAssertionSteps.iShouldGetASuccessfulResponseWithStatusCodeForHTLCalendarResponse(int)"
});
formatter.result({
  "duration": 11354300,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.extractPriceFromTheResponseForStartDateCountDate()"
});
formatter.result({
  "duration": 20554000,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.extractThePriceForDates()"
});
formatter.result({
  "duration": 3413997500,
  "status": "passed"
});
});