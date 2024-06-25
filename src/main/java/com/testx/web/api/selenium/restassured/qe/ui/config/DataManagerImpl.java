package com.testx.web.api.selenium.restassured.qe.ui.config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class DataManagerImpl {

    private Gson gson = new Gson();

    private String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

    
    public <T> T getTypeData(String path, Type type) throws IOException {
        String json = readFile(path);
        return gson.fromJson(json, type);
    }

    
    public <T> ArrayList<T> getArrayListData(String path, Class<T> tClass) throws IOException {
        Type type = TypeToken.getParameterized(ArrayList.class, tClass).getType();
        return getTypeData(path, type);
    }

    
    public <K, V> HashMap<K, V> getHashMapData(String path, Class<K> keyClass, Class<V> valueClass) throws IOException {
        Type type = TypeToken.getParameterized(HashMap.class, keyClass, valueClass).getType();
        return getTypeData(path, type);
    }

    
    public <T> T getObjectData(String path, Class<T> tClass) throws IOException {
        Type type = TypeToken.get(tClass).getType();
        return getTypeData(path, type);
    }
}
