Feature: UK Test Ticket

  Background: 
    Given I am a citizen of the UK
    And I follow Start now
    
	Scenario: Check NHS Cost Eligibility
    Given I am a resident of "England"
    And my GP Practice is located in Scotland or Wales "Yes"
    And I receive dental treatment in "England"
    And I provide my date of birth as "03.10.1997"
    And I live with my partner "Yes"
    And both my partner and I can benefit from tax "Yes"
    And we receive Universal Credit payments "Yes"
    And we have one of the following in our joint Universal Credit "Yes"
    And our Universal Credit period is less "Yes"
    When I check my eligibility for NHS cost assistance
    Then I should receive a result indicating whether I am eligible
    
  Scenario: Check NHS Cost Eligibility
    Given I am a resident of "Scotland"
    And I live is located in Highland "Yes"
    And I receive dental treatment in "Scotland"
    And I provide my date of birth as "03.10.1997"
    And I live with my partner "Yes"
    And both my partner and I can benefit from tax "Yes"
    And we receive Universal Credit payments "Yes"
    And we have one of the following in our joint Universal Credit "Yes"
    And our Universal Credit period is less "Yes"
    When I check my eligibility for NHS cost assistance
    Then I should receive a result indicating whether I am eligible
    
   Scenario: Check NHS Cost Eligibility
    Given I am a resident of "Wales"
    And my GP Practice is located in Scotland or Wales "Yes"
    And I receive dental treatment in "Wales"
    And I provide my date of birth as "03.10.1997"
    And I live with my partner "Yes"
    And both my partner and I can benefit from tax "Yes"
    And we receive Universal Credit payments "Yes"
    And we have one of the following in our joint Universal Credit "Yes"
    And our Universal Credit period is less "Yes"
    When I check my eligibility for NHS cost assistance
    Then I should receive a result indicating whether I am eligible