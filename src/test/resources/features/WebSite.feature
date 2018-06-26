@WebSite
Feature: Demonstrate Cucumber-jvm with WebDriver
	As an Automation Test Consultant
	I want to demonstrate Cucumber-jvm feature files that use Selenium WebDriver Page Object Model 
	So that others can quickly gain an understanding

Scenario: Navigate to home page - Imperative 
	Given the website landing page
	When the landing page is loaded
	And the page contains "About Us" 
	And the page contains "Industries"
	And the page contains "Services"
	And the page contains "Our Clients"
	And the page contains "Contact Us"
	And the page is closed

Scenario: Navigate to home page - Declarative
	Given the website landing page
	When the landing page is loaded
	Then the page has a valid navigation bar
	And the page is closed
