@feature
Feature: Results in Descending order

  @Scenario1
  Scenario: Verify that the results are displayed in Descending order of Batch name
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the Batch name
    Then User can see the results in Descending order of Batch name

  @Scenario2
  Scenario: Verify that the results are displayed in Descending order of batch Description
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the Batch Description
    Then User can see the results in Descending order of Batch Description

  @Scenario3
  Scenario: Verify that the results are displayed in Descending order of Batch Status
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the Batch Status
    Then User can see the results in Descending order of Batch Status

  @Scenario4
  Scenario: Verify that the results are displayed in Descending order No of Classes
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the No Of Classes
    Then User can see the results in Descending order of No of Classes

  @Scenario5
  Scenario: Verify that the results are displayed in Descending order of Program Name
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the Program Name																																																 entered in it
    Then User can see the results in Descending order of Program Name
