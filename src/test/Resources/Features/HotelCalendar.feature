Feature: Verify the Hotel Pricing Details

  @Htl @all @htlcal
  Scenario Outline: Verifying price for Hotel Calendar Request
    When I click create user HotelID as "<HotelID>" ToDate as "<StartDateCount>" FromDate as "<EndDateCount>" City as "<CityName>"
    When I click create calendar body
    When I click send request for Hotel Calendar
    Then I should get a successful response with status code 200 for HTL Calendar Response
    And extract price from the response for StartDateCount Date


    Examples:
      | HotelID     | StartDateCount    | EndDateCount    |CityName|
      | EAN115066   |   5               |  120            | DXB    |