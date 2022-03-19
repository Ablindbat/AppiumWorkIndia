Feature: Choose city from this page.

  @smoke @city
  Scenario Outline: Choose city with valid Railway station.
    Given I open the app for choose city
    And I entered my name "<name>" and "<phone_number>"
    And I click submit button
    And I click one of city button
    And I enter a nearest Railway station "<location>"
    When I hide key board and click submit button
    Then I entered to next page successfully.

    Examples: 
      | name         | phone_number | location |
      | Rajib Mahato |   1234567890 | Thane    |

  Scenario Outline: Choose city with invalid  Railway station
    Given I open the app for choose city
    And I entered my name "<name>" and "<phone_number>"
    And I click submit button
    And I click one of city button
    And I enter a nearest Railway station "<location>"
    When I hide key board and click submit button
    Then I not entered to next page successfully.

    Examples: 
      | name         | phone_number | location |
      | Rajib Mahato |   1234567890 |          |
