package PactProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.matcher.DetailedCookieMatcher;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.hamcrest.Matcher;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class gitHubProject {

    String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAICQcwneJs+OxmGiZqA9Ks35vrcD6l4gb/8xHUtbK7tnz";
    int sshKeyId;


    RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://api.github.com/user/keys") 
            .addHeader("Authorization", "token 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")
            .addHeader("Content-Type", "json")
            .build();

    ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectBody("key",equalTo(sshKey))
            .expectBody("title",equalTo("TestAPIKey"))
            .build();

    @Test(priority=1)
    public void postRequestTest(){
        Map<String,String> reqBody =new HashMap<>();
        reqBody.put("title","TestAPIKey");
        reqBody.put("key",sshKey);
        Response response= given().spec(requestSpec).body(reqBody).when().post();
        sshKeyId = response.then().extract().path("id");
        System.out.println(sshKeyId);
        response.then().statusCode(201).spec(responseSpec);
    }

    @Test(priority=2)
    public void getRequestTest(){
         given().spec(requestSpec).pathParam("keyId",sshKeyId)
                 .when().get("/{keyId}")
                 .then().statusCode(200).spec(responseSpec);

    }

    @Test(priority=3)
    public void deleteRequestTest() {
        given().spec(requestSpec).pathParam("keyId", sshKeyId)
                .when().delete("/{keyId}")
                .then().statusCode(anyOf(is(200),is(204))).time(lessThan(3000L));
    }

}

