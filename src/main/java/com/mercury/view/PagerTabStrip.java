package com.mercury.view;

/*
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
*/

public class PagerTabStrip  {
    private static final int PADDING_BOTTOM = 9; // dp

    public PagerTabStrip() {
        /*
        super(context, attrs);
        for (int i = 0; i < getChildCount(); i++) {
            View v = getChildAt(i);
            if (v instanceof TextView) {
                TextView t = (TextView) v;
                t.setPadding(0, 0, 0, getPixelsFromDps(PADDING_BOTTOM));
            }
        }
        */
    }

    private int getPixelsFromDps(int dps) {
       // final float density = getResources().getDisplayMetrics().density;
        //return (int) (dps * density + 0.5f);
        return 0;
    }
}
