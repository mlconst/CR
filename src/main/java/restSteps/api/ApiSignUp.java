package restSteps.api;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import org.json.JSONObject;
import restSteps.ParentApi;

import static io.restassured.RestAssured.given;

public class ApiSignUp extends ParentApi {
    public ResponseBody custemerRegistrationByApi(JSONObject requestParams){
        return given()
                .contentType(ContentType.JSON)
                .body(requestParams.toMap())
                .when()
                .post(apiEndPoints.cryptorunadmin_softermii_co_api_account_register())
                .then()
                .statusCode(200)
                .extract()
                .response().getBody();
    }
}

