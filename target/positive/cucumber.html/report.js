$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HotelCalendar.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Hotel Pricing Calendar Details",
  "description": "",
  "id": "verify-the-hotel-pricing-calendar-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 35,
      "value": "#------------------------------------------------End------------------------------------------------------------"
    }
  ],
  "line": 38,
  "name": "Verifying price for Gen Cancellation Policy Request by feeding the data from Excel Sheet",
  "description": "",
  "id": "verify-the-hotel-pricing-calendar-details;verifying-price-for-gen-cancellation-policy-request-by-feeding-the-data-from-excel-sheet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@Htl"
    },
    {
      "line": 37,
      "name": "@all"
    },
    {
      "line": 37,
      "name": "@viatorcalexcel"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I click create user productCode as \"\u003cproductCode\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 40,
      "value": "#    Then I should get a successful response with status code 200 for Viator Response"
    }
  ],
  "line": 43,
  "name": "",
  "description": "",
  "id": "verify-the-hotel-pricing-calendar-details;verifying-price-for-gen-cancellation-policy-request-by-feeding-the-data-from-excel-sheet;",
  "rows": [
    {
      "cells": [
        "productCode",
        "EndDateCount"
      ],
      "line": 44,
      "id": "verify-the-hotel-pricing-calendar-details;verifying-price-for-gen-cancellation-policy-request-by-feeding-the-data-from-excel-sheet;;1"
    },
    {
      "cells": [
        "5",
        "100"
      ],
      "line": 45,
      "id": "verify-the-hotel-pricing-calendar-details;verifying-price-for-gen-cancellation-policy-request-by-feeding-the-data-from-excel-sheet;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 45,
  "name": "Verifying price for Gen Cancellation Policy Request by feeding the data from Excel Sheet",
  "description": "",
  "id": "verify-the-hotel-pricing-calendar-details;verifying-price-for-gen-cancellation-policy-request-by-feeding-the-data-from-excel-sheet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 37,
      "name": "@viatorcalexcel"
    },
    {
      "line": 37,
      "name": "@Htl"
    },
    {
      "line": 37,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I click create user productCode as \"5\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 36
    }
  ],
  "location": "HotelCalendarSteps.iClickCreateUserProductCodeAs(String)"
});
formatter.result({
  "duration": 3611705777700,
  "status": "passed"
});
});