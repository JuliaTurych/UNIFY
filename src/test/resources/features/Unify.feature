Feature: Unify validation of menu
Scenario: User clicks on menu should see all tabs from menu
Given User on Unify home page click on menu
Then User see all Tabs from menu
  |People|
  |Careers|
  |Services|
  |Partnerships|
  |Insights|
  |News    |
  |Contact |
  Then Click on "Insights" tab