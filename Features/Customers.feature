Feature: Customers

  Scenario: Add a new Customer
    Given User Launch Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can View Dashboard
    When User Click on Customer menu
    And click on Customers menu Item
    And Click on Addnew Button
    Then User Can view Add new Customer Page
    When User Enter Customer Info
    And Click on Save Button
    Then User Can view Confirmation message "The new customer has been added successfully"
    And Close Browser



