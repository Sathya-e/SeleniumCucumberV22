Feature: Validate Ticket Reservation in IRCTC Application.

  Background: Below are the background steps
    Given user launch in chrome browser
    When user enters the URL
    Then user should able to launch the application
    And accept the alert
    Then Close the Browser

  #Test 1: Launching the application
  Scenario: Verify launching the IRCTC Homepage
    And verify the title of the page


  #Test 2: Simple Tests
  Scenario: To verify "From edit field" not to accept an empty field.
    And Leave the From Station empty
    And Enter valid data in To Station field


  #Test 3: Passing parameters to 'From Station'(INVALID DATA)
  Scenario: To verify "From Station field" not to accept the invalid data(Special Characters)
    And Enter invalid data "+=-09@3$ " in the From Station
    And Enter valid city "Chennai Egmore - MS " in the To Staion


    #Test 4: Passing parameters to 'From Station' (INVALID CITY NAME)
  Scenario: To verify "From edit field" not to accept the invalid City name and code
    When Enter invalid data "CMBTore" in the From Station
    When Enter valid city "Chennai Egmore - MS" in the To Staion


  #Test 5: Data Driven Testing- passing multiple Parameterss using Scenario Outline and Example Keyword
  Scenario Outline: To verify "From edit field" and "To Edit Field" in valid data with multiple parameters.
    And Enter valid data in From Station "<From_ValidCity>" and To Station "<To_ValidCity>".

    Examples:
      | From_ValidCity      | To_ValidCity         |
      | Coimbatore JN - CBE | Chennai Egmore - MS  |
      | CHENNAI PARK - MPK  | PUNE JN - PUNE       |
      | KOLKATA - KOAA      | MUMBAI CENTRAL - BCT |

   #Test 6: Data Driven Testing- Passing parameters using Paramaterization
  Scenario Outline: To verify "To Station Field" with invalid data using Data Table Parameters
    And Enter valid data in the From Station "<From_ValidCity>" and invalid data in To Station "<To_InValidCity>"

    Examples:
      | From_ValidCity     | To_InValidCity |
      | PUNE JN - PUNE     |                |
      | CHENNAI PARK - MPK | Chennai        |
      | KOLKATA - KOAA     | #4567*&        |

     #Test 7: User can able to pick the valid date from the Calendar
    And Enter valid data in From Station "<From_ValidCity>" and To Station "<To_ValidCity>".
    And user picks the valid date from the Calendar
    Examples:
      | From_ValidCity      | To_ValidCity        |
      | Coimbatore JN - CBE | Chennai Egmore - MS |
      | CHENNAI PARK - MPK  | PUNE JN - PUNE      |

     #Test 8: User should able to view the Booking train list page and able to choose their options.
    And Enter valid data in From Station "<From_ValidCity>" and To Station "<To_ValidCity>".
    And user picks the valid date from the Calendar
    Examples:
      | From_ValidCity      | To_ValidCity        |
      | Coimbatore JN - CBE | Chennai Egmore - MS |
      | CHENNAI PARK - MPK  | KOLKATA - KOAA      |
    And select the Find trains button to view the Booking train List Page






