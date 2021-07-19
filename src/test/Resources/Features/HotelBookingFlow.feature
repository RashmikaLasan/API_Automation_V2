Feature: Verify the V2 Hotel Flow

  @htlpromo
  Scenario Outline: Verifying V2 HTL Flow with the PromoCode
    Given I Enter the checkIn date as "<FutureDateCount>" Night Count as "<NightCount>" Hotel Code as "<HotelCode>" City as "<City>" for two Adults
    When I click send request for Hotel Search Request
    Then I should get a successful response as status code 200 for Hotel Search
    And Store the Key Controls
    And Store Payload
    Then Store the Hotel Name
    Then Store the Hotel Code
    Then Store the Service Start Date
    Then Store the Service End Date
    Then Store the Nights Count
    Then Store the Choice Key
    Then Store the Price of the Booking
    Then Store the Room Type
    Then Store the Meal Plan
    Then Store the Pax Combination

    #Add To Cart
    Then I want to Create Cart
    When I click send request for Create Cart Request
    Then I should get a successful response as status code 200 Add to Cart





    Examples:
      | FutureDateCount | NightCount | HotelCode | City | PromoCode |
      | 60              | 3          | EAN449003 | HKG  | CTPromo   |
#
#      | FutureDateCount    | NightCount | HotelCode | City |PromoCode|
#      | 60                 | 3          | EAN311048 | DXB  | CTPromo |