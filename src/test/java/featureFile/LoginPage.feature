Feature: Buttonfeature

  @regression
  Scenario: Buttonfeature
    Given user enters to letcode page
    When user clicks option under button
    Then user navigates to letcode button page
    When user clicks Goto home button
    Then user navigates to homepage

  @datatable
  Scenario: Loginfeature
    Given user enters to letcode page
    When user enters Loginbutton
    And user enters with below Email and passwords
      | Email                | passwords |
      | rsunilravi@gmail.com |    123456 |
    Then user enters login page
    Then user scrolls up and down

  @select
  Scenario: Buttonfeature
    Given user enters to letcode page
    When user clicks option under button
    Then user navigates to letcode button page
    When user clicks Goto home button
    Then user navigates to homepage
    When user clicks workspace
    Then user Navigates to Testpage
    And user click select button
    And user navigates to selectpractise page
    And user performs action in the fruit select box

  @brokenlink
  Scenario: brokenlink
    Given when user enter brokenlink page
    Then user stores all the link
    And user provides respones for the brokenlinks

  @windowhandle
  Scenario: windowhandle
    Given user navigates to windowhandles page
    Then user performs windowhandles operation

  @frames
  Scenario: Frames testing
    Given user navigates to "https://letcode.in/test"
    Then user clicks frames icon
    And user performs Frames operation

  @Filedownloading
  Scenario: Filedownloading
    Given user navigates to "https://letcode.in/file"
    Then user clicks DownloadEXcel icon and able to verify if the file is downloaded 
