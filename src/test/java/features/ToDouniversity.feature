Feature: To-Do List Page of Web Driver University
  User open the page To-Do list of Web Driver University
  and use the to do list which he see on the page

  Scenario: Add To-do
    Given the to-do list page is opened
    When user insert "first to-do"
    And press enter on keyboard
    Then the user see "first to-do" in list

  Scenario: Delete To-do
    Given the to-do list page is opened
    When user choose a to-do
    And click on trash button
    Then the user don't see the to-do in list


  Scenario: Complete To-do
    Given the to-do list page is opened
    When user choose a to-do
    And click on to-do
    Then the user see the to-do completed
