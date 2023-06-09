$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/flight.feature");
formatter.feature({
  "name": "Booking flight",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Booking"
    }
  ]
});
formatter.scenario({
  "name": "Booking the flight under round trip",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Round_trip"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in roundTrip",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.click_on_search_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the available flights in roundTrip",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_able_to_see_the_available_flights_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user  selected the from city and to city same in roundTrip",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Invalid_FromStation"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the same to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get some exception_invalid",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_will_get_some_exception1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user selected the infants more than adults",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Invalid_Infants"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter more infants than adults in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get some exception_IN",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.Infant_Exception2()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Selected adults along with infant for student fare",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Student_Fare_Error"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered adults along with infants under student fare",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on student fare button",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.User_Clicked_StudentFare()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in roundTrip",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.click_on_search_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.SFare_Exception3()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User selected adults and children in business class for senior fare",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@FLights_Not_Found"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers in roundTrip under business class",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on senior fare button",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.User_Clicked_SCFare()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in roundTrip",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.click_on_search_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is not able to see the available flights in roundTrip",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.SCFare_Exception4()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to select the armed force flights",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Armed_Forces"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in roundTrip",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.click_on_search_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on armed force section",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_armed_force_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in navigated page",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.search_button_in_navigated_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_able_to_see_the_Armed_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to select the student fare",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Student_Fare"
    }
  ]
});
formatter.step({
  "name": "user is on the flight booking page in roundTrip",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_flight_booking_page_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Round trip button in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_click_on_round_trip_button_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the from city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_from_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the to city in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_to_city_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the return date of traveling in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_select_the_retrn_date_of_traveling_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the details of passengers in roundTrip",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_enter_the_details_of_passengers_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in roundTrip",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.click_on_search_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on student fare section",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_student_fare_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search in navigated page",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.search_button_in_navigated_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_able_to_see_the_Armed_roundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to select filters",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Filters"
    }
  ]
});
formatter.step({
  "name": "user is on navigated page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_navigated_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selected filter in popular section",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_selected_filter_in_popular_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be able to click it",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_will_be_able_to_click_it()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to check details before confirming",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Checking"
    }
  ]
});
formatter.step({
  "name": "user is on navigated page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_navigated_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on arrow button",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_arrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see the options",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_able_to_see_the_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the fare summary",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_the_fare_summary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will see the fare summary",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_will_see_the_fare_summary()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to lock the price",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Lock_Price"
    }
  ]
});
formatter.step({
  "name": "user is on navigated page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_navigated_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on lockprice button",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_lockprice_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on pay and lock",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_pay_and_lock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will navigated to the payment portal",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_will_navigated_to_the_payment_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user want to see payment options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Upi_portal"
    }
  ]
});
formatter.step({
  "name": "user is on the  payment page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the  show upi scanner",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_the_show_upi_scanner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see the the qr code",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_able_to_see_the_the_qr_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user entered the wrong upi",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Booking"
    },
    {
      "name": "@Incorrect_upi"
    }
  ]
});
formatter.step({
  "name": "user is on the  payment page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoundTrip_Steps.user_is_on_the_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entered the wrong upi",
  "keyword": "When "
});
formatter.match({
  "location": "RoundTrip_Steps.user_entered_the_wrong_upi()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicked on the verify button",
  "keyword": "And "
});
formatter.match({
  "location": "RoundTrip_Steps.user_clicked_on_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will get invalid msg",
  "keyword": "Then "
});
formatter.match({
  "location": "RoundTrip_Steps.user_will_get_invalid_msg()"
});
formatter.result({
  "status": "passed"
});
});