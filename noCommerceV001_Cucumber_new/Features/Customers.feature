Feature: Customer

  Scenario: Add new Customer
  
    Given user Launches the Browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enter the credentials "admin@yourstore.com" and "admin"
    And Click on Login button
    Then user can view dashboard
    When user click on Customer menu
    And click on customer menu item
    And click on Add new button
    Then user can view Add new customer page
    When user enter customer info
		And click on save button
		Then user can view confirmation message "The new customer has been added successfully"
		And close the browser