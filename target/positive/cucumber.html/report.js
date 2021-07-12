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
formatter.examples({
  "line": 12,
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
      "line": 13,
      "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;1"
    },
    {
      "cells": [
        "EAN115066",
        "5",
        "120",
        "DXB"
      ],
      "line": 14,
      "id": "verify-the-hotel-pricing-details;verifying-price-for-hotel-calendar-request;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
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
  "name": "I click create user HotelID as \"EAN115066\" ToDate as \"5\" FromDate as \"120\" City as \"DXB\"",
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
formatter.match({
  "arguments": [
    {
      "val": "EAN115066",
      "offset": 32
    },
    {
      "val": "5",
      "offset": 54
    },
    {
      "val": "120",
      "offset": 70
    },
    {
      "val": "DXB",
      "offset": 84
    }
  ],
  "location": "HotelCalendarSteps.iClickCreateUserHotelIDAsToDateAsFromDateAsCityAs(String,int,int,String)"
});
formatter.result({
  "duration": 265512200,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickCreateCalendarBody()"
});
formatter.result({
  "duration": 1206188500,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.iClickSendRequestForHotelCalendar()"
});
formatter.result({
  "duration": 4272500700,
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
  "duration": 278610200,
  "status": "passed"
});
formatter.match({
  "location": "HotelCalendarSteps.extractPriceFromTheResponseForStartDateCountDate()"
});
formatter.result({
  "duration": 797293200,
  "status": "passed"
});
formatter.uri("TritiumSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Tritium Pricing Details",
  "description": "",
  "id": "verify-the-tritium-pricing-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verifying Price for  Tritium Request",
  "description": "",
  "id": "verify-the-tritium-pricing-details;verifying-price-for--tritium-request",
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
      "name": "@trit"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "create body tritiumRequest HotelID as \"\u003cHotelID\u003e\" FromDate as \"\u003cStartDateCount\u003e\" ToDate as \"\u003cEndDateCount\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click create Tritium Request Body",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click send request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response with status code 200 for Tritium Response",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "HotelID \"\u003cHotelID\u003e\" should be matched in response",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract price from the Tritium response",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-tritium-pricing-details;verifying-price-for--tritium-request;",
  "rows": [
    {
      "cells": [
        "HotelID",
        "StartDateCount",
        "EndDateCount"
      ],
      "line": 13,
      "id": "verify-the-tritium-pricing-details;verifying-price-for--tritium-request;;1"
    },
    {
      "cells": [
        "EAN11919372",
        "30",
        "31"
      ],
      "line": 14,
      "id": "verify-the-tritium-pricing-details;verifying-price-for--tritium-request;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Verifying Price for  Tritium Request",
  "description": "",
  "id": "verify-the-tritium-pricing-details;verifying-price-for--tritium-request;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@trit"
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
  "name": "create body tritiumRequest HotelID as \"EAN11919372\" FromDate as \"30\" ToDate as \"31\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click create Tritium Request Body",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click send request",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a successful response with status code 200 for Tritium Response",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "HotelID \"EAN11919372\" should be matched in response",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract price from the Tritium response",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "EAN11919372",
      "offset": 39
    },
    {
      "val": "30",
      "offset": 65
    },
    {
      "val": "31",
      "offset": 80
    }
  ],
  "location": "TritiumSearchSteps.createBodyTritiumRequestHotelIDAsFromDateAsToDateAs(String,int,int)"
});
formatter.result({
  "duration": 164913900,
  "status": "passed"
});
formatter.match({
  "location": "TritiumSearchSteps.iClickCreateTritiumRequestBody()"
});
formatter.result({
  "duration": 160577700,
  "status": "passed"
});
formatter.match({
  "location": "TritiumSearchSteps.iClickSendRequest()"
});
formatter.result({
  "duration": 2018371800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "TritiumSearchAssertionSteps.iShouldGetASuccessfulResponseWithStatusCodeForTritiumResponse(int)"
});
formatter.result({
  "duration": 9085200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EAN11919372",
      "offset": 9
    }
  ],
  "location": "TritiumSearchAssertionSteps.hotelidShouldBeMatchedInResponse(String)"
});
formatter.result({
  "duration": 463967500,
  "status": "passed"
});
formatter.match({
  "location": "TritiumSearchSteps.extractPriceFromTheTritiumResponse()"
});
formatter.result({
  "duration": 174673500,
  "status": "passed"
});
});