Feature: Scenario outline example

  Scenario Outline: Caretaker gets the list of all first names of the patients
    Given there are patients registered
    When Martha requests to get all patients
    Then Martha should be able to get "<ssn>"
    Examples:
    | firstName | ssn           |
    | An        | 93051822361   |
    | Tom       | 87081220062   |