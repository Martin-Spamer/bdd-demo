@GoogleSearch
Feature: Demonstrate BDD with Cucumber-jvm and WebDriver
	As an Behaviour Driven Development Advocate
	I want to show BDD used for Web Site testing 
	So that others might consider using BDD

Scenario: Search for Hull Digital website 
	Given the Google Search Page
	When we search for Hull Digital
	Then we see Hull Digital appears in the results
