@Search
Feature: Show BDD with Cucumber and WebDriver
	As an advocate of Behaviour Driven Development
	I want to show BDD used for Web Site testing 
	So that I can show automated testing with behaviour driven development

Scenario: Search for the Hull Digital web site
	Given a Search Page
	When we search for 'Hull Digital'
	Then we see 'Hull Digital' appears in the results
