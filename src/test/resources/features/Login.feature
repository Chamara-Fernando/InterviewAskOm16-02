Feature: Login feature of the askom website

  Scenario Outline: Log in with correct and incorrect username and passwords
    Given I am on the askom store login page
    When I enter a username  "<userName>"
    And I enter a password "<password>"
    And I click on login
    Then I should be logged on
    Examples:
      | userName     | password |
      | demouserTest | Test12   |
#      | demouser     | Test12   |





#  demouserTest
#        Test12