package com.testx.web.api.selenium.restassured.qe.ui.capabilities;

public class BrowserStack {

    private String key;

    private String user;

    private String url;

    private String baseUrl;

    private int idleTimeout;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public int getidleTimeout() {
        return idleTimeout;
    }

    public void setidleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

}
