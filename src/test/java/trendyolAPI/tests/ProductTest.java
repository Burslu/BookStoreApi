package trendyolAPI.tests;

import Utilities.Helper.Helper;
import com.aventstack.extentreports.ExtentTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import trendyolAPI.pojo.LaststeapProduct.ResponseMain;

public class ProductTest extends Helper{

    @Test
    public void ProductStepTest(){
        String GetUrl = "https://fakerapi.it/api/v1/products";


        ExtentTest test = extent.createTest("sampleTest");
        test.info("biseyler oldu");
                Response response =
                Helper.Trendyolproduct(GetUrl,1,12,"56d80233-fa29-3f3b-8717-d66d24ce8780");
            ResponseMain responseMain = response.as(ResponseMain.class);
        Assert.assertEquals(responseMain.getData().get(0).getId(),1);
        Assert.assertNotNull(responseMain.getData().get(0).getName());
        Assert.assertNotNull(responseMain.getData().get(0).getCategories());
        Assert.assertNotNull(responseMain.getData().get(0).getDescription());
        Assert.assertNotNull(responseMain.getData().get(0).getEan());
        Assert.assertNotNull(responseMain.getData().get(0).getImage());
        Assert.assertNotNull(responseMain.getData().get(0).getImages());


    }
}
