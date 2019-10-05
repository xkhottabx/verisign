
Feature: Domain Service


  Scenario Outline: Check title of the page
    Given User on a Home Page
    When User navigates to Domain Services
    Then Page title is contains '<word>'
    Examples:
      | word     |
      | Verisign |
      | name     |

  @wip
  Scenario:
    Given User on a Home Page
    When User clicks on About Verisign
    Then Page title is contain words
      | Verisign |
      | CEO      |
      | Jim      |


