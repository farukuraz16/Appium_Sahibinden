@HomePage
Feature: Sahibinden

  @checkResult
  Scenario: Check Search Result
    Given user should see the Home Page
    When taps "Emlak" at Home Page
    When taps "Konut" at Categories Page
    When taps "Satılık" at Categories Page
    When taps "Daire" at Categories Page
    Then should see results on Result Page

