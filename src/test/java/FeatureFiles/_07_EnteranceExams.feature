Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login Successfully

  Scenario Outline: Create an Entrance Exam
    Given Go to entrance Exams Page
    And click on add button
    And Fill the form of create exam
    |<Exam Name>|
    And Create a description
    |<Description>|
    And Create a Note
    |<Note>|
    When click on save button
    Then Success message should be displayed

    Examples:
    Examples:
      | Exam Name        | Description                        | Note                            |
      | Batch 7 Exam 99  | Batch 7 is the bestie              | We are coming soon              |
      | Batch 7 Exam 100 | Batch 7 rocks all time             | Get prepared                    |
      | Batch 7 Exam 101 | Batch 7 is fun and good            | We are having fun               |
      | Batch 7 Exam 102 | Group 7 don't give up              | We can do this                  |
      | Batch 7 Exam 103 | We are almost ready to earn money  | But we are better than everyone |
