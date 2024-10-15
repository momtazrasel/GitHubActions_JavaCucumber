Feature: Test Site Analytics functionality

  Background:
    When User enter valid username and password in login form
    And Clicks on Log in button
    Then Verify that the home page is displayed

  Scenario: Verify Default Filter State
    When Navigate to the Analytics
    Then Verify that the filter shows default selections or placeholders

  Scenario: Verify Filter Dropdown Functionality
    When Navigate to the Analytics
    Then Verify that all the filters are clickable

  Scenario: Verify Analytics Selection Functionality
    When Navigate to the Analytics
    And Click on the Analytics dropdown
    And Select Power option from dropdown
    And Select site from the dropdown
    Then Verify that the Power analytics data is displayed

