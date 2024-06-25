package com.testx.web.api.selenium.restassured.qe.api.stepdefs;

import com.google.common.base.Strings;
import com.testx.web.api.selenium.restassured.qe.api.constants.Entity;
import com.testx.web.api.selenium.restassured.qe.api.constants.Headers;
import com.testx.web.api.selenium.restassured.qe.api.enums.ApiContext;
import com.testx.web.api.selenium.restassured.qe.api.httpservicemanager.RestRequestManager;
import com.testx.web.api.selenium.restassured.qe.api.util.ApiUtilManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;

public class CommonGivenTestSteps {

  public RestRequestManager restRequestManager;
  TestManagerContext testManagerContext;

  public CommonGivenTestSteps(TestManagerContext context) {
    testManagerContext = context;
    restRequestManager = testManagerContext.getRestRequest();
  }

  @Given("I have API {string}")
  public void iHaveAPI(String apiName) throws IOException, URISyntaxException {
    testManagerContext.getScenarioContext().setContext(ApiContext.API_NAME, apiName);
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    String basePath = apiUtilManager.getBasePath((String) testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME));
    testManagerContext.getScenarioContext().setContext(ApiContext.BASE_PATH, basePath);
    apiUtilManager.setEntityHostURI(apiName, testManagerContext);
    restRequestManager.clearRequestBody();
  }

  @And("I set header for this req with bearer token")
  public void iSetHeaderForThisReqWithBearerToken() throws IOException, URISyntaxException {
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    restRequestManager.setRequestHeader(apiUtilManager.getHeader((String) testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME),
            (String) testManagerContext.getScenarioContext().getContext(ApiContext.ID)));
    restRequestManager.setRequestHeader("Authorization", "Bearer " + (String) testManagerContext.getScenarioContext().getContext(ApiContext.BEARER_TOKEN));
  }

  @And("^I set content-type as (.+)$")
  public void content_Type(String contentType) {
    restRequestManager.contentType(ContentType.valueOf(contentType).withCharset("utf-8"));
  }

  @And("I set request body for {string}")
  public void iSetRequestBodyAs(String customer) throws IOException, URISyntaxException, ParseException {
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    iSetRequestHeader();
    restRequestManager.setRequestBody(apiUtilManager.getRequestBody(testManagerContext, customer));
    testManagerContext.getScenarioContext().setContext(ApiContext.REQUEST_BODY, restRequestManager.getRequestBody());
  }

  @And("I set header for this req")
  public void setHeaderForGetReq() throws IOException, URISyntaxException{
    iSetRequestHeader();
  }

  @Given("I set header {string} with a value of {string}")
  public void iProvideTheHeaderWithAValueOf(String name, String value) {
    restRequestManager.setRequestHeader(name,value);
    testManagerContext.getScenarioContext().setContext(ApiContext.BRAND_HEADER, restRequestManager.getHeader().get(Headers.COMMON_HEADERS));
  }

  @And("I set request header")
  public void iSetRequestHeader() throws IOException, URISyntaxException {
    ApiUtilManager apiUtilManager = new ApiUtilManager();

    restRequestManager.setRequestHeader(apiUtilManager.getHeader((String) testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME),
            (String) testManagerContext.getScenarioContext().getContext(ApiContext.ID)));
    String access_token = (String) testManagerContext.getScenarioContext().getContext(ApiContext.ACCESS_TOKEN);
    String apiName = (String) (testManagerContext.getScenarioContext().getContext(ApiContext.API_NAME));
    boolean isAuthAPI = apiName.contains(Entity.AUTH_API);

    if (!Strings.isNullOrEmpty(access_token) & isAuthAPI & (restRequestManager.getHeader().containsKey("Authorization"))) {
      restRequestManager.setRequestHeader("Authorization", "Bearer " + access_token);
    }
  }

  @And("I set parameter {string} with a value of {string}")
  public void iSetParameterWithAValueOf(String name, String value) {
    restRequestManager.setRequestParam(name, value);
  }

  @And("I set the new correlationId in header")
  public void iSetTheNewCorrelationIdInHeader() {
    ApiUtilManager apiUtilManager = new ApiUtilManager();
    restRequestManager.setRequestHeader("x-txn-correlation-id", apiUtilManager.getUniqueCorrelationid());
  }

  @And("I set path param {string} with a value of {string}")
  public void iProvidePathParam(String name, String value) {
    restRequestManager.setPathParam(name,value);
  }

  @And("I set query param {string} with a value of {string}")
  public void iProvideQueryParam(String name, String value) {
    restRequestManager.setQueryParam(name,value);
  }
}
