
Feature: this feature test the main module functinality

  Background: 
    Given 'chrome' browser is Opened and application Url is Launched
    Given I have '9876543210' as mobile no
    And 'admin' as password
    When I hit on login button
    Then verify Login pass or Fail  Message
@Smoke
  Scenario: verify master menu shows submenu list
    Given Hover on Master Menu
    Then Verify Submenu List
