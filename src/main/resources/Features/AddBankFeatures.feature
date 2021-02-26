@Smoke
Feature: this feature test the add  bank functionality

  Background: 
    Given 'chrome' browser is Opened and application Url is Launched
    Given 'chrome' browser is Opened and application Url is Launched
    Given I have '9876543210' as mobile no
    And 'admin' as password
    When I hit on login button
    Then verify Login pass or Fail  Message
@Smoke
  Scenario: verify add bank for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Fill all Mantetory Fields
    And Click on submit button
    And Assert Result
