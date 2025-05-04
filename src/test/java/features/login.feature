Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I open the demoblaze home page
    When I login with username "testuser" and password "testpass"
    Then I should see the user logged in successfully
