Feature: this feature test the add  bank functionality

  Background: 
    Given 'chrome' browser is Opened and application Url is Launched
    Given I have '9876543210' as mobile no
    And 'admin' as password
    When I hit on login button
    Then verify Login pass or Fail  Message

  @Regression
  Scenario Outline: verify add bank for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | xyztss   | abc         | 123456789123 | Current     | ABCD0012 | 123456789 |

  @Smoke
  Scenario Outline: verify  bank name field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of bank name in Label

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      |       12 | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
      |          | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
      | ds       | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |

  # | 12asssfd%vvd | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
  #  | jgjf dkfgkj  | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
  #   |              | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
  #  |           12 | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |
  @Regression
  Scenario Outline: verify account name for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | pqrs     | abc         | 123456789123 | Current     | ABCD0012 | 123456789 |
      | dena     | abc xud     | 123456789123 | Current     | ABCD0012 | 123456789 |

  @Smoke
  Scenario Outline: verify  bank name field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of account name in Label

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | dena     |             | 123456789123 | Savings     | ABCD0012 | 123456789 |
