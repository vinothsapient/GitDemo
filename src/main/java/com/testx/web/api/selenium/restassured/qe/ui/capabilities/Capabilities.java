package com.testx.web.api.selenium.restassured.qe.ui.capabilities;

public class Capabilities {

    private PlatformDesiredCapabilities android;
    private PlatformDesiredCapabilities ios;
    private Cloud cloud;

    public PlatformDesiredCapabilities getAndroid() {
        return android;
    }

    public void setAndroid(PlatformDesiredCapabilities android) {
        this.android = android;
    }

    public PlatformDesiredCapabilities getIos() {
        return ios;
    }

    public void setIos(PlatformDesiredCapabilities ios) {
        this.ios = ios;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }
}
