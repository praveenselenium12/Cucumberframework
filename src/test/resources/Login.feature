Feature:login to freecrm

  @smoke
  Scenario:verify login functionilty with given credential
    Given  user should be in freecrm homepage
    When click on login button
    Then login page should be displayed
    And  enter email address
    And enter password
    When click on login
    Then user should be login to the appication

  @sanity
  Scenario:verify login functionilty with negative credential
    Given  user should be in freecrm homepage
    When click on login button
    Then login page should be displayed
    And  enter email address
    And enter password
    When click on login
    Then user should be login to the appication

  @Regression @smoke
  Scenario:verify login functionilty with negative credential
    Given  user should be in freecrm homepage
    When click on login button
    Then login page should be displayed
    And  enter email address
    And enter password
    When click on login
    Then user should be login to the appication

  @background
  Scenario:verify login functionilty with negative credential
    Given  user should be in freecrm homepage
    When click on login button
    Then login page should be displayed
    And  enter email address
    And enter password
    When click on login
    Then user should be login to the appication
