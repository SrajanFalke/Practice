Feature: To test login functinality with valid use case
  I want to use this template for my feature file


  Scenario: Login data driven with valid case
    Given I am on login page
    When I enter userName & Password 
    And I click on login button
    Then I should see project dashboard

 Scenario Outline: Login data driven with valid case
    Given I am on login page
    When I enter <userName> & <Password> 
    And I click on login button
    Then I should see project dashboard
    Examples: 
      | userName | Password  |
      | srajan.falke@gmail.com |  srajan@0503 |
      | srajan.falkexyz@gmail.com |     srajan@xyz | 
    
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
