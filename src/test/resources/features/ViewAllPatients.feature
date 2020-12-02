Feature: View all patients

  As a caretaker
  I want to get the list of all patients
  In order to consult the data of a certain patient

   # Personas
   # Martha - caretaker

  Scenario: Caretaker gets the list of all social security numbers
    Given there are patients registered
    When Martha requests to get all patients
    Then Martha should be able to get the list of all social security numbers of the registered patients

  Scenario: Caretaker gets no results when there are no patients registered
    Given there are no patients registered
    When Martha requests to get all patients
    Then Martha should be able to get a message that there are no patients registered

