Feature: Test Event Feed functionality

  Background:
    When User enter valid username and password in login form
    And Clicks on Log in button
    Then Verify that the home page is displayed
  @Demo
  Scenario: Create Event Functionality
    When Navigate to the Event
    And Click on the Create Event button
    And Fill up all the event information
    And Click on the Save button
    Then Verify successfully text is appear
  @Demo
  Scenario: Comment on an Event
    When Navigate to the Event
    And Click on the Comment Text field
    And Enter short comment and click enter
    And Enter long comment and click enter
    And Click on the share button

  @Demo
  Scenario: Feed Dashboard Display
    When Navigate to the Event
    Then Verify that the event site name
    And Verify that the event title name
    And Verify that the event category and sub category
    And Verify that the event time
    And Verify that the event descriptions
    And Verify that the event comments
    And Verify that the pending event count indicator
    And Verify that the activate filter color

  @Demo
  Scenario: Verify Filter option in Event Feed
    When Navigate to the Event
    And Enter filter title
    And Select Filter site from dropdown
#    And Select event start and end date
    And Reset the filter widget after setting filters

  @Demo
  Scenario: Verify toggling of the Task button
    When Navigate to the Event
    And Click on the Task button and verify that icon color is red
    And Click on the Task button and verify that icon return to default state

  @Demo
  Scenario: Verify Task status visibility in Portfolio Status Page
    When Navigate to the Event
    And Click on the Portfolio tab
    Then Verify that total number of events in portfolio
    And Verify that the Tasks column is available

  @Demo
  Scenario: Verify the addition of Task checkbox in the search box on the Feed page
    When Navigate to the Event
    And Click on the Task checkbox and perform a search
    Then Verify that the search results are filtered

  @Demo
  Scenario: Verify the effectiveness of Filter function while switching between other tabs
    When Navigate to the Event
    And Enter filter title
    And Select Filter site from dropdown
    And Navigate to the site selector
    And Navigate to the Event
    Then Verify that the filter should reset after switching tabs

  @Demo
  Scenario: Verify the attachments remains unchanged after user edit an event
    When Navigate to the Event
    And Select a event from the list
    And Click on the Edit Button
    And Change the site title and description
    And Click on the Save button

