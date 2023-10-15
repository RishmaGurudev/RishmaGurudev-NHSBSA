Feature: UK Test Ticket

Scenario: UK Test Ticket
Given I am a citizen of the UK
When I put my circumstances into the Checker tool
Then I should get a result of whether I will get help or not
