@feature
Feature: Number of records  


  Scenario: Validate that number of records (rows of data in the table) displayed 
    Given User is logged on to LMS website
    When User is on Batch page
    Then Verify that number of records (rows of data in the table) displayed on the page ##modified from gherkins as no. of records has been specified
    