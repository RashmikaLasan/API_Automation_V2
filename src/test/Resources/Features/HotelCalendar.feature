Feature: Verify the Hotel Pricing Details

  @Htl @all @htlcal
  Scenario Outline: Verifying price for Hotel Calendar Request
    When I click create user HotelID as "<HotelID>" ToDate as "<StartDateCount>" FromDate as "<EndDateCount>" City as "<CityName>" Currency as "<Currency>"
    When I click create calendar body
    When I click send request for Hotel Calendar
    Then I should get a successful response with status code 200 for HTL Calendar Response
    And extract price from the response for StartDateCount Date
    And extract the price for dates
    And assert the Hotel Code is "<HotelID>"  in Response
    And assert the Currency Code is "<Currency>" in Response

#QA
    Examples:
      | HotelID        | StartDateCount | EndDateCount | CityName | Currency |
      | TRIEAN19681371 | 5              | 120          | NYC      | USD      |
      | TRIEAN1397608  | 5              | 120          | HKG      | GBP      |




#    ------------------------------------------------End------------------------------------------------------------

  @Htl @all @htlcalexcel
  Scenario Outline: Verifying price for Hotel Calendar Request by feeding the data from Excel Sheet
    When I click create user ToDate as "<StartDateCount>" FromDate as "<EndDateCount>"
    Then I should get a successful response with status code 200 for HTL Calendar Response


    Examples:
      | StartDateCount | EndDateCount |
      | 5              | 100          |