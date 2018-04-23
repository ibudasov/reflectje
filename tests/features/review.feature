Feature: reviewing entered records
  As a Student
  I want to review my records, which I have added
  So I can discuss them with my therapist

  Scenario: reviewing existing records
    Given I am on ReviewRecordsPage
    And there are records with different dates
    When I requested all the existing records
    Then I see records with different dates
