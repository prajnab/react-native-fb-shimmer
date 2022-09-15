package com.rtnshimmer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.bridge.ReactApplicationContext;

public class RTNShimmerManager extends ViewGroupManager<RTNShimmer> {
    ReactApplicationContext mCallerContext;

    public RTNShimmerManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return RTNShimmerManagerImpl.NAME;
    }

    @Override
    public RTNShimmer createViewInstance(ThemedReactContext context) {
        return RTNShimmerManagerImpl.createViewInstance(context);
    }

    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RTNShimmer view, boolean value) {
        RTNShimmerManagerImpl.setAnimating(view, value);
    }

    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setBaseOpacity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setShimmeringOpacity(view, value);
    }

    @ReactProp(name = "animationOpacity", defaultFloat = 1.0f)
    public void setHighlightOpacity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setAnimationOpacity(view, value);
    }

    @ReactProp(name = "shimmeringDirection")
    public void setDirection(RTNShimmer view, String value) {
        RTNShimmerManagerImpl.setShimmeringDirection(view, value);
    }

    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RTNShimmer view, int value) {
        RTNShimmerManagerImpl.setDuration(view, value);
    }

    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RTNShimmer view, int value) {
        RTNShimmerManagerImpl.setPauseDuration(view, value);
    }

    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RTNShimmer view, int value) {
        RTNShimmerManagerImpl.setTilt(view, value);
    }

    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setIntensity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setIntensity(view, value);
    }
}