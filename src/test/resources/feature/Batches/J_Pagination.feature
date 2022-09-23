@feature
Feature: Pagination

  @Scenario1
  Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Batch
    Then Verify that previous link is disabled

  @Scenario2
  Scenario: Verify next link
    Given User is on the page number '1'
    When User clicks navigate > button
    Then User navigated to page number '2'

  @Scenario3
  Scenario: Verify previous link
    Given User is on Batch page
    When User clicks navigate < button
    Then User navigated to page number '1'

  @Scenario4
  Scenario: Verify next link on the last page
    Given User is logged on to LMS website
    When User is on last page of Manage Batch
    Then Verify that next link is disabled
