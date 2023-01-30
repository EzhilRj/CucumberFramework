Feature: Login

  Scenario: Successfull Login With Valid Credentials
    Given User Launch Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click Logout Button
    Then  Page title should be "Your store. Login"
    And Close Browser

  Scenario Outline: Login Data Driven
    Given User Launch Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "<email>" and Password as "<Password>"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User Click Logout Button
    Then  Page title should be "Your store. Login"
    And Close Browser
    Examples:
      | email |Password|
      |admin@yourstore.com|admin|
      |admin@yourstore1.com|admin1|

