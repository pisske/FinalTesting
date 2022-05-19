@upload
Feature: WebDriver University - File Upload



  Scenario:  Validate Successful file uploaded
    Given I access the webdriver university Upload button page
    When I click on choose File I have to pick up a file
    When I click on submit button
    Then I should be presented with a successful upload file mesesage