Feature: Verify the V2 Generic Booking Flow

  @gennopromo
  Scenario Outline: Verifying V2 HTL Flow without the PromoCode
    #1.Generic Search
    Given I Enter the checkIn date as "<FutureDateCount>" Product Code as "<ProductCode>" City as "<City>" Brand as "<Brand>" Currency as "<Currency>" Division as "<Division>" for two Adults
    When I click send request for Generic Search Request
    Then I should get a successful response as status code 200 for Generic Search
    And Store the Generic Key Controls
    And Store Generic Payload
    Then Store the Product Name
    Then Store the Product Code
    Then Store the Generic Service Start Date
    Then Store the Duration of Tour
    Then Store the Generic Service End Date
    Then Store the Generic Choice Key
    Then Store the Price of the Generic Search
    Then Store the Category Code
    Then Store the Category Name
    Then Store the Generic Pax Combination


    #2.Add To Cart
    Then I want to Create Generic Cart
    When I click send request for Generic Create Cart Request
    Then I should get a successful response as status code 200 for Generic Create Cart
    Then Store the Generic Cart ID
    And Store the Generic TravellersKey of Passenger One
    And Store the Generic TravellersKey of Passenger Two

    Then check the Product Name is correct in Generic Create Cart Response
    Then check the Product Code is correct in Generic Create Cart Response
    Then check the Generic Service Start Date is correct in Generic Create Cart Response
    Then check the Generic Service End Date is correct in Generic Create Cart Response
#    Then check the Choice Key is correct in Create Cart Response
    Then check the Price of the Product is correct in Generic Create Cart Response
    Then check the Category Code is correct in Create Cart Response
    Then check the Category Name is correct in Create Cart Response
    Then check the Pax Combination is correct in Generic Create Cart Response


    #4.Update Passenger
    When I want to Create Update Passenger Body I Create Gen Contact Details
    When I want to Create Update Passenger Body I Create Gen Address Details
    When I want to Create Update Passenger Body I Create Gen Profile Details
    When I want to Create Update Passenger Body I Create Gen Reference Details
    When I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One
    When I want to Create Update Passenger Body I Create Gen Payload Details of Passenger One
    When I want to Create Update Passenger Body I Create Gen Payload Details of all the Passengers
    Then I Combined the Gen Update Passenger details body
    When I create Gen Update Passenger Body to Update Passenger Details
    Then I click send request for Gen Update Passenger Request
    Then I should get a successful response as status code 200 Gen Update Passenger

    Then check the Cart ID is correct in Generic Update Passenger Response
    Then check the Product Name is correct in Generic Update Passenger Response
    Then check the Product Code is correct in Generic Update Passenger Response
    Then check the Generic Service Start Date is correct in Generic Update Passenger Response
    Then check the Generic Service End Date is correct in Generic Update Passenger Response
#    Then check the Choice Key is correct in Generic Update Passenger Response
    Then check the Price of the Product is correct in Generic Update Passenger Response
    Then check the Category Code is correct in Generic Update Passenger Response
    Then check the Category Name is correct in Generic Update Passenger Response
    Then check the Pax Combination is correct in Generic Update Passenger Response


    #5.Create Payment Session
    When I want to create Generic Payment Session with Payment Currency as "<Currency>" Brand as "<Brand>" Batch Receipt as "<batchReceiptInfo>"
    When I click send request for Generic Create Payment Session Request
    Then I should get a successful response as status code 200 for Generic Create Payment Session

    Then Store the Payment Reference in Generic Create Payment Session response
    Then check the payment Amount is correct in Generic Create Payment Session response
    Then check the Transaction Identifier is equal to the Cart ID in Generic Create Payment Session response
    Then check the Payment Currency is "<Currency>"


    #6.Capture Payment
    Given I want to send the Generic Capture Payment Request where Card Type as "<cardType>" and Currency as "<Currency>" Batch Receipt as "<batchReceiptInfo>" Brand as "<Brand>"
    Then I click send request for Generic Capture Payment Request
    Then I should get a successful response as status code 200 for Generic Capture Payment Request


    #7.Add Payment
    Given I want to create Unique ID in Generic Add Payment Body
    Given I want to create Payment Details in Generic Add Payment Body where Card Type as "<cardType>"
    Given I want to create Payment Info in Generic Add Payment Body where Currency as "<Currency>"
    Then I want to Merge Full Body of Generic Add Payment Body
    Then I click send request for Generic Add Payment Request
    Then I should get a successful response as status code 200 for Generic Add Payment Request


    #7.Confirm Cart
    Given I want to Generic Confirm Booking by creating the Confirm Cart Body
    Then I click send Generic request for Confirm Cart
    Then I should get a successful response as status code 200 for Generic Confirm Cart Request

    Then Store the Generic Booking ID in Confirm Cart Response
    And Store the Generic Booking Reference in Confirm Cart Response


    #Booking Retrieve
    Given I want to create the Generic Get Request as userId as "877" UserName as "codegen" ClientID as "-1" Expand as "all"
    When I click send Request for Generic Retrieve Request
    Then I should get a successful response as status code 200 for Generic Retrieve Request


    #Calculate the Cancellation Charge
    When I want to check the Cancellation Charge of the Booking
    Then I click send Generic request for Calculate Cancellation Charge
    Then I should get a successful response with status code 200 for Cancellation Charge Calculation
    And display the Cancellation charge of the booking


    #Cancel the Booking
    Then I create the Cancellation Request confirm as "true" reason as 2 cause as 499 userID as 8778 bkgSource as "TC" tbxOnly as "false" cnxEmptyBkg as "true"
    When I send the Generic Cancellation Request
    Then I should get a successful response with status code 200 for Booking Cancellation
    And display the message of response of Cancellation Response

    Examples:
      | FutureDateCount | ProductCode | City | Currency | Brand | cardType | batchReceiptInfo                      | Division |
      | 90              | VT108266P12 | DXB  | GBP      | CT_OL | VISA     | pm_card_amex_threeDSecureNotSupported | CT_LON   |


