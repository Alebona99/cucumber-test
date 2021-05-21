Feature: Buttons click on Web Driver University
  I am a user, I navigate on page Click button
  of Web Driver University and see three button on the home

  Scenario: Click the first button
    Given Open click button page
    When Click on first button
    And I should see a modal
    Then Close the first modal

  Scenario: Click the second button
    Given Open click button page
    When Click on second button
    And I should see a modal
    Then Close the second modal

  Scenario: Click the third button
    Given Open click button page
    When Click on third button
    And I should see a modal
    Then Close the third modal