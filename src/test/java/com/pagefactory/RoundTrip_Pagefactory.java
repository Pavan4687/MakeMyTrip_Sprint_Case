package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoundTrip_Pagefactory {
	WebDriver driver;
	static WebDriverWait wait;

	@FindBy(how=How.XPATH, using="//li[@data-cy='roundTrip']")
	WebElement roundTrip_button;


	@FindBy(how=How.ID, using="fromCity")
	WebElement from_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@id='react-autowhatever-1-section-1-item-5']")
	WebElement from_city_roundTrip;

	@FindBy(how=How.ID, using="toCity")
	WebElement to_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@id='react-autowhatever-1-section-1-item-1']")
	WebElement to_city_roundtrip;

	@FindBy(how=How.XPATH, using="//div[@aria-label='Tue Jun 13 2023']")
	WebElement to_date_roundtrip;

	@FindBy(how=How.XPATH, using="//div[@aria-label='Wed Jun 21 2023']")
	WebElement return_date_roundtrip;

	@FindBy(how=How.XPATH, using="//label[@for=\"travellers\"]")
	WebElement traveller_class_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-3\"]")
	WebElement Three_adult_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-2\"]")
	WebElement Two_adult_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-1\"]")
	WebElement One_adult_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-3\"]")
	WebElement two_child_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-2\"]")
	WebElement one_child_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-0\"]")
	WebElement zero_child_roundtrip;

	@FindBy(how=How.XPATH, using ="//li[@data-cy=\"infants-0\"]")
	WebElement Zero_infant_roundtrip;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"travelClass-2\"]")
	WebElement Business_travelling_class;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"travelClass-1\"]")
	WebElement Premium_travelling_class;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"travelClass-0\"]")
	WebElement Economy_travelling_class;

	@FindBy(how=How.XPATH, using="//button[@type=\"button\"]")
	WebElement apply_button_roundtrip;

	@FindBy(how=How.XPATH, using="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement search_button_roundtrip;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p")
	WebElement text_about_available_fights_roundTrip;





	//Round Trip
	public RoundTrip_Pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void roundTrip() {
		if(!roundTrip_button.isSelected()) {
			roundTrip_button.click();

		}
	}

	public void roundTrip_from() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(from_roundtrip));
		from_roundtrip.click();
		wait.until(ExpectedConditions.elementToBeClickable(from_city_roundTrip));
		from_city_roundTrip.click();
	}

	public void roundTrip_to() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to_roundtrip));
		to_roundtrip.click();
		wait.until(ExpectedConditions.elementToBeClickable(to_city_roundtrip));
		to_city_roundtrip.click();
	}
	public void roundTrip_to_date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(to_date_roundtrip));
		to_date_roundtrip.click();

	}

	public void roundTrip_return_date() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(return_date_roundtrip));
		return_date_roundtrip.click();

	}
	public void roundTrip_travellerClass() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(traveller_class_roundtrip));
		traveller_class_roundtrip.click();

	}

	public void Three_roundTrip_adult() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(Three_adult_roundtrip));
		Three_adult_roundtrip.click();

	}

	public void Two_roundTrip_adult() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(Two_adult_roundtrip));
		Two_adult_roundtrip.click();

	}

	public void One_roundTrip_adult() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(One_adult_roundtrip));
		One_adult_roundtrip.click();

	}

	public void Two_roundTrip_child() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(two_child_roundtrip));
		two_child_roundtrip.click();

	}

	public void One_roundTrip_child() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(one_child_roundtrip));
		one_child_roundtrip.click();

	}

	public void Zero_roundTrip_child() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(zero_child_roundtrip));
		zero_child_roundtrip.click();

	}


	public void Zero_Infant() {
		Zero_infant_roundtrip.click();
	}


	public void Business_roundTrip_travellingClass() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(Business_travelling_class));
		Business_travelling_class.click();

	}

	public void Premium_roundTrip_travellingClass() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(Premium_travelling_class));
		Premium_travelling_class.click();

	}

	public void Economy_roundTrip_travellingClass() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(Economy_travelling_class));
		Economy_travelling_class.click();

	}

	public void roundTrip_applyButton() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		apply_button_roundtrip.click();

	}

	public void roundTrip_searchButton() {
					wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.elementToBeClickable(search_button_roundtrip));
		search_button_roundtrip.click();

	}

	public void roundTrip_availableFlights() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(text_about_available_fights_roundTrip));
		String Available_flights_RoundTrip = text_about_available_fights_roundTrip.getText();
		System.out.println(Available_flights_RoundTrip);
		

	}

	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------
	//TO AND FROM STATIONS ARE SAME (INVALID CASE SCENARIO)

	@FindBy(how=How.XPATH, using="//li[@id='react-autowhatever-1-section-1-item-5']")
	WebElement to_city_round_trip1;

	@FindBy(how=How.XPATH, using="//span[@data-cy=\"sameCityError\"]")
	WebElement Error_msg;
	


	public void roundTrip_to_1() {
		wait = new WebDriverWait(driver, 30);
		to_roundtrip.click();
		to_city_round_trip1.click();
	}

	public void roundTrip_error1() {
		String ERROR=Error_msg.getText();
		System.out.println(ERROR);
		String ERROR1 =driver.getTitle();
		System.out.println("PAGE :" + ERROR1);
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------

	//@Invalid_Infants

	@FindBy(how=How.XPATH, using="//label[@for=\"travellers\"]")
	WebElement traveller_class_roundtrip2;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-1\"]")
	WebElement One_adult_roundtrip2;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-0\"]")
	WebElement zero_child_roundtrip2;

	@FindBy(how=How.XPATH, using ="//li[@data-cy=\"infants-3\"]")
	WebElement Three_infant_roundtrip2;


	@FindBy(how=How.XPATH, using ="//p[@data-cy=\"infantWarning\"]")
	WebElement Infant_Error;


	
	public void roundTrip2() {
		if(!roundTrip_button.isSelected()) {
			roundTrip_button.click();

		}
	}


	public void roundTrip_travellerClass2() {
		//wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(traveller_class_roundtrip));
		traveller_class_roundtrip2.click();

	}


	public void One_roundTrip_adult2() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(One_adult_roundtrip));
		One_adult_roundtrip2.click();

	}



	public void Zero_roundTrip_child2() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(zero_child_roundtrip));
		zero_child_roundtrip2.click();

	}


	public void Three_Infant2() {
		Three_infant_roundtrip2.click();
	}

	public void Infant_error2() {
		String INFANT_ERROR=Infant_Error.getText();
		System.out.println(INFANT_ERROR);
		String INFANT_ERROR1 =driver.getTitle();
		System.out.println("PAGE :" + INFANT_ERROR1);
	}

	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	//Infants under student fare @Student_Fare_Error
	
	@FindBy(how=How.XPATH, using="//label[@for=\"travellers\"]")
	WebElement traveller_class_roundtrip3;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-4\"]")
	WebElement One_adult_roundtrip3;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-0\"]")
	WebElement zero_child_roundtrip3;

	@FindBy(how=How.XPATH, using ="//li[@data-cy=\"infants-3\"]")
	WebElement Three_infant_roundtrip3;


	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[3]")
	WebElement SFare_button_roundtrip3;

	@FindBy(how=How.XPATH, using ="//p[@id=\"specialFareEorroMessage\"]")
	WebElement StudentFare_Error;




	public void roundTrip3() {
		if(!roundTrip_button.isSelected()) {
			roundTrip_button.click();

		}
	}


	public void roundTrip_travellerClass3() {
		//wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(traveller_class_roundtrip));
		traveller_class_roundtrip3.click();

	}


	public void One_roundTrip_adult3() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(One_adult_roundtrip));
		One_adult_roundtrip3.click();

	}



	public void Zero_roundTrip_child3() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(zero_child_roundtrip));
		zero_child_roundtrip3.click();

	}


	public void Three_Infant3() {
		Three_infant_roundtrip3.click();
	}

	public void roundTrip_applyButton3() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		apply_button_roundtrip.click();

	}

	public void SFare_Button3() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		SFare_button_roundtrip3.click();

	}

	public void roundTrip_searchButton3() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(search_button));
		search_button_roundtrip.click();

	}

	public void SFare_error2() {
		String SFARE_ERROR=StudentFare_Error.getText();
		System.out.println(SFARE_ERROR);
		String SFARE_ERROR1 =driver.getTitle();
		System.out.println("PAGE :" + SFARE_ERROR1);
	}


	//---------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	//Senior Citizen Fare
	@FindBy(how=How.XPATH, using="//label[@for=\"travellers\"]")
	WebElement traveller_class_roundtrip4;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"adults-7\"]")
	WebElement One_adult_roundtrip4;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"children-5\"]")
	WebElement zero_child_roundtrip4;

	@FindBy(how=How.XPATH, using ="//li[@data-cy=\"infants-0\"]")
	WebElement Three_infant_roundtrip4;

	@FindBy(how=How.XPATH, using="//li[@data-cy=\"travelClass-2\"]")
	WebElement Business_travelling_class4;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[4]")
	WebElement SCFare_button_roundtrip4;

	@FindBy(how=How.XPATH, using ="//p[@class=\"premEconomyTextSimple blackFont\"]")
	WebElement Senior_Fare;

	

	public void roundTrip4() {
		if(!roundTrip_button.isSelected()) {
			roundTrip_button.click();

		}
	}


	public void roundTrip_travellerClass4() {
		//wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(traveller_class_roundtrip));
		traveller_class_roundtrip3.click();

	}


	public void One_roundTrip_adult4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(One_adult_roundtrip));
		One_adult_roundtrip4.click();

	}



	public void Zero_roundTrip_child4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(zero_child_roundtrip));
		zero_child_roundtrip4.click();

	}


	public void Three_Infant4() {
		Three_infant_roundtrip4.click();
	}


	public void Business_travellingClass4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(Economy_travelling_class));
		Business_travelling_class4.click();

	}

	public void roundTrip_applyButton4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		apply_button_roundtrip.click();

	}

	public void SCFare_Button4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		SCFare_button_roundtrip4.click();

	}

	public void roundTrip_searchButton4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(search_button));
		search_button_roundtrip.click();

	}

	public void SCFare_error4() {
		String SCFARE_ERROR=Senior_Fare.getText();
		System.out.println(SCFARE_ERROR);
		String SCFARE_TITLE =driver.getTitle();
		System.out.println("PAGE :" + SCFARE_TITLE);
	}


	
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------------
	//Armed Force flights



	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div[2]/header/div[2]/div/ul/li[2]")
	WebElement Armed_Force5;

	@FindBy(how=How.XPATH, using ="//*[@id=\"search-button\"]")
	WebElement Search_button5;

	@FindBy(how=How.XPATH, using="//span[@class=\"premEconTag\"]")
	WebElement text_about_ArmedForces;





	public void Armedforce_Button4() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		Armed_Force5.click();

	}



	public void roundTrip_searchButton5() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(search_button));
		Search_button5.click();

	}



	public void Armed_Available_Flights() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(text_about_available_fights_roundTrip));
		String Available_flights_Armed = text_about_ArmedForces.getText();
		System.out.println("Armed Forces :" + Available_flights_Armed);
		//driver.quit();
		//			String Tittle =driver.getTitle();
		//			System.out.println("PAGE :" + Tittle);

	}

	//--------------------------------------------------------------------------------------------------------------------------------------------------------

	//Student Fare


	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div[2]/header/div[2]/div/ul/li[3]")
	WebElement Studentfare_Force6;

	@FindBy(how=How.XPATH, using ="//*[@id=\"search-button\"]/span")
	WebElement Search_button6;

	@FindBy(how=How.XPATH, using="//span[@class=\"premEconTag\"]")
	WebElement text_about_Studentfare;
	
	public void StudentFare_Button6() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		Studentfare_Force6.click();
	}


	public void roundTrip_searchButton6() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(search_button));
		Search_button6.click();

	}


	//==================================================================================================================================================

	//Filters
	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/label/div/p")
	WebElement Non_Stop;

	@FindBy(how=How.XPATH, using="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/label/div/p")
	WebElement Clicked7;

	public void Non_Stop_7() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Non_Stop));
		//wait.until(ExpectedConditions.textToBePresentInElement(Non_Stop, "Non Stop (46)  "));
		Non_Stop.click();
	}

	public void Clicked() {
		String FILTER = Clicked7.getText();
		System.out.println("It is selected" + FILTER);
	}



	//========================================================================================================================================================
	//Checking Info


	@FindBy(how=How.XPATH, using ="//span[@class='customArrow arrowUp']")
	WebElement Arrow_button;

	@FindBy(how=How.LINK_TEXT, using ="FLIGHT DETAILS")
	WebElement FDetails;

	@FindBy(how=How.LINK_TEXT,using="FARE SUMMARY")
	WebElement Fare_Summary;
	
	@FindBy(how=How.XPATH, using ="//p[normalize-space()='Fare breakup']")
	WebElement text_fare;

	public void arrow_button() throws InterruptedException {
		Arrow_button.click();
		Thread.sleep(4000);
	}
	
	
	public void Options() throws InterruptedException {
		System.out.println("User Will see the Fare details, Fare Summary  ,Cancellation  , Cancel or change date");
		Thread.sleep(2000);
	}

	public void Faresummary() throws InterruptedException {
		FDetails.click();
		Fare_Summary.click();
		Thread.sleep(2000);
	}


