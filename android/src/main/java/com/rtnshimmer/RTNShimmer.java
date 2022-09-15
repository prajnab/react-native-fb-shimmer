package com.rtnshimmer;

import android.annotation.TargetApi;
import androidx.annotation.Nullable;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;

public class RTNShimmer extends ShimmerFrameLayout {
    private Shimmer.Builder builder = new Shimmer.AlphaHighlightBuilder();
    
    public RTNShimmer(Context context) {
        super(context);
    }

    public RTNShimmer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RTNShimmer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RTNShimmer(
        Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public Shimmer.Builder getBuilder() {
        return builder;
    }

    public void updateShimmer() {
        setShimmer(builder.build());
    }
}

