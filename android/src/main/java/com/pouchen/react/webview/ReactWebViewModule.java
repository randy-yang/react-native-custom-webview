package com.pouchen.react.webview;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = ReactWebViewModule.MODULE_NAME)
public class ReactWebViewModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "PCCWebViewModule";

    public ReactWebViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return MODULE_NAME;
    }
}
