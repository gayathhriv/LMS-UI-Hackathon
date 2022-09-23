@feature
Feature: Delete Multiple Batch

  @Scenario1
  Scenario: Select Batch
    Given User is on Batch page
    When User selects more than one Batch using checkbox
    Then Batches gets selected
    
  @Scenario2
  Scenario: Delete  multiple batches 
    Given User is on Batch page
    When User clicks on Delete button
    Then User lands on Confirm Deletion form
    #And Delete icon must be enabled # added new step
    
  @Scenario3
  Scenario: Click Yes
    Given user is on Batch Confirm Deletion page
    When User clicks Yes button
    Then User can see 'Successful Batch Deleted' message
    
  @Scenario4
  Scenario: Verify deleted batches
    Given User is on Batch page
    When User Searches for "Deleted Batch names"
    Then There should be zero results

  @Scenario5
  Scenario: click no
    Given User is on Batch Confirm Deletion Page after selecting multiple batches
    When User clicks No button																																																			 entered in it
    Then User can see Batches are still selected and not deleted
