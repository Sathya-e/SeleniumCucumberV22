Feature: Hooks in Cucumber

  Scenario: Add new user
    Given new user regitration
    When user fills the required details
    Then user is added

  Scenario: user Reservation confirmation
    Given the availability of the train with proper date and time
    When user select the seats for reservation and paid amount
    Then user should receive a confirmation message on the same

  Scenario: user Reservation cancellation
    Given the period of time available for cancellation
    When user cancelling the reserved tickets within the time period mentioned for cancellation
    Then user should receive a part of amount which he paid for the reservation
    And receive a cancellation message on the same
    And the cancelled tickets should be available for the booking again

