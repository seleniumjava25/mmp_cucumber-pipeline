Feature:  User Login
  Scenario: Successful Login
    Given the user is on the eCommerce login page
    When the user enter valid credentials as username:"iitworkforce" and  password: "IITWorkforce1!"
    And the user clicks on the Login button
    Then the user should be redirected to the  products