package com.testx.web.api.selenium.restassured.qe.common.utils;

import java.util.HashMap;
import java.util.Map;

public class TestVariables {

    public static Map<String,String> variables=new HashMap<>();
    public static void store(String key,String value){
        variables.put(key, value);
    }
    public static String getValue(String key){
        return variables.get(key);
    }
}
