@feature
Feature: Login functionality

Scenario: Validating the url
    Given User is on the browser
    When User opens the LMS Website
    Then User should see the Login page

Scenario: Validating the Login functionality with valid username and password
    Given User is on the Login Page
    When User clicks the Login button after entering valid username and password
    Then User should see the LMS Home page.

Scenario: Validating the Login functionality with invalid username or password
    Given User is on the Login Page
    When User clicks the Login button after invalid username or password
      | Username | Password || Status |
      | abc      |          || "Invalid username and password. Please try again" |
      | lms      |          || "Invalid username and password. Please try again" |
    Then User should not get logged in
