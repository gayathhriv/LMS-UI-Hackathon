@feature
Feature: Edit Batch

  @Scenario1
  Scenario: Edit Feature
    Given User is on Batch page
    When User clicks on Edit button
    Then User lands on Batch Details form  #tobe added: saved data should be populated  

  @Scenario2
  Scenario: Edit Batch Name
    Given User is on Batch details page
    When User edits Name
    Then User can see edited Name

  @Scenario3
  Scenario: Edit  Batch Description
    Given User is on Batch details page
    When user edits description
    Then User can see edited descricption

  @Scenario4
  Scenario: Edit program name
    Given User is on Batch details page
    When user edits program name
    Then user can see edited program name

  @Scenario5
  Scenario: change status
    Given User is on Batch details page
    When user changes status																																																		 entered in it
    Then User can see updated Status

  @Scenario6
  Scenario: Edit No of classes
    Given User is on Batch details page
    When user edits No of classes																																																			 entered in it
    Then user can see updated No of classes

  @Scenario7
  Scenario: Click Cancel
    Given User is on Batch details page
    When user clicks cancel button																																																				 entered in it
    Then User can see Batch Details are not updated

  @Scenario8
  Scenario: click save
    Given User is on Batch details page
    When user clicks save button																																																			 entered in it
    Then User can see 'Successful Batch Updated' alert

  @Scenario9
  Scenario: Verify Edited Batch details
    Given User is on Batch page
    When User searches with newly updated "Batch Name"																																																			 entered in it
    Then User verifies that the details are correctly updated.
