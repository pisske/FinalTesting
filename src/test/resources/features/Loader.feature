@loader
Feature: WebDriver University - Load



  Scenario:  Click on the element after load is finished
    Given I access the webdriver university Loading page
    When After Spinner finished I have to click on the element
    Then I should be presente with a message "Well Done For Waiting....!!!"