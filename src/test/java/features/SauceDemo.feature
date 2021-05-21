Feature: Login on Swag Labs
  I am an user, I want to login in the site Swag Labs
  of Sauce Demo with my username and password

  Scenario Outline: Login on Swag Labs with standard_user
    Given Open the Swag Labs Page
    When I insert "<username>" and "<password>"
    Then I should see the Products

    Examples:
    | username                | password     |
    | standard_user           | secret_sauce |
    | locked_out_user         | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
