Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login Successfully
    Given Navigate to Citizenships page

    Scenario Outline: Create a Citizenship
      And click on add button
      And enter Citizenship Name As "<CitizenshipName>" And "<CitizenshipShortName>"
      When click on save button
      Then Success message should be displayed
      Examples:
        |CitizenshipName  |CitizenshipShortName|
      |NMK1              |nk1                  |
      |NMK2              |nk2                  |
      |NMK3              |nk3                  |
      |NMK4              |nk4                  |

      Scenario Outline:
        And Search for Citizenship name as "<CitizenshipName>" and "<CitizenshipShortName>"
        And Delete citizenship
        Then Success message should be displayed
        Examples:
          |CitizenshipName  |CitizenshipShortName|
          |NMK1              |nk1                  |
          |NMK2              |nk2                  |
          |NMK3              |nk3                  |
          |NMK4              |nk4                  |
