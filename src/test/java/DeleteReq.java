

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;



public class DeleteReq {


    @Test
    public void testDel( ) {

        Response res =

                 when()
                          .delete("http://dummy.restapiexample.com/api/v1/delete/5031")

                          .then()
                          .statusCode(200)
                          .log().body()
                          .extract().response();
        String response = res.asString();//convert html to string
        Assert.assertEquals(response.contains("successfully! deleted Records") , true);

    }

}
