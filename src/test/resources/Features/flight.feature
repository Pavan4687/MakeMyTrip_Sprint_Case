@Booking
Feature: Booking flight

@Round_trip 
Scenario: Booking the flight under round trip
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip 
When user select the from city in roundTrip 
When user select the to city in roundTrip 
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip 
When user enter the details of passengers in roundTrip 
And click on search in roundTrip 
Then user is able to see the available flights in roundTrip

@Invalid_FromStation
Scenario: user  selected the from city and to city same in roundTrip 
Given user is on the flight booking page in roundTrip 
When  user click on Round trip button in roundTrip 
When  user select the from city in roundTrip 
When  user select the same to city in roundTrip   
Then  user will get some exception_invalid 

@Invalid_Infants
Scenario: user selected the infants more than adults
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip
When user select the from city in roundTrip
When user select the to city in roundTrip  
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip 
When user enter more infants than adults in roundTrip
Then user will get some exception_IN

@Student_Fare_Error
Scenario: User Selected adults along with infant for student fare
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip
When user select the from city in roundTrip
When user select the to city in roundTrip  
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip
When user entered adults along with infants under student fare
When user clicked on student fare button
And  click on search in roundTrip
Then user will get error message

@FLights_Not_Found
Scenario: User selected adults and children in business class for senior fare
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip 
When user select the from city in roundTrip 
When user select the to city in roundTrip 
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip 
When user enter the details of passengers in roundTrip under business class
When user clicked on senior fare button
And click on search in roundTrip 
Then user is not able to see the available flights in roundTrip

@Armed_Forces
Scenario: user want to select the armed force flights
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip 
When user select the from city in roundTrip 
When user select the to city in roundTrip 
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip 
When user enter the details of passengers in roundTrip 
And click on search in roundTrip 
And user clicked on armed force section
And click on search in navigated page
Then user will see the available flights

@Student_Fare
Scenario: user want to select the student fare
Given user is on the flight booking page in roundTrip 
When user click on Round trip button in roundTrip 
When user select the from city in roundTrip 
When user select the to city in roundTrip 
When user select the date of traveling in roundTrip 
When user select the return date of traveling in roundTrip 
When user enter the details of passengers in roundTrip 
And click on search in roundTrip
And user clicked on student fare section
And click on search in navigated page
Then user will see the available flights

@Filters
Scenario: user want to select filters
Given user is on navigated page
When user selected filter in popular section
Then user will be able to click it

@Checking
Scenario: user want to check details before confirming
Given user is on navigated page
When user clicked on arrow button
And user able to see the options
And user clicked on the fare summary
Then user will see the fare summary

@Lock_Price
Scenario: User want to lock the price
Given user is on navigated page
When user clicked on lockprice button
And user clicked on pay and lock 
Then user will navigated to the payment portal

@Upi_portal
Scenario: user want to see payment options
Given user is on the  payment page
When user clicked on the  show upi scanner
Then user able to see the the qr code

@Incorrect_upi
Scenario: user entered the wrong upi
Given user is on the  payment page
When user entered the wrong upi
And user clicked on the verify button
Then user will get invalid msg






