Feature: Buttons click on Web Driver University
  User navigate on page Click Button
  of Web Driver University and see three button on the home

  Scenario: Click the first button
    Given click button page is opened
    When user click on first button
    And see a modal
    Then the user close the first modal

  Scenario: Click the second button
    Given click button page is opened
    When user click on second button
    And see a modal
    Then the user close the second modal

  Scenario: Click the third button
    Given click button page is opened
    When user click on third button
    And see a modal
    Then the user close the third modal