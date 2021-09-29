Feature: Verify the Generic Pricing Calendar Details


  @cba @all @gencala @calc
  Scenario Outline: Verifying price for Generic Calendar Request
    When I click Gen Product Availability of "<productID>" FromDate as "<StartDateCount>" ToDate as "<EndDateCount>" Currency as "<Currency>"
    Then I should get a successful response with status code 200 for Gen Calendar
    And response should return Product Name as "<SupplierName>" in response
    And response should return Product Code as "<productID>"
    And extract Gen Calendar Price from the response response for StartDateCount Date

    Examples:

      | productID  | StartDateCount | EndDateCount | SupplierName                                                                   | Currency |
      | VT10211P47 | 30             | 120          | San Francisco Embarcadero Scavenger Hunt Adventure                             | GBP      |
      | VT100648P1 | 30             | 120          | Colosseum Tour Express for Kids & Families in Rome with local guide Alessandra | USD      |
