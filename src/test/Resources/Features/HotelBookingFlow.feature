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

    #2.Add To Cart
    Then I want to Create Cart
    When I click send request for Create Cart Request
    Then I should get a successful response as status code 200 Add to Cart
    Then Store the Cart ID
    And Store the TravellersKey of Passenger One
    And Store the TravellersKey of Passenger Two
    Then check the Hotel Name is correct in Create Cart Response
    Then check the Hotel Code is correct in Create Cart Response
    Then check the Service Start Date is correct in Create Cart Response
    Then check the Service End Date is correct in Create Cart Response
    Then check the Nights Count is correct in Create Cart Response
    Then check the Choice Key is correct in Create Cart Response
    Then check the Price of the Booking is correct in Create Cart Response
    Then check the Room Type is correct in Create Cart Response
    Then check the Meal Plan is correct in Create Cart Response
    Then check the Pax Combination is correct in Create Cart Response

    #3.Update Passenger
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

    Then check the Cart ID is correct in Update Passenger Response
    Then check the Hotel Name is correct in Update Passenger Response
    Then check the Hotel Code is correct in Update Passenger Response
    Then check the Service Start Date is correct in Update Passenger Response
    Then check the Service End Date is correct in Update Passenger Response
    Then check the Nights Count is correct in Update Passenger Response
    Then check the Choice Key is correct in Update Passenger Response
    Then check the Price of the Booking is correct in Update Passenger Response
    Then check the Room Type is correct in Update Passenger Response
    Then check the Meal Plan is correct in Update Passenger Response
    Then check the Pax Combination is correct in Update Passenger Response


    #4.Create Payment Session
    When I want to create Payment Session with Payment Currency as "<Currency>"
    When I click send request for Create Payment Session Request
    Then I should get a successful response as status code 200 for Create Payment Session

    Then Store the Payment Reference in Create Payment Session response
    Then check the payment Amount is correct in Create Payment Session response
    Then check the Transaction Identifier is equal to the Cart ID in Create Payment Session response


    #5.Capture Payment
    Given I want to send the Capture Payment Request where Card Type as "<cardType>" and Currency as "<Currency>"
    Then I click send request for Capture Payment Request
    Then I should get a successful response as status code 200 for Capture Payment Request


    #6.Add Payment
    Given I want to create Unique ID in Add Payment Body
    Given I want to create Payment Details in Add Payment Body where Card Type as "<cardType>"
    Given I want to create Payment Info  in Add Payment Body
    Given I want to create Note in Add Payment Body
    Then I want to Merge the Full Body
    Then I click send request for Add Payment Request
    Then I should get a successful response as status code 200 for Add Payment Request







    Examples:
      | FutureDateCount | NightCount | HotelCode | City | PromoCode | Currency | cardType |
      | 60              | 3          | EAN179227 | LON  | CTPromo   | GBP      | VISA     |

#      | FutureDateCount    | NightCount | HotelCode | City |PromoCode|
#      | 60                 | 3          | EAN311048 | DXB  | CTPromo |