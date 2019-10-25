import java.util.HashMap;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class PostReq {

    public HashMap map = new HashMap();

    @BeforeClass
    public void postData( ) {
        map.put("FistName" , "abxyz123");
        map.put("LastName" , "JohnDavaidabc123");
        map.put("UserName" , "DavidkJohnxyz123");
        map.put("Password" , "jkohnDavidabc9892");
        map.put("Email" , "JohnDavidabc9192@gmail.com");

    }


    @Test
    public void postCustomerDetails( ) {

        given()
                 .contentType("application/json")//mime type
                 .body(map)
                 .when()
                 .post("http://restapi.demoqa.com/customer/register")

                 .then()
                 .statusCode(201)
                 .assertThat().body("SuccessCode" , equalTo("OPERATION_SUCCESS"))
                 .assertThat().body("Message" , equalTo("Operation completed successfully"))
                 .header("Content Encoding" , "gzip")
                 .log().body();

    }

}
