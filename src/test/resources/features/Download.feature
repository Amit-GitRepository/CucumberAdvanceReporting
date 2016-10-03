Feature: Sample Feature File two
  In order to use Selenium in my project, I want to download Selenium language bindings

  Scenario: Java binding download link check
    Given I am on the Selenium homepage

  #Scenario: Java binding download link check
  #Given I am on the Selenium homepage
  #When I click "Download" tab
  #
  #Scenario: Java binding download link check
  #Given I am on the Selenium homepage
  #When I click "Download" tab sjdfk kskuehfjlsmldskmfl
  #
  #	@skip123
  #Scenario: Java binding download link check
  #Given I am on the Selenium homepage
  #	  When This line is to fail this scenaio
  
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      | name3 |    11 | Fail    |
