Feature: verify login functionality

  @Tc1 @regresssion @sanity
  Scenario: Verify login with valid cred
    Given user is on crowd4Test app
    When user clicks on login button
    Then login page is displayed
    And user enters valid cred
    Then user will be logged in successfully

@Tc2
  Scenario: Verify login with invalid cred
    Given user is on crowd4Test app
    When user clicks on login button
    Then login page is displayed
    And user enters invalid cred
    Then user will be logged in successfully

  @TC3
  Scenario: Verify login with invalid cred
    Given user is on crowd4Test app
    When user clicks on login button
    Then login page is displayed
    And user enters "testUsername" username
    And user enters "testpassowrd" password
    Then user will be logged in successfully

    @Tc4
  Scenario Outline: Verify login with invalid cred
    Given user is on crowd4Test app
    When user clicks on login button
    Then login page is displayed
    And user enters "<username>" username
    And user enters "<password>" password
    Then user will be logged in successfully
    Examples:
    |username|password|
    |usr1    |pwd1    |
    |usr2    |pwd2    |

