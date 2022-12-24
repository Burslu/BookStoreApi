package trendyolAPI.tests;

import Utilities.Helper.Helper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import trendyolAPI.pojo.ResponseTrendyol;

public class quantityTest {

    //Quantity alaninin calisip calismadigini kontrol eden test
    @Test(description = "0 in altinda bir deger girildiginde bos liste donmelidir")
    public void a(){
        String GetUrl = "https://fakerapi.it/api/v1/companies";
        Response response =
                Helper.TrendyolGetHelper(GetUrl,-10);
        ResponseTrendyol responseTrendyol = response.as(ResponseTrendyol.class);
        Assert.assertEquals(responseTrendyol.data.size(),0);



    }
    @Test(description ="0 girildiginde Default deger doner ." )
    public void b(){
        String GetUrl = "https://fakerapi.it/api/v1/companies";
        Response response =
                Helper.TrendyolGetHelper(GetUrl,0);
        ResponseTrendyol responseTrendyol = response.as(ResponseTrendyol.class);
        Assert.assertEquals(responseTrendyol.data.size(),10);

    }
    @Test(description =" 0 ile 1000 arasinda bir deger girildiginde girilen sayi kadar liste donmelidir")
    public void c(){
        String GetUrl = "https://fakerapi.it/api/v1/companies";
        Response response =
                Helper.TrendyolGetHelper(GetUrl,10);
        ResponseTrendyol responseTrendyol = response.as(ResponseTrendyol.class);
        Assert.assertEquals(responseTrendyol.getData().size(),10);
        Assert.assertEquals(responseTrendyol.total,10);

    }
    @Test(description = " 1000 girildiginde 1000 kayitli liste donmelidir")
    public void d(){
        String GetUrl = "https://fakerapi.it/api/v1/companies";
        Response response =
                Helper.TrendyolGetHelper(GetUrl,1000);
        ResponseTrendyol responseTrendyol = response.as(ResponseTrendyol.class);
        Assert.assertEquals(responseTrendyol.getData().get(999).getId(),1000);

    }



    @Test(description =  "1000 uzeride bir deger girildiginde 1000 kayitli liste donmelidir")
    public void e(){
        String GetUrl = "https://fakerapi.it/api/v1/companies";
        Response response =
                Helper.TrendyolGetHelper(GetUrl,1005);
        ResponseTrendyol responseTrendyol = response.as(ResponseTrendyol.class);
        Assert.assertEquals(responseTrendyol.getData().get(999).getId(),1000);
    }
}
