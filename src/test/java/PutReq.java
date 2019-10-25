import java.util.HashMap;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class PutReq {



    public static HashMap map = new HashMap();
@BeforeClass
        void putData(){
            map.put("name","Johny125");
            map.put("salary","100000");
            map.put("age","30");


        }
        @Test
        public void putReqDemo(){

            given()
                     .contentType("application/json")
                     .body(map)
                     .when()
                     .put("http://dummy.restapiexample.com/api/v1/update/5031")
                     .then()
                     .statusCode(200)
                     .log().all()
                     .log().body();


        }





    }


