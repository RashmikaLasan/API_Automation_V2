package Steps.HotelCalendar;

import Actions.HotelCalendar.HotelCalendarActions;
import cucumber.api.java.en.*;

public class HotelCalendarSteps {

    HotelCalendarActions hotelCalendarActions = new HotelCalendarActions();

    @When("^I click create user HotelID as \"([^\"]*)\" ToDate as \"([^\"]*)\" FromDate as \"([^\"]*)\" City as \"([^\"]*)\"$")
    public void iClickCreateUserHotelIDAsToDateAsFromDateAsCityAs(String HotelID, int StartDateCount, int EndDateCount,  String CityName){

        hotelCalendarActions.HotelCalendarBody(HotelID, StartDateCount, EndDateCount, CityName);

    }

    @When("^I click create calendar body$")
    public void iClickCreateCalendarBody(){

        hotelCalendarActions.sendHotelCalendarRequest();

    }

    @When("^I click send request for Hotel Calendar$")
    public void iClickSendRequestForHotelCalendar(){

        hotelCalendarActions.getHotelCalendarResponse();

    }


    @And("^extract price from the response for StartDateCount Date$")
    public void extractPriceFromTheResponseForStartDateCountDate() {

        hotelCalendarActions.hotelCalendarPriceExtract();
    }
}
