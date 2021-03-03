
Feature: This Feature test the edit fuctionality

  Background: 
    Given 'chrome' browser is Opened and application Url is Launched
    Given I have '9876543210' as mobile no
    And 'admin' as password
    When I hit on login button
    Then verify Login pass or Fail  Message
@Smoke
  Scenario: Verify user able to update bank data
    Given I click on master and  Bank SubMenu
    Given Search bank name for edit bank details
    When click on Edit button
    Then Change Data and Click on Edit submit button
    And Assert updated result
