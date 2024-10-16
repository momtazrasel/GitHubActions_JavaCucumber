Feature: Test Site Selector functionality

  @Demo
  Scenario: Verify Domain based site selector access
    When Log in using domain credentials
    And Clicks on Log in button
    When Navigate to the site selector
    Then Verify that all domain based sites are available

  @Demo
  Scenario: Verify Company based site selector access
    When Log in using company credentials
    And Clicks on Log in button
    When Navigate to the site selector
    Then Verify that all company based sites are available

  @Demo
  Scenario: Verify Super Admin based site selector access
    When Log in using super admin credentials
    And Clicks on Log in button
    When Navigate to the site selector
#    Then Verify that all super admin based sites are available


