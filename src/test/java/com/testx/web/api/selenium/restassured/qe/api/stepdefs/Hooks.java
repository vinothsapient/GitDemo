package com.testx.web.api.selenium.restassured.qe.api.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks {
  private static final Logger CURL_LOG = LoggerFactory.getLogger("curl");
  private TestManagerContext testManagerContext;
  private final CommonGivenTestSteps commonGivenTestSteps;
  private final CommonWhenTestSteps commonWhenTestSteps;

  private static final ThreadLocal<String> SECURITY_CONTEXT = new ThreadLocal<>();

  String logFolder = "apilogs";

  public Hooks(TestManagerContext context,
               CommonGivenTestSteps commonGivenTestSteps,
               CommonWhenTestSteps commonWhenTestSteps) {
    this.testManagerContext = context;
    this.commonGivenTestSteps = commonGivenTestSteps;
    this.commonWhenTestSteps = commonWhenTestSteps;
  }

  public static void setAuth(String auth) {
    SECURITY_CONTEXT.set(auth);
  }

  public static String getAuth() {
    return SECURITY_CONTEXT.get();
  }

  @Before()
  public void beforeScenario(Scenario scenario) throws Exception {
    createToken();
//    CURL_LOG.info("## SCENARIO: {}", scenario.getName());
//    PrintStream printStream = null;
//    File fileWriter;
//    String scenarioID = scenario.getId();
//    String[] fileName = scenarioID.split("[.;:/]");
//    String dir = logFolder + "/" + fileName[4] + "/" + fileName[5];
//    File featureDirectory = new File(dir);
//    if (!featureDirectory.exists()) featureDirectory.mkdirs();
//    fileWriter = new File(dir + "/" + fileName[5] + fileName[7] + ".log");
//    if (!fileWriter.exists()) {
//      try {
//        fileWriter.createNewFile();
//      } catch (IOException e) {
//        System.out.println("file not created:" + fileWriter.getPath());
//      }
//    }
//    try {
//      printStream = new PrintStream(new FileOutputStream(fileWriter), true);
//      printStream.append("Scenario Name: " + scenario.getName() + System.lineSeparator());
//      testManagerContext.getHttpRequest().restConfig.setDefaultStream(printStream);
//      testManagerContext.getHttpRequest().initNewSpecification();
//    } catch (FileNotFoundException e) {
//      throw new FileNotFoundException("file not found");
//    }
  }

//  @After()
//  public void afterScenario(Scenario scenario) throws Exception {
//    if (scenario.isFailed()) {
//      String scenarioID = scenario.getId();
//      String[] fileName = scenarioID.split("[.;:/]");
//      File log =
//          new File(
//              logFolder
//                  + "/"
//                  + fileName[12]
//                  + "/"
//                  + fileName[13]
//                  + "/"
//                  + fileName[13]
//                  + fileName[15]
//                  + ".log");
//      byte[] byteData = new byte[0];
//      try {
//        byteData = Files.readAllBytes(log.toPath());
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//      scenario.attach(byteData, "text/plain","");
//    }
//    testManagerContext.getSoftAssertions().assertAll();
//  }

  public void createToken() throws Exception {
    if (getAuth() == null) {
      commonGivenTestSteps.iHaveAPI("Login_User");
      commonGivenTestSteps.content_Type("JSON");
      commonGivenTestSteps.iSetRequestBodyAs("ValidCredentials");
      commonGivenTestSteps.setHeaderForGetReq();
      commonWhenTestSteps.iCallMethodPOST("POST");
      commonWhenTestSteps.iGetTokenFromResponse();
      setAuth(commonWhenTestSteps.ecommToken);
    }
  }
}
