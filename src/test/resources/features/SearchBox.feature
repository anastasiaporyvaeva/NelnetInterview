Feature:  Nelnet search box functionality

  Scenario: Search types of loan
    Given user goes to the welcome page

    And  type "types of loan" in search box
    Then verify "Search Results" is displayed

