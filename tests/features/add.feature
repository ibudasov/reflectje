Feature: adding reflection record
  As a student I want to add a reflection record
  So my actual psychological state will be recorded

  Scenario: adding record
    Given I am on AddRecordPage
    When I specify Event "writing a code"
    And I specify Thoughts "BDD is an interesting approach"
    And I specify Emotions "excited"
    And I submit
    Then I notified that the record has been addeds
