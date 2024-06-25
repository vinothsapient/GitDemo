package com.testx.web.api.selenium.restassured.qe.api.stepdefs;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.testx.web.api.selenium.restassured.qe.api.enums.ApiContext;
import com.testx.web.api.selenium.restassured.qe.api.httpservicemanager.HttpResponseManager;
import com.testx.web.api.selenium.restassured.qe.api.httpservicemanager.RestRequestManager;
import com.testx.web.api.selenium.restassured.qe.api.util.ApiUtilManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.Assert;

public class CommonWhenTestSteps {

  HttpResponseManager httpResponseManager;
  TestManagerContext testManagerContext;
  RestRequestManager restRequestManager;
  String ecommToken;

  public CommonWhenTestSteps(TestManagerContext context) {
    testManagerContext = context;
    httpResponseManager = testManagerContext.getHttpResponse();
    restRequestManager = testManagerContext.getRestRequest();
  }

  @When("^the client performs (.+) request on API \"(.+)\"$")
  public void perform_Http_Request(String httpMethod, String url) throws Throwable {
    httpResponseManager.setResponsePrefix("");
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    httpResponseManager.setResponse(httpResponseManager.doRequest(httpMethod, apiUtilManager.getBasePath(url)));
  }

  @When("I call method {string}")
  public void iCallMethodPOST(String httpMethod) throws Exception {
    httpResponseManager.setResponsePrefix("");
    String basePath = (String) testManagerContext.getScenarioContext().getContext(ApiContext.BASE_PATH);
    httpResponseManager.setResponse(httpResponseManager.doRequest(httpMethod, basePath));
  }

  @And("I get the response")
  public void iGetTheResponse() {
    testManagerContext
        .getScenarioContext()
        .setContext(ApiContext.RESPONSE_BODY, httpResponseManager.getResponse().asString());
  }

  public void iGetTokenFromResponse() {
    ecommToken = httpResponseManager.getResponse().path("ecommToken");
  }

  @And("I set request header for refresh token")
  public void iSetRequestHeaderForRefreshToken() throws IOException, URISyntaxException {
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    restRequestManager.setRequestHeader(apiUtilManager.getHeader((String) testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME),
            (String) testManagerContext.getScenarioContext().getContext(ApiContext.ID)));
    restRequestManager.setRequestHeader("ecommToken", Hooks.getAuth());
  }

  @And("I save the initial response")
  public void iSaveTheInitialResponse() {
    testManagerContext
            .getScenarioContext()
            .setContext(ApiContext.INITIAL_RESPONSE_BODY, httpResponseManager.getResponse().asString());
  }

  @And("I set ecomm token in request header")
  public void iSetECommTokenRequestHeader() throws IOException, URISyntaxException {
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    restRequestManager.setRequestHeader(apiUtilManager.getHeader((String) testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME),
            (String) testManagerContext.getScenarioContext().getContext(ApiContext.ID)));
    restRequestManager.setRequestHeader("token", Hooks.getAuth());
  }

  @And("I set cart id {string} for update cart")
  public void iProvideCartId(String name) {
    restRequestManager.setPathParam(name, httpResponseManager.getResponse().path("cart.cartId"));
  }

  @And("I set order id {string} for get Order details")
  public void iProvideOrderId(String name) {
    restRequestManager.setPathParam(name, httpResponseManager.getResponse().path("orders[0].orderId"));
  }

  @And("I get the {string} from response body")
  public void iGetTheFromResponseBody(String token) {
    testManagerContext
            .getScenarioContext()
            .setContext(ApiContext.BEARER_TOKEN, httpResponseManager.getJsonPathValue(token));
  }

  @And("I set item id {string} for remove cart")
  public void iProvideItemId(String name) {
    restRequestManager.setPathParam(name, httpResponseManager.getResponse().path("cart.items[0].itemId"));
  }

  @And("I verify that there are maximum {int} records for {string}")
  public void iVerifyThatThereAreMaximumRecords(int count,String arrayName)  {
    String res = httpResponseManager.getResponse().asString();
    JsonObject jsonObject = (JsonObject)new JsonParser().parse(res);
    JsonArray ArrayObject = jsonObject.getAsJsonArray(arrayName);
    System.out.println(ArrayObject.size());
    Assert.assertEquals(ArrayObject.size(),count);
      }

}
