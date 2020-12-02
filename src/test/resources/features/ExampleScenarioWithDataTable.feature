Feature: Scenario with data table example

  Scenario: Caretaker gets the list of all first names of the patients
    Given the following patients are registered
      | ssn           |
      | 93051822361   |
      | 87081220062   |
    When Martha requests to get all patients
    Then Martha should be able to get the list of all social security numbers of the registered patients
