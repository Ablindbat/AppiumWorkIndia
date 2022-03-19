Feature: Sign up test with a valid and invalid data in workindia app

  @smoke
  Scenario Outline: Signup with an invalid data.
  	Given I open the app
    And I entered my name "<name>"
    And I entered my phone number "<phone_number>"
    When I click on submit button
    Then Open a new page

    Examples: 
      | name         | phone_number |
      | Rajib Mahato |      6367376 |

  @smoke
  Scenario Outline: Signup with a valid data.
  	Given I open the app
    And I entered my name "<name>"
    And I entered my phone number "<phone_number>"
    When I click on submit button
    Then Open a new page

    Examples: 
      | name         | phone_number |
      | Rajib Mahato |   1234567890 |