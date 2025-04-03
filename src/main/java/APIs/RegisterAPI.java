package APIs;

import io.restassured.http.Cookies;
import io.restassured.response.Response;


import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class RegisterAPI {


     Cookies cookies;

     public Cookies getCookies() {
         return cookies;
     }



    public void getLoginPage(){

       Response response = given()
                .baseUri("https://masra.neop.co/company/auth").
        when()
                .get("/login")

                .then()
                .log().all()
                .extract()
                .response();
    }




    public Response registerWithAPI() {

        HashMap<String,String> map = new HashMap<>();
        map.put("email","sacapedit@sacap.com");
        map.put("password","Neop2020!");

        Response response = (Response) given()
                .baseUri("https://masra.neop.co/api/company/v1")
                .body(map)
                .header("Accept","application/json")
                .header("Content-Type","application/json")



                .when()
                .post("/login")


                .then()
                .log().all()
                .extract()
                .response();

        this.cookies = response.getDetailedCookies();
        return response;
    }
}
