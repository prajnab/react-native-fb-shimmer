package com.rtnshimmer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RTNShimmerManagerInterface;
import com.facebook.react.viewmanagers.RTNShimmerManagerDelegate;

@ReactModule(name = RTNShimmerManagerImpl.NAME)
public class RTNShimmerManager extends ViewGroupManager<RTNShimmer> implements RTNShimmerManagerInterface<RTNShimmer> {

    private final ViewManagerDelegate<RTNShimmer> mDelegate;

    public RTNShimmerManager(ReactApplicationContext context) {
        mDelegate = new RTNShimmerManagerDelegate<>(this);
    }

    @NonNull
    @Override
    protected ViewManagerDelegate<RTNShimmer> getDelegate() {
        return mDelegate;
    }

    @NonNull
    @Override
    public String getName() {
        return RTNShimmerManagerImpl.NAME;
    }

    @NonNull
    @Override
    protected RTNShimmer createViewInstance(@NonNull ThemedReactContext context) {
       return RTNShimmerManagerImpl.createViewInstance(context);
    }

    @Override
    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RTNShimmer view, boolean value) {
        RTNShimmerManagerImpl.setAnimating(view, value);
    }

    @Override
    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setShimmeringOpacity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setShimmeringOpacity(view, value);
    }

    @Override
    @ReactProp(name = "animationOpacity", defaultFloat = 1.0f)
    public void setAnimationOpacity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setAnimationOpacity(view, value);
    }

    @Override
    @ReactProp(name = "shimmeringDirection")
    public void setShimmeringDirection(RTNShimmer view, @Nullable String value) {
        RTNShimmerManagerImpl.setShimmeringDirection(view, value);
    }

    @Override
    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RTNShimmer view, int value) {
        RTNShimmerManagerImpl.setDuration(view, value);
    }

    @Override
    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RTNShimmer view, int value) {
        RTNShimmerManagerImpl.setPauseDuration(view, value);
    }

    @Override
    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setTilt(view, value);
    }

    @Override
    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setIntensity(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setIntensity(view, value);
    }

    @Override
    @ReactProp(name = "highlightLength", defaultFloat = 0.0f)
    public void setHighlightLength(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setHighlightLength(view, value);
    }

    @Override
    @ReactProp(name = "beginFadeDuration", defaultFloat = 0.0f)
    public void setBeginFadeDuration(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setBeginFadeDuration(view, value);
    }

    @Override
    @ReactProp(name = "endFadeDuration", defaultFloat = 0.0f)
    public void setEndFadeDuration(RTNShimmer view, float value) {
        RTNShimmerManagerImpl.setEndFadeDuration(view, value);
    }
}