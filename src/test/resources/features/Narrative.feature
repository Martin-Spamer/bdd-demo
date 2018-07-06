@Narrative
Feature: A Gherkin idiom
	As an advocate of Behaviour Driven Development
	I want to show how different test outcomes are detected and shown
	So that others can quickly gain a useful understanding

Scenario: A test passes when the Acceptance Criteria are confirmed
	Given an initial context
	When the event occurs
	Then expected outcome is confirmed

Scenario: A test fails when the Acceptance Criteria are not confirmed
	Given an initial context
	When the event occurs
	Then expected outcome is not confirmed

Scenario: The test skips when the assumption is false.
	Given an initial context is false
	When the event occurs
	Then expected outcome is incomplete

Scenario: Acceptance Criteria is incomplete
	Given an initial context
	When the event occurs
	#  The following shows an expected test failure. 
	Then expected outcome is incomplete

Scenario: Acceptance Criteria is bugged
	Given an initial context
	When the event occurs
	#  The following shows an expected test failure. 
	Then expected outcome is a bug
