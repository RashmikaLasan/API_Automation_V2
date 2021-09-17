$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GenericCalendar.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Pricing Calendar Details",
  "description": "",
  "id": "verify-the-pricing-calendar-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verifying price for Generic Calendar Request",
  "description": "",
  "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@cba"
    },
    {
      "line": 4,
      "name": "@all"
    },
    {
      "line": 4,
      "name": "@gencala"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click Gen Product Availability of \"\u003cproductID\u003e\" FromDate as \"\u003cStartDateCount\u003e\" ToDate as \"\u003cEndDateCount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a successful response with status code 200 for Gen Calendar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "response should return Product Name as \"\u003cSupplierName\u003e\" in response",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "response should return Product Code as \"\u003cproductID\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract Gen Calendar Price from the response response for StartDateCount Date",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;",
  "rows": [
    {
      "cells": [
        "productID",
        "StartDateCount",
        "EndDateCount",
        "SupplierName"
      ],
      "line": 14,
      "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;;1"
    },
    {
      "cells": [
        "VT10211P47",
        "30",
        "120",
        "San Francisco Embarcadero Scavenger Hunt Adventure"
      ],
      "line": 15,
      "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;;2"
    },
    {
      "cells": [
        "VT100648P1",
        "30",
        "120",
        "Colosseum Tour Express for Kids \u0026 Families in Rome with local guide Alessandra"
      ],
      "line": 16,
      "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Verifying price for Generic Calendar Request",
  "description": "",
  "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@gencala"
    },
    {
      "line": 4,
      "name": "@cba"
    },
    {
      "line": 4,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click Gen Product Availability of \"VT10211P47\" FromDate as \"30\" ToDate as \"120\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a successful response with status code 200 for Gen Calendar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "response should return Product Name as \"San Francisco Embarcadero Scavenger Hunt Adventure\" in response",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "response should return Product Code as \"VT10211P47\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract Gen Calendar Price from the response response for StartDateCount Date",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "VT10211P47",
      "offset": 37
    },
    {
      "val": "30",
      "offset": 62
    },
    {
      "val": "120",
      "offset": 77
    }
  ],
  "location": "GenericCalendarSteps.i_click_gen_product_availability_of_something_fromdate_as_something_todate_as_something(String,int,int)"
});
formatter.result({
  "duration": 12903432799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "GenericCalendarSteps.i_should_get_a_successful_response_with_status_code_200_for_gen_calendar(int)"
});
formatter.result({
  "duration": 48380601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "San Francisco Embarcadero Scavenger Hunt Adventure",
      "offset": 40
    }
  ],
  "location": "GenericCalendarSteps.response_should_return_product_name_as_something_in_response(String)"
});
formatter.result({
  "duration": 896256299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VT10211P47",
      "offset": 40
    }
  ],
  "location": "GenericCalendarSteps.response_should_return_product_code_as_something(String)"
});
formatter.result({
  "duration": 272147300,
  "status": "passed"
});
formatter.match({
  "location": "GenericCalendarSteps.extract_gen_calendar_price_from_the_response_response_for_startdatecount_date()"
});
formatter.result({
  "duration": 3897293000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verifying price for Generic Calendar Request",
  "description": "",
  "id": "verify-the-pricing-calendar-details;verifying-price-for-generic-calendar-request;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@gencala"
    },
    {
      "line": 4,
      "name": "@cba"
    },
    {
      "line": 4,
      "name": "@all"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click Gen Product Availability of \"VT100648P1\" FromDate as \"30\" ToDate as \"120\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a successful response with status code 200 for Gen Calendar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "response should return Product Name as \"Colosseum Tour Express for Kids \u0026 Families in Rome with local guide Alessandra\" in response",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "response should return Product Code as \"VT100648P1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "extract Gen Calendar Price from the response response for StartDateCount Date",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "VT100648P1",
      "offset": 37
    },
    {
      "val": "30",
      "offset": 62
    },
    {
      "val": "120",
      "offset": 77
    }
  ],
  "location": "GenericCalendarSteps.i_click_gen_product_availability_of_something_fromdate_as_something_todate_as_something(String,int,int)"
});
formatter.result({
  "duration": 5241140200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 52
    }
  ],
  "location": "GenericCalendarSteps.i_should_get_a_successful_response_with_status_code_200_for_gen_calendar(int)"
});
formatter.result({
  "duration": 1588801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Colosseum Tour Express for Kids \u0026 Families in Rome with local guide Alessandra",
      "offset": 40
    }
  ],
  "location": "GenericCalendarSteps.response_should_return_product_name_as_something_in_response(String)"
});
formatter.result({
  "duration": 24063100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VT100648P1",
      "offset": 40
    }
  ],
  "location": "GenericCalendarSteps.response_should_return_product_code_as_something(String)"
});
formatter.result({
  "duration": 21582300,
  "status": "passed"
});
formatter.match({
  "location": "GenericCalendarSteps.extract_gen_calendar_price_from_the_response_response_for_startdatecount_date()"
});
formatter.result({
  "duration": 1514451499,
  "status": "passed"
});
});