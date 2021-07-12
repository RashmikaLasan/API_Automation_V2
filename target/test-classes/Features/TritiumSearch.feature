Feature: Verify the Tritium Pricing Details

  @Htl @all @trit
  Scenario Outline: Verifying Price for  Tritium Request
    Given create body tritiumRequest HotelID as "<HotelID>" FromDate as "<StartDateCount>" ToDate as "<EndDateCount>"
    When I click create Tritium Request Body
    When I click send request
    Then I should get a successful response with status code 200 for Tritium Response
    And HotelID "<HotelID>" should be matched in response
    And extract price from the Tritium response

    Examples:
      | HotelID       | StartDateCount   | EndDateCount |
      |   EAN11919372 |  30              |  31          |
