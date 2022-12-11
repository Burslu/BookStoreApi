package trendyolAPI.tests;

import Utilities.Helper.Helper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import trendyolAPI.pojo.TextPojo;

public class TestText {

//    @Test
//
//    public void Text(){
//
//        String GetUrl = "https://fakerapi.it/api/v1/texts";
//
//        Response response =
//                Helper.TrendyolGetHelperText(GetUrl,1,500);
//        TextPojo textPojo = response.as(TextPojo.class);
//        Assert.assertEquals(textPojo.getData().size(),1);
//        Assert.assertNotNull(textPojo.getData().get(0).getTitle());
//        Assert.assertNotNull(textPojo.getData().get(0).getAuthor());
//        Assert.assertNotNull(textPojo.getData().get(0).getGenre());
//        Assert.assertNotNull(textPojo.getData().get(0).getContent());
//    }
//    @Test(description = "195 den buyuk olup 200den kucuk olan durumlar icin gecerli test . ")
//
//    public void contentLenght200(){
//        String GetUrl = "https://fakerapi.it/api/v1/texts";
//        Response response =
//                Helper.TrendyolGetHelperText(GetUrl,1,200);
//        TextPojo textPojo = response.as(TextPojo.class);
//        //Assert.assertEquals(textPojo.getData().get(0).getContent().length(),200);
//        Assert.assertTrue(195 <= textPojo.getData().get(0).getContent().length() && textPojo.getData().get(0).getContent().length() <= 200);
//}
//@Test(description = "content deger 500 icin test gerceklestirildiginde 495 ile 500 arasinda bir contentlenght uzunlu almaliyiz . ")
//    public void contentLenght500(){
//        String GetUrl = "https://fakerapi.it/api/v1/texts";
//        Response response =
//                Helper.TrendyolGetHelperText(GetUrl,1,500);
//        TextPojo textPojo = response.as(TextPojo.class);
//       // Assert.assertEquals(textPojo.getData().get(0).getContent().length(),500);
//    Assert.assertTrue(495 <= textPojo.getData().get(0).getContent().length() && textPojo.getData().get(0).getContent().length() <= 500);
//
//    }
//    @Test(description = "0 degeri verildiginde default deger olur 200 length uzunlugunda bir content dondurur (195,200 arasinda) ")
//    public void contentLenght0(){
//        String GetUrl = "https://fakerapi.it/api/v1/texts";
//        Response response =
//                Helper.TrendyolGetHelperText(GetUrl,1,0);
//        TextPojo textPojo = response.as(TextPojo.class);
//        System.out.println(textPojo.getData().get(0).getContent().length());
//        Assert.assertTrue(195 <= textPojo.getData().get(0).getContent().length() && textPojo.getData().get(0).getContent().length() <= 200);
//
//    }

}
