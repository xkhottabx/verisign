package com.verisign.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class APIUtils {

    private static Response response;

    public static void setResponse(Response res) {
        response = res;
    }

    public static Response getResponse() {
        return response;
    }

    public static String generateToken() {
        Response response = given().queryParams("email", ConfigurationReader.getProperty("email"),
                "password", ConfigurationReader.getProperty("password"))
                .when().get(ConfigurationReader.getProperty("baseuri") + "/sign");

        JsonPath jsonPath = response.body().jsonPath();
        String token = jsonPath.getString("accessToken");
        return token;

    }


}
