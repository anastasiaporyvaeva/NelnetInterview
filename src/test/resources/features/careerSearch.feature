Feature: Career search functionality

  @wip
  Scenario: search for "software engineer" position
    Given user goes to the welcome page
    Then scroll down to the bottom of the page
    And click on "Careers" link
    And click on Search Jobs button
    Then navigate to search for jobs on the new page and type "Software Engineer"
    And verify jobID is displayed

