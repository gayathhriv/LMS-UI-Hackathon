@feature
Feature: Delete Button


  Scenario: Validating the default state of Delete button 
    Given User is logged on to LMS website
    When User is on Batch page
    Then Verify that the Delete button next to the search box is Disabled
    #And Select the check box and Delete button should be enabled
