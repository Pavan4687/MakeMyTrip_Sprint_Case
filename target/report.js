$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/flight.feature");
formatter.feature({
  "name": "Booking flight",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user want to select the armed force flights",
  "description": "",
  "keyword": "Scenario",
  "tags": [
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
});