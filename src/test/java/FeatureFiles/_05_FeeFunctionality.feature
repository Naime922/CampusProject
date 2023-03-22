Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login Successfully
    Given Navigate to Fee Page

  Scenario: Create A Fee
    And click on add button
    And Fill the add fee form
      | Batch 7 Fee |
      | b7          |
      | bt7         |
      | 567         |
    When click on save button
    Then Success message should be displayed

  Scenario: Delete Fee
    Given Searh for the Fee
      | Batch 7 Fee |
      | b7          |
      | 567         |
    When Delete Fee
    Then Success message should be displayed