package steps.HotelCalendar;

import actions.HotelCalendar.HotelCalendarActions;
import cucumber.api.java.en.*;

import java.io.IOException;

public class HotelCalendarSteps {

    HotelCalendarActions hotelCalendarActions = new HotelCalendarActions();

    @When("^I click create user HotelID as \"([^\"]*)\" ToDate as \"([^\"]*)\" FromDate as \"([^\"]*)\" City as \"([^\"]*)\"$")
    public void iClickCreateUserHotelIDAsToDateAsFromDateAsCityAs(String HotelID, int StartDateCount, int EndDateCount, String CityName) {

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

    @And("extract the price for dates")
    public void extractThePriceForDates() {

        hotelCalendarActions.htlCalPricing();
    }


    @When("I click create user ToDate as \"([^\"]*)\" FromDate as \"([^\"]*)\"")
    public void iClickCreateUserToDateAsFromDateAs(int StartDateCount, int EndDateCount) throws IOException {

        hotelCalendarActions.HotelCalendarExcelBody(StartDateCount, EndDateCount);

    }

    @And("assert the Hotel Code is \"([^\"]*)\"  in Response")
    public void assertTheHotelCodeIsInResponse(String hotelId) {

        hotelCalendarActions.htlCalendarProductCodeAssertion(hotelId);

    }
}
