import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class GetREq {

@Test
    public void getWeatherReport( ) {
        given()

                 .when()
                 .get("http://restapi.demoqa.com/utilities/weather/city/Delhi")
                 .then()
                 .statusCode(200)

                 .assertThat().body("City",equalTo("Delhi"))
                 .header("content-type","application/json")
                 //.log().all(); full details
                .log().body();


    }




}
