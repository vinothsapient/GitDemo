package com.testx.web.api.selenium.restassured.qe.ui.capabilities;

public class Cloud {
    private BrowserStack browserStack;

    private Perfecto perfecto;

    public Cloud(BrowserStack browserStack, Perfecto perfecto) {
        this.browserStack = browserStack;
        this.perfecto = perfecto;
    }

    public BrowserStack getBrowserStack() {
        return browserStack;
    }

    public Perfecto getPerfecto() {
        return perfecto;
    }
}
