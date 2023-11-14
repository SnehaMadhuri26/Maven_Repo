Feature: Search functionality

Scenario Outline: Validity valid Search Functionality

Given User is on Home Page
When User enters "<product>" in search field
And user click on search button
Then Product "<product>" should be displayed

Examples:
| product |
| MacBook Air |
| MacBook Pro |
