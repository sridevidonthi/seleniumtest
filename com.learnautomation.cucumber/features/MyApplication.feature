#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test Facebook smoke scenario
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Test Login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and "<password>"
    Then User should be able to login

    Examples: 
      | username          | password  |
      | mukesh@gmail.com  | password1 |
      | mukesh2@gmail.com | password2 |
      | mukesh3@gmail.com | password3 |