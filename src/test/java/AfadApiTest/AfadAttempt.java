package AfadApiTest;

import Utilities.Helper.Helper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AfadAttempt {

    @Test

    public void afadGETTest(){

        String GetUrl = "https://deprem.afad.gov.tr/apiv2/event/filter";

        Response response  =
                Helper.getAfadHelp(GetUrl,"2020-09-14 10:00:00","2022-09-16 10:00:00");

        AfadResponsePojo responsePojo[] = response.as(AfadResponsePojo[].class);
        ArrayList<AfadResponsePojo> rmsDeger = new ArrayList<>();
        for (int i = 0; i < responsePojo.length; i++) {
            if (Double.parseDouble(responsePojo[i].getRms())>=0.8){
                rmsDeger.add(responsePojo[i]);
                System.out.println("\n");
                System.out.println(responsePojo[i]+"\n");

            }
        }



    }

}
