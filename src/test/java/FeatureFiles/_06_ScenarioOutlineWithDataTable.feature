Feature: Scenario Outline with data table

  Scenario Outline: Scenario 1
    Given Step One
   |Step1 |<Round Value1>|
    When Step Two
    And Step Three
    |Step 3|<Round Value2>|
    Then Step Four

    Examples:
    |Round Value1|Round Value2|
    |Round 1 Value 1|Round 1 value 2|
    |Round 2 Value 1|Round 2 value 2|
    |Round 3 Value 1|Round 3 value 2|
    |Round 4 Value 1|Round 4 value 2|

