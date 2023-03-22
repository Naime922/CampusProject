Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login Successfully
    And Navigate to County page

  Scenario: Create Country
    #   Given Navigate to Campus
   #   When Enter username and password
   #   And Click on Login Button
   #  Then User should login Successfully
    #  And Navigate to County page
    When Create a new country
    Then Success message should be displayed

    Scenario: Delete Country
#      Given Navigate to Campus
#      When Enter username and password
#      And Click on Login Button
#      Then User should login Successfully
#      And Navigate to County page
      When Delete country
      Then Success message should be displayed

      Scenario:
        And click on add button
        When Enter country name as "USA93" and code as "U45"
        And click on save button
        Then Success message should be displayed

  Scenario: Delete Country
    When Delete country
    Then Success message should be displayed
