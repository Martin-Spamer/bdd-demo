@WebSite
Feature: Demonstrate Cucumber with Selenium WebDriver
	As an advocate of Behaviour Driven Development
	I want to demonstrate Cucumber feature files that with Selenium WebDriver
	So that I can show automated web site testing with behaviour driven development

Scenario: Navigate to home page - Imperative 
	Given the web site landing page
	When the landing page is loaded
	And the page contains 'About Us' link 
	And the page contains 'Industries' link
	And the page contains 'Services' link
	And the page contains 'Our Clients' link
	And the page contains 'Contact Us' link
	And the page is closed

Scenario: Navigate to home page - Declarative
	Given the web site landing page
	When the landing page is loaded
	Then the page has a valid navigation bar
	And the page is closed
