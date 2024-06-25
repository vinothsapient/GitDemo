package com.testx.web.api.selenium.restassured.qe.ui.capabilities;

import java.util.ArrayList;

public class PlatformDesiredCapabilities {
    private String build;
    private String url;
    private ArrayList<Device> devices;

    private String appActivity;

    private String app;
    private ArrayList<Device> cloudDevices;

    public ArrayList<Device> getCloudDevices() {
        return cloudDevices;
    }

    public void setCloudDevices(ArrayList<Device> cloudDevices) {
        this.cloudDevices = cloudDevices;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public void setAppActivity(String getAppActivity) {
        this.appActivity = getAppActivity;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String getApp) {
        this.app = getApp;
    }

    public String getUrl() {
        return url;
    }
}
