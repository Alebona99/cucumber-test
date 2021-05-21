Feature: Login on Swag Labs
  User want to login in the site Swag Labs
  of Sauce Demo with his username and password

  Scenario Outline: Login on Swag Labs with standard_user
    Given the Swag Labs Page is opened
    When the user insert "<username>" and "<password>"
    Then he should see the Products

    Examples:
    | username                | password     |
    | standard_user           | secret_sauce |
    | locked_out_user         | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch_user | secret_sauce |
