@feature
Feature: delete feature
  @Scenario1
  Scenario: Select Batch
    Given User is on Batch page
    When user clicks delete  button for any batch#assertion on the batch is selected or not
    Then user will get confirm deletion popup

  @Scenario2
  Scenario: Click Yes
    Given user is on Batch Confirm Deletion page # user is on batch page , and message will pop up
    When User clicks Yes button
    Then User can see 'Successful Batch Deleted' message
  @Scenario3
  Scenario: Verify deleted batch
    Given user is on Batch Confirm Deletion page # user is on batch page , and message will pop up
    When User Searches for "Deleted Batch name"
    Then There should be zero results.
    
  @Scenario4
  Scenario: click no
    Given User is on Batch Confirm Deletion Page after selecting a batch to delete # user is on batch page , and message will pop up
    When User clicks No button
    Then User can see Batch is not deleted.