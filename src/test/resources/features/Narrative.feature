@Narrative
Feature: A Gherkin idiom
	As an Automation Test Consultant
	I want to demonstrate the Gherkin language used in Cucumber-jvm feature files 
	So that others can quickly gain an understanding

Scenario: Acceptance Criteria confirmed
	Given an initial context
	When an event occurs
	Then expected outcome is confirmed

Scenario: Acceptance Criteria is incomplete
	Given an initial context
	When an event occurs
	#  The following shows an expected test failure. 
	Then expected outcome is incomplete

Scenario: Acceptance Criteria not confirmed
	Given an initial context
	When an event occurs
	#  The following shows an expected test failure. 
	Then expected outcome is not confirmed

Scenario: Acceptance Criteria is bugged
	Given an initial context
	When an event occurs
	#  The following shows an expected test failure. 
	Then expected outcome is a bug
