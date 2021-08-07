package steps.Tritium;

import actions.HotelCalendar.HotelCalendarActions;
import actions.Tritium.TritiumRequestAction;
import cucumber.api.java.en.*;

public class TritiumSearchSteps {

    TritiumRequestAction tritiumRequestAction = new TritiumRequestAction();
    HotelCalendarActions hotelCalendarActions = new HotelCalendarActions();


    @Given("^create body tritiumRequest HotelID as \"([^\"]*)\" FromDate as \"([^\"]*)\" ToDate as \"([^\"]*)\"$")
    public void createBodyTritiumRequestHotelIDAsFromDateAsToDateAs(String hotelID, int fromDate, int toDate){

        tritiumRequestAction.TritiumReqBody( hotelID,fromDate,toDate);

    }

    @When("^I click create Tritium Request Body")
    public void iClickCreateTritiumRequestBody(){

        tritiumRequestAction.sendTritiumRequest();
    }


    @When("^I click send request$")
    public void iClickSendRequest(){

        tritiumRequestAction.getTritiumResponse();

    }

    @And("^extract price from the Tritium response$")
    public void extractPriceFromTheTritiumResponse(){

        tritiumRequestAction.getPriceFromResponse();

    }


}
