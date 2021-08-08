Feature: Verify the V2 Generic Flow

  @gennopromo
  Scenario Outline: Verifying V2 HTL Flow without the PromoCode
    #Generic Search
    Given I Enter the checkIn date as "<FutureDateCount>" Product Code as "<ProductCode>" City as "<City>" for two Adults
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

#    Then check the Hotel Name is correct in Create Cart Response
#    Then check the Hotel Code is correct in Create Cart Response
#    Then check the Service Start Date is correct in Create Cart Response
#    Then check the Service End Date is correct in Create Cart Response
#    Then check the Nights Count is correct in Create Cart Response
##    Then check the Choice Key is correct in Create Cart Response
#    Then check the Price of the Booking is correct in Create Cart Response
#    Then check the Room Type is correct in Create Cart Response
#    Then check the Meal Plan is correct in Create Cart Response
#    Then check the Pax Combination is correct in Create Cart Response

    Examples:
      | FutureDateCount | ProductCode | City |
      | 60              | VT108414P7  | LON  |


