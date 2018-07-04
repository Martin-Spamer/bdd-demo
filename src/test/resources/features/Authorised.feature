Feature: An example feature for testing
	As an advocate of Behaviour Driven Development
	I want to demonstrate controlled access with BDD
	So that I can demonstrate controlled access BDD

@authorised
Scenario: an authorised person can perform the activity
	Given authorisation for the activity
    When the activity is carried out
    Then the outcome is validated

@unauthorised
Scenario: an unauthorised person is refused access
	Given no authorisation for the activity
    When the activity is attempted
    Then access is refused
