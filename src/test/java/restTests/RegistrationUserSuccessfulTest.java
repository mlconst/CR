package restTests;

import io.restassured.response.ResponseBody;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import restSteps.api.ApiLogIn;

public class RegistrationUserSuccessfulTest {
    @Test
    public void registrationSuccessful() {
//        String dateTime = getDateAndTimeFormated();
       // String dateTime = "2019-03-28_21-35-10";

        JSONObject requestParams = new JSONObject();
        requestParams.put("confirmPassword", "*B43b42bbbb");
        requestParams.put("email", "konstantin.melnikov+pklw45inbflum@softermii.com"); // Cast
        requestParams.put("password", "*B43b42bbbb");
        requestParams.put("userName", "fg4rd4lrlgyikf");
   //     requestParams.put("ref", "");
        HttpPost postRequest = new HttpPost("URI");
        postRequest.addHeader("Origin", "http://176.9.52.177:10081");
        postRequest.addHeader("Content-Type", "application/json");

        ApiLogIn apiLogIn = new ApiLogIn();
        ResponseBody response = apiLogIn.custemerRegistrationByApi(requestParams);

        System.out.println("Response " + response.asString());
        if (response.jsonPath().get("SuccessCode") == null) {
            String failCode = response.jsonPath().get("FaultId");
            Assert.fail(failCode);
        } else {
            Assert.assertEquals("Correct Success code was returned", response.jsonPath().get("SuccessCode"), "OPERATION_SUCCESS");
        }
    }
}

