package com.unfaded.customview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by AminulHasan on 12/9/15.
 */
public class HackishFrameLayout extends LinearLayout {
    ViewPager pager;

    public HackishFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public HackishFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        setLayerType(LAYER_TYPE_SOFTWARE, null);
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        pager = (ViewPager) findViewById(R.id.pager1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return pager.dispatchTouchEvent(event);
    }
}

