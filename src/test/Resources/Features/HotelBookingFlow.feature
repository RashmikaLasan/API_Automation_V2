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
    Then Store the Cart ID
    And Store the TravellersKey of Passenger One
    And Store the TravellersKey of Passenger Two
    Then check the Hotel Name is correct
    Then check the Hotel Code is correct
    Then check the Service Start Date is correct
    Then check the Service End Date is correct
    Then check the Nights Count is correct
    Then check the Choice Key is correct
    Then check the Price of the Booking is correct
    Then check the Room Type is correct
    Then check the Meal Plan is correct
    Then check the Pax Combination is correct

    #Update Passenger
    When I want to Create Update Passenger Body I Create Contact Details
    When I want to Create Update Passenger Body I Create Address Details
    When I want to Create Update Passenger Body I Create Profile Details
    When I want to Create Update Passenger Body I Create Reference Details
    When I want to Create Update Passenger Body I Create Payload Details of Passenger One
    When I want to Create Update Passenger Body I Create Payload Details of Passenger One
    When I want to Create Update Passenger Body I Create Payload Details of all the Passengers
    Then I Combined the Update Passenger details body
    When I create Update Passenger Body to Update Passenger Details
    Then I click send request for Update Passenger Request
    Then I should get a successful response as status code 200 Update Passenger



    Examples:
      | FutureDateCount | NightCount | HotelCode | City | PromoCode |
      | 60              | 3          | EAN179227 | LON  | CTPromo   |

#      | FutureDateCount    | NightCount | HotelCode | City |PromoCode|
#      | 60                 | 3          | EAN311048 | DXB  | CTPromo |