package com.rtnshimmer;

import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.shimmer.Shimmer;

public class RTNShimmerManagerImpl {
    public static final String NAME = "RTNShimmer";

    public static RTNShimmer createViewInstance(ThemedReactContext context) {
        return new RTNShimmer(context);
    }

    public static void setAnimating(RTNShimmer view, boolean value) {
        view.getBuilder().setAutoStart(value);
        view.updateShimmer();
    }

    public static void setShimmeringOpacity(RTNShimmer view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setBaseAlpha(value);
        view.updateShimmer();
    }

    public static void setAnimationOpacity(RTNShimmer view, float value) {
         if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setHighlightAlpha(value);
        view.updateShimmer();
    }

    public static void setShimmeringDirection(RTNShimmer view, @Nullable String value) {
        int direction = Shimmer.Direction.LEFT_TO_RIGHT;
        switch (value) {
            case "up":
                direction = Shimmer.Direction.BOTTOM_TO_TOP;
                break;
            case "left":
                direction = Shimmer.Direction.RIGHT_TO_LEFT;
                break;
            case "down":
                direction = Shimmer.Direction.TOP_TO_BOTTOM;
                break;
            case "right":
            default:
                break;
        }

        view.getBuilder().setDirection(direction);
        view.updateShimmer();
    }

    public static void setDuration(RTNShimmer view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setDuration(value);
        view.updateShimmer();
    }

    public static void setPauseDuration(RTNShimmer view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setRepeatDelay(value);
        view.updateShimmer();
    }

    public static void setTilt(RTNShimmer view, float value) {
        view.getBuilder().setTilt(value);
        view.updateShimmer();
    }

    public static void setIntensity(RTNShimmer view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setIntensity(value);
        view.updateShimmer();
    }

    public static void setHighlightLength(RTNShimmer view, float value) {
        // Do nothing. iOS only property
    }

    public static void setBeginFadeDuration(RTNShimmer view, float value) {
        // Do nothing. iOS only property
    }

    public static void setEndFadeDuration(RTNShimmer view, float value) {
        // Do nothing. iOS only property
    }
}