public void see_summary() {
	String Fare_Details = text_fare.getText();
	System.out.println("Details :" + Fare_Details);
}

	//===================================================================================================================================================
	//Lock Price
	@FindBy(how=How.XPATH, using ="//button[@class=\"buttonSecondryInvert button buttonBig \"]")
	WebElement Lock_PriceB;

	@FindBy(how=How.XPATH, using ="//button[@class=\"button buttonPrimary buttonBig fontSize14 capText\"]")
	WebElement Pay_Now;

	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div/div/div/div/span")
	WebElement PayNow_Lock;

	public void Price_Lock() throws InterruptedException {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(apply_button_roundtrip));
		Lock_PriceB.click();
		Thread.sleep(4000);
	}


	public void Pay_now7() {
		//			wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.elementToBeClickable(search_button));
		Pay_Now.click();


	}

	public void Payment_page() {

		String PAGE = PayNow_Lock.getText();
		System.out.println("Text :" + PAGE);
	}

	//========================================================================================================================================================
	
	//QR code
	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div/main/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/button")
	WebElement view;

	@FindBy(how=How.XPATH, using ="//*[@id=\"root\"]/div/div/main/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[2]")
	WebElement Scan;

	public void Viewqr() throws Exception {
		view.click();
		Thread.sleep(2000);
	}
	
	public void Showqr() {
		String scanmsg = Scan.getText();
		System.out.println("QR IS NOW VISIBLE" + scanmsg);
	}
	
	
	//===========================================================================================================================================================
	
	//Wrong upi
	
	@FindBy(how=How.XPATH, using ="//input[@id='inputVpa']")
	WebElement upinum;

	@FindBy(how=How.XPATH, using ="//button[@class=\"prime__btn paynow__btn font16 text_capitalize\"]")
	WebElement verifybutton;
	
	@FindBy(how=How.XPATH, using ="//span[@class=\"red-text font11 append-top5 \"]")
	WebElement vpaerror;

	public void UPINUMBER() throws Exception {
		upinum.sendKeys("3534534@ybl");
		Thread.sleep(2000);
	}
	
	public void verify2() throws Exception {
		verifybutton.click();
		Thread.sleep(2000);
	}
	
	public void vpa() throws Exception {
		String vperror = vpaerror.getText();
		System.out.println(vperror);
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
}
