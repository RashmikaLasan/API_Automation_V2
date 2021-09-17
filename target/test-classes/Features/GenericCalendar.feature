Feature: Verify the Pricing Calendar Details


  @cba @all @gencala
  Scenario Outline: Verifying price for Generic Calendar Request
    When I click Gen Product Availability of "<productID>" FromDate as "<StartDateCount>" ToDate as "<EndDateCount>"
    Then I should get a successful response with status code 200 for Gen Calendar
    And response should return Product Name as "<SupplierName>" in response
    And response should return Product Code as "<productID>"
    And extract Gen Calendar Price from the response response for StartDateCount Date

    Examples:

      | productID  | StartDateCount | EndDateCount | SupplierName                                                                   |
      | VT10211P47 | 30             | 120          | San Francisco Embarcadero Scavenger Hunt Adventure                             |
      | VT100648P1 | 30             | 120          | Colosseum Tour Express for Kids & Families in Rome with local guide Alessandra |
