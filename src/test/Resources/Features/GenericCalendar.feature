Feature: Verify the Pricing Calendar Details


  @cba @all @gencala
  Scenario Outline: Verifying price for Generic Calendar Request
#    Given I want to search for one Viator Product
    When I click Gen Product Availability of "<productID>" FromDate as "<StartDateCount>" ToDate as "<EndDateCount>"
    Then I should get a successful response with status code 200 for Gen Calendar
    And response should return Product Name as "<SupplierName>" in response
    And response should return Product Code as "<productID>"
#    And extract Gen Calendar Price from the response response for StartDateCount Date
    Examples:
#      | productID | FromDate        | ToDate      |SupplierName|
#      | VT12596P7 | 2021-06-01    |  2021-08-30   |Evening Desert Safari With BBQ Dinner, Henna Painting, Camel Ride and Belly Dance|
      | productID  | StartDateCount | EndDateCount | SupplierName                                       |
      | VT10211P47 | 30             | 120          | San Francisco Embarcadero Scavenger Hunt Adventure |
#      | VT100648P1 | 30             | 120            | Colosseum Tour Express for Kids & Families in Rome with local guide Alessandra              |
