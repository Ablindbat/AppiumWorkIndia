Feature: Provide details  of user.

  @smoke @details
  Scenario Outline: To click on choice on app
    Given I lunch the app
    And I signup with "<name>" and "<phone>" and submit
    And I complete city choice with tap city and provide "<location>" and submit
    And I choose my gender
    And I choose my qualification
    And I choose my school medium
    And I choose my speak english
    And I choose my status
    And I choose my age
    And I choose my interested
    When I click submit
    Then Open a new page.

    Examples: 
      | name         | phone      | location |
      | Rajib Mahato | 1234567890 | Thane    |
