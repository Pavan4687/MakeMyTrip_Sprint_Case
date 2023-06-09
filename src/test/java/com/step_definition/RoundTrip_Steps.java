package com.step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.driversetup.SetUpDriver1;
import com.pagefactory.RoundTrip_Pagefactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoundTrip_Steps {
	WebDriver driver;
	RoundTrip_Pagefactory rtpf;
	
	//Round Trip
		@Given("user is on the flight booking page in roundTrip")
		public void user_is_on_the_flight_booking_page_roundTrip() throws Exception {
			driver=SetUpDriver1.chromeDriver();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkalyan\\eclipse-workspace\\MMT\\src\\test\\resources\\Drivers\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(2000);
		
		}

		@When("user click on Round trip button in roundTrip")
		public void user_click_on_round_trip_button_roundTrip() throws Exception {
			rtpf= new RoundTrip_Pagefactory(driver);
			rtpf=PageFactory.initElements(driver, RoundTrip_Pagefactory.class);
			rtpf.roundTrip();
			Thread.sleep(2000);
		}
		
		@When("user select the from city in roundTrip")
		public void user_enter_the_from_city_roundTrip() {
			rtpf.roundTrip_from();
		}

		@When("user select the to city in roundTrip")
		public void user_enter_the_to_city_roundTrip() {
			rtpf.roundTrip_to();
		}

		@When("user select the date of traveling in roundTrip")
		public void user_select_the_date_of_traveling_roundTrip() {
			rtpf.roundTrip_to_date();
		    
		    
		}
		@When("user select the return date of traveling in roundTrip")
		public void user_select_the_retrn_date_of_traveling_roundTrip() {
		    
			rtpf.roundTrip_return_date();
		    
		}


		@When("user enter the details of passengers in roundTrip")
		public void user_enter_the_details_of_passengers_roundTrip() throws Exception {
			rtpf.roundTrip_travellerClass();
			rtpf.Three_roundTrip_adult();
			rtpf.Two_roundTrip_adult();
			rtpf.One_roundTrip_adult();
			rtpf.Two_roundTrip_child();
			rtpf.One_roundTrip_child();
			rtpf.Zero_roundTrip_child();
			rtpf.Zero_Infant();
			rtpf.Business_roundTrip_travellingClass();
			rtpf.Premium_roundTrip_travellingClass();
			rtpf.Economy_roundTrip_travellingClass();
			rtpf.roundTrip_applyButton();
			Thread.sleep(2000);
			
		}

		@And("click on search in roundTrip")
		public void click_on_search_roundTrip() throws InterruptedException {
			rtpf.roundTrip_searchButton();
		    
		}

		@Then("user is able to see the available flights in roundTrip")
		public void user_is_able_to_see_the_available_flights_roundTrip() {
			rtpf.roundTrip_availableFlights();
			driver.quit();
		}
		
		//----------------------------------------------------------------------------------------------
		
		
		
		//INVALID FROM & TO SCENARIO

		@When("user select the same to city in roundTrip")
		public void user_enter_the_to_city1() {
			rtpf.roundTrip_to_1();
		}


		
		@Then("user will get some exception_invalid")
		public void user_will_get_some_exception1() throws Exception {
		rtpf.roundTrip_error1();
		Thread.sleep(3000);
		driver.quit();
		}
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------

		//INVALID INFANT SCENARIO
		

		@When("user enter more infants than adults in roundTrip")
		public void user_enter_the_details_of_passengers_roundTrip2() throws Exception {
			rtpf.roundTrip_travellerClass2();
			rtpf.One_roundTrip_adult2();
			rtpf.Zero_roundTrip_child2();
			rtpf.Three_Infant2();
			Thread.sleep(2000);
			
		}

		@Then ("user will get some exception_IN")
		public void Infant_Exception2() throws Exception {
			rtpf.Infant_error2();
			Thread.sleep(3000);
			driver.quit();
		}

		//------------------------------------------------------------------------------------------------------------------------------------------------------
		//Infants under student fare
		
		
		@When("user entered adults along with infants under student fare")
		public void user_enter_the_details_of_passengers_roundTrip3() throws Exception {
			rtpf.roundTrip_travellerClass3();
			rtpf.One_roundTrip_adult3();
			rtpf.Zero_roundTrip_child3();
			rtpf.Three_Infant3();
			rtpf.roundTrip_applyButton3();
			Thread.sleep(2000);
			
		}
		
		@When("user clicked on student fare button")
		public void User_Clicked_StudentFare() {
			rtpf.SFare_Button3();
		}
		
		
		

		@Then ("user will get error message")
		public void SFare_Exception3() throws Exception  {
			rtpf.SFare_error2();
			Thread.sleep(3000);
			driver.quit();
		}
		
		//--------------------------------------------------------------------------------------------------------------------------------------------------
	
		//Senior Citizen Fare
		
		@When("user enter the details of passengers in roundTrip under business class")
		public void user_enter_the_details_of_passengers_roundTrip4() throws Exception {
			rtpf.roundTrip_travellerClass4();
			rtpf.One_roundTrip_adult4();
			rtpf.Zero_roundTrip_child4();
			rtpf.Three_Infant4();
			rtpf.Business_travellingClass4();
			rtpf.roundTrip_applyButton3();
			Thread.sleep(2000);
			
		}
		
		
		@When("user clicked on senior fare button")
		public void User_Clicked_SCFare() {
			rtpf.SCFare_Button4();
		}
		
		
		

		@Then ("user is not able to see the available flights in roundTrip")
		public void SCFare_Exception4() throws Exception {
			rtpf.SCFare_error4();
			Thread.sleep(3000);
			driver.quit();
		}
		
		//-------------------------------------------------------------------------------------------------------------------------------------------------
		@And("user clicked on armed force section")
		public void user_clicked_on_armed_force_section() {
		    rtpf.Armedforce_Button4();
		}
		
		@And("click on search in navigated page")
		public void search_button_in_navigated_page() {
			rtpf.roundTrip_searchButton5();
		}
		
		@Then("user will see the available flights")
		public void user_is_able_to_see_the_Armed_roundTrip() {
			rtpf.roundTrip_availableFlights();
			driver.quit();
		}

		
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Student Fare
		
		@And("user clicked on student fare section")
		public void user_clicked_on_student_fare_section() {
		   rtpf.StudentFare_Button6();
		}
		
		@And("And click on search in navigated page")
		public void search_button_in_navigated_page6() throws Exception {
			rtpf.roundTrip_searchButton6();
			Thread.sleep(3000);
			//driver.quit();
		}
		
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Filters
		
		@Given("user is on navigated page")
		public void user_is_on_navigated_page() {
			driver=SetUpDriver1.chromeDriver();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkalyan\\eclipse-workspace\\MMT\\src\\test\\resources\\Drivers\\chromedriver.exe");
			//driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/flight/search?itinerary=HYD-DEL-13/06/2023_DEL-HYD-21/06/2023&tripType=R&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
			rtpf= new RoundTrip_Pagefactory(driver);
			rtpf=PageFactory.initElements(driver, RoundTrip_Pagefactory.class);
		}

		@When("user selected filter in popular section")
		public void user_selected_filter_in_popular_section() {
		    rtpf.Non_Stop_7();
		}

		@Then("user will be able to click it")
		public void user_will_be_able_to_click_it() throws InterruptedException {
		    rtpf.Clicked();
		    Thread.sleep(4000);
		    driver.quit();
		}
		
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		//Checking info
		@When("user clicked on arrow button")
		public void user_clicked_on_arrow_button() throws Exception {
		    rtpf.arrow_button();
		}

		@When("user able to see the options")
		public void user_able_to_see_the_options() throws Exception {
		   rtpf.Options();
		}

		@When("user clicked on the fare summary")
		public void user_clicked_on_the_fare_summary() throws Exception {
		    rtpf.Faresummary();
		}

		@Then("user will see the fare summary")
		public void user_will_see_the_fare_summary() {
			rtpf.see_summary();
			driver.quit();
		   
		}
		
		
				
		//--------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Lock_Price
		
		@When("user clicked on lockprice button")
		public void user_clicked_on_lockprice_button() throws Exception {
			rtpf.Price_Lock();
			
		}

		@When("user clicked on pay and lock")
		public void user_clicked_on_pay_and_lock() {
		    rtpf.Pay_now7();
		    
		}

		@Then("user will navigated to the payment portal")
		public void user_will_navigated_to_the_payment_portal() {
			;
			rtpf.Payment_page();
			driver.quit();
			
		}
		
		//=====================================================================================================================================================
		//QR Code
		
		@Given("user is on the  payment page")
		public void user_is_on_the_payment_page() {
			driver=SetUpDriver1.chromeDriver();
			driver.get("https://payments.makemytrip.com/ui/checkout/?id=846273768955629");
			rtpf= new RoundTrip_Pagefactory(driver);
			rtpf=PageFactory.initElements(driver, RoundTrip_Pagefactory.class);
		}

		@When("user clicked on the  show upi scanner")
		public void user_clicked_on_the_show_upi_scanner() throws Exception {
		  rtpf.Viewqr();
		}

		@Then("user able to see the the qr code")
		public void user_able_to_see_the_the_qr_code() throws Exception {
		    rtpf.Showqr();
		    Thread.sleep(2000);
		    driver.quit();
		}
		
		//=============================================================================================================================================================================
		
		
		//wrong upi id
		
		@When("user entered the wrong upi")
		public void user_entered_the_wrong_upi() throws Exception {
		    rtpf.UPINUMBER();
		}

		
		@And("user clicked on the verify button")
		public void user_clicked_on_verify() throws Exception {
			rtpf.verify2();
		}
		
		
		@Then("user will get invalid msg")
		public void user_will_get_invalid_msg() throws Exception {
		  rtpf.vpa();
		}
}
