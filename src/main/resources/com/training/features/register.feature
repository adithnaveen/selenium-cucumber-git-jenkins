# Feature for registring on naveenks.com
@register @sanity
Feature: to register in the site

  Background: 
    Given the web application is loaded

  Scenario Outline: 
    Given user enters the "<email>"
    And enter "<password>" and "<confirmpassword>"
    And "<firstname>" is entered
    And "<lastname>" is entered
    And "<phonenumber>" is entered as as integer
    And "<date_of_birth>" is selected

    Examples: 
      | email             | password   | confirmpassword | firstname | lastname | phonenumber | date_of_birth |
      | naveen@gmail.com  | secret123  | secret123       | naveen    | kumar    |  9900524255 |            10 |
      | kanchan@gmail.com | testing123 | testing123      | kanchan   | naveen   |    23232323 |            20 |

      
      
      