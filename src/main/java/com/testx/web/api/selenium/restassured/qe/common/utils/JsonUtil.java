package com.testx.web.api.selenium.restassured.qe.common.utils;

import static com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils.configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {
    JSONParser parser = new JSONParser();

    public static DocumentContext getDocumentContext(String json) {
        return JsonPath.parse(json);
    }

    public static DocumentContext getDocumentContext(InputStream json) {
        return JsonPath.parse(json);
    }

    public static String getNodeValue(String json, String path){
        return Objects.isNull(getDocumentContext(json).read("$."+path)) ? null : getDocumentContext(json).read("$."+path).toString();
    }

    public static String getNodeValue(InputStream json, String path){
        return Objects.isNull(getDocumentContext(json).read("$."+path)) ? null : getDocumentContext(json).read("$."+path).toString();
    }

    public static String setNodeValue(String json, String path, String valueToReplace){
        return getDocumentContext(json).set("$."+path, valueToReplace).jsonString();
    }

    public File getJsonFile(final String jsonFileName) throws URISyntaxException {

        URL url = this.getClass().getClassLoader().getResource(jsonFileName);
        if(url != null) {
            File jsonFile = new File(url.toURI());
            System.out.println("Reading jsonFile=" + jsonFile);
            return jsonFile;
        }
        return null;
    }

    public String readJSONContent(String mappingFileName) throws IOException, URISyntaxException {
        File jsonFile = this.getJsonFile(mappingFileName);
        Map<String, String> dataMap = null;
        if(jsonFile != null) {
            dataMap = JsonPath.parse(jsonFile).read("$");
        }
        return mappingFileName;
    }

    public String readJSONFile(String filePath) throws FileNotFoundException {
        File initialFile = new File(filePath);
        InputStream targetStream = new FileInputStream(initialFile);
        return Objects.isNull(getDocumentContext(targetStream).read("$.data")) ? null : getDocumentContext(targetStream).read("$.data").toString();
    }
    public JSONObject getJSONDataURL(String filePath) throws IOException, org.json.simple.parser.ParseException{
        String basePath = new File("").getAbsolutePath();
        Object obj = parser.parse(new FileReader(basePath + filePath));
        return (JSONObject) obj;
    }

    public  Map<String, String> getData(String sheetName, String dataName) throws Exception {
        JSONObject jsonObject = getJSONDataURL("/src/test/resources/"+configuration.environmentType()+".json");
        JSONArray payloadJsonArray = (JSONArray) jsonObject.get(sheetName);
        if(payloadJsonArray!=null){
            for (Object object : payloadJsonArray) {
                JSONObject innerObj = (JSONObject) object;
                JSONObject innerObj2 = (JSONObject) innerObj.get(dataName);
        Map<String, String> resultMap = new HashMap<>();
                ObjectMapper mapperObj = new ObjectMapper();
                try {
                    resultMap = mapperObj.readValue(innerObj2.toString(),
                            new TypeReference<HashMap<String, String>>() {
                            });
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return resultMap;
            }
        }
        return null;
    }


}
