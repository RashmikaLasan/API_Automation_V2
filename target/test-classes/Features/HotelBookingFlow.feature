Feature: Verify the V2 Hotel Flow

  @htlpromo
  Scenario Outline: Verifying V2 HTL Flow with the PromoCode
    Given I want to search for Hotel Availability search for two Adults
    When I Enter the checkIn date as "<FutureDateCount>" Night Count as "<NightCount>" Hotel Code as "<HotelCode>" City as "<City>"
    Then I should get a successful response as status code 200
    And Store the Data Body
    And Store the total Price of the Booking





    Examples:
#      | FutureDateCount    | NightCount | HotelCode | City |PromoCode|
#      | 60                 | 3          | EAN449003 | HKG  | CTPromo |

      | FutureDateCount    | NightCount | HotelCode | City |PromoCode|
      | 60                 | 3          | EAN311048 | DXB  | CTPromo |