Feature: Contacts - Create a Contact

  This feature covers test cases related to creating new contacts in an Android Phone

  Scenario: Create a Contact
    Given that I am on the 'contacts' app
    When I tap the 'Add Contact' option
    And I attach the 'Bring Digital Image' in the 'Image' field
    And I enter 'Bring' in the 'First Name' field
    And I enter 'Digital' in the 'Last Name' field
    And I enter '+351 911111111' in the 'Mobile number' field
    And I change 'Mobile number' field name to 'Other'
    And I enter '+351 211111111' in the 'Phone' field
    And I change 'Phone' field name to 'Other fax'
    And I enter 'Sonia.pereira@bringglobal.com' in the 'E-mail' field
    And I change 'E-mail' field name to 'Work'
    Then I verify I have created a new contact

