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



    Examples:
      | FutureDateCount | ProductCode | City |
      | 60              | VT108414P7  | LON  |


