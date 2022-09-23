@feature
Feature: Add Batch

  @Scenario1
  Scenario: validate add new batch
    Given User is on Batch page
    When User clicks A New Batch button
    Then user can see Batch details form

  @Scenario2
  Scenario: Empty form submission
    Given User is on Batch details page
    When User clicks Save button without entering data
    Then User gets message 'Name is required'
  @Scenario3
  Scenario: Click Cancel
    Given User is on Batch details page
    When User clicks Cancel button
    Then User can see Batch Details form disappears

  @Scenario4
  Scenario: Enter Batch Name
    Given User is on Batch details page
    When user enters name in text box
    Then User can see 'Name' entered

  @Scenario5
  Scenario: Enter Batch Description
    Given User is on Batch details page
    When User enters Description in text box																																																	 entered in it
    Then User can see 'Description' entered
    
    @Scenario6
  Scenario: Enter Program name
    Given User is on Batch details page
    When User selects Program name																																																		 entered in it
    Then User can see 'Program Name' selected
    
    @Scenario7
  Scenario: Select Status
    Given User is on Batch details page
    When User selects Status using radiobutton																																																		 entered in it
    Then User can see 'Active/Inactive' status selected
    
    @Scenario8
  Scenario: Enter No of classes
    Given User is on Batch details page
    When User enters No of classes in text box																																																		 entered in it
    Then User can see 'No of classes' entered
    
    @Scenario9
  Scenario: Click Save
    Given User is on Batch details page
    When User clicks Save button																																																			 entered in it
    Then User gets message 'Successful batch created'
    
    @Scenario10
  Scenario: Verify Added Batch is created
    Given User is on Batch page
    When User searches with newly created "Batch Name"																																																		 entered in it
    Then records of the newly created  "Batch Name" is displayed
