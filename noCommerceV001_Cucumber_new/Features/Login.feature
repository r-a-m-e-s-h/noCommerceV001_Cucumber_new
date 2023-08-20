Feature: Login

  Scenario: This is Login Scenario
  
    Given user Launches the Browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enter the credentials "admin@yourstore.com" and "admin"
    And Click on Login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout button
    Then page title should be "Your store. Login"
    And close the browser

  Scenario Outline: This is Data Driven Scenario
  
    Given user Launches the Browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enter the credentials "<UserName>" and "<PassWord>"
    And Click on Login Button
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout button
    Then page title should be "Your store. Login"
    And close the browser

    Examples: 
      | UserName            |  | PassWord |
      | admin@yourstore.com |  | admin    |
      | admin@yourstore.com |  | admin123 |
