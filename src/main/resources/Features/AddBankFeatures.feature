Feature: this feature test the add  bank functionality

  Background: 
    Given 'chrome' browser is Opened and application Url is Launched
    Given I have '9876543210' as mobile no
    And 'admin' as password
    When I hit on login button
    Then verify Login pass or Fail  Message

  @Regression @Smoke
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
  @Regression @Smoke
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
  Scenario Outline: verify  account name field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of account name in Label

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | dena     |             | 123456789123 | Savings     | ABCD0012 | 123456789 |

  @Regression @Smoke
  Scenario Outline: verify account number for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | pqrs     | abc         | 123456789123 | Current     | ABCD0012 | 123456789 |

  #  @Ashwini
  @Regression
  Scenario Outline: verify  Account Number field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of account Number in Label

    Examples: 
      | bankName  | accountName | accountNo                | accountType | IFSCcode | MICRcode  |
      | dena      | yxc         |                          | Savings     | ABCD0012 | 123456789 |
      | dena bank | yxc         |                      123 | Savings     | ABCD0012 | 123456789 |
      | dena      | yxc         | hello world              | Savings     | ABCD0012 | 123456789 |
      | dena      | yxc         | 123123654789874512365478 | Savings     | ABCD0012 | 123456789 |

  @Regression @Smoke
  Scenario Outline: verify account type for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | jalgaon  | abc         | 123456789123 | Savings     | ABCD0012 | 123456789 |

  #  @Ashwini
  @Regression
  Scenario Outline: verify  Account type field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of account type in Label

    Examples: 
      | bankName | accountName | accountNo | accountType              | IFSCcode | MICRcode  |
      | dena     | gfd         |    123456 | Select Bank Account Type | ABCD0012 | 123456789 |

  #   | dena bank | erere       |   1234565 |                          | ABCD0012 | 123456789 |
     @Regression @Smoke
  Scenario Outline: verify IFSC code field for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode    | MICRcode  |
      | xyztss   | abc         | 123456789123 | Current     | UNBI0004567 | 123456789 |

   @Smoke
  
  Scenario Outline: verify  IFSC Code field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of IFSC code in Label

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode      | MICRcode  |
      | abcs     | abc defe    | 123456789123 | Savings     | ABCD          | 123456789 |
      | abcs     | abc defe    | 123456789123 | Savings     | ABCD001215478 | 123456789 |
      # | abcs     | abc defe    | 123456789123 | Savings     | U&@%56577     | 123456789 |
     # | abcs     | abc defe    | 123456789123 | Savings     | U%@&565  77   | 123456789 |
      | abcs     | abc defe    | 123456789123 | Savings     |               | 123456789 |

  #   | abcs     | abc defe    | 123456789123 | Savings     | djfhskjdhf    | 123456789 |
  @Regression @Smoke
  Scenario Outline: verify MICR Code field for valid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert Result in POPUP window

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode  |
      | gthjgg   | abc         | 123456789123 | Current     | ABCD0012 | 123456789 |

   @Smoke
  
  Scenario Outline: verify  MICR Code  field for invalid data
    Given click on bnak Menu
    And click on add bank button
    Then Enter '<bankName>' , '<accountName>','<accountNo>','<accountType>' ,'<IFSCcode>','<MICRcode>'
    And Click on submit button
    And Assert  Result  of MICR code in Label

    Examples: 
      | bankName | accountName | accountNo    | accountType | IFSCcode | MICRcode    |
      | abcs     | abc defe    | 123456789123 | Savings     | ABCD0012 |    12345678 |
      | abcs     | abc defe    | 123456789123 | Savings     | ABCD0012 | 12345678912 |
      #|   abcs  | abc defe | 123456789123 | Savings     | ABCD0012| djfhjdh |
      | abcs     | abc defe    | 123456789123 | Savings     | ABCD0012 |             |
			#|   abcs  | abc defe | 123456789123 | Savings     | ABCD0012  | 123456@12 |
