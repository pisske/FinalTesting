@click
Feature: WebDriver University - Contact Us Page



  Scenario:  Validate Successful click on button
    Given I access the webdriver university Click button page
    When I click on button
    Then I should be presented with a successful click message