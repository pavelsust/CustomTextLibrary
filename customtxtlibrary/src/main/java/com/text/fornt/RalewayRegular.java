package com.text.fornt;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by android on 1/17/2018.
 */

public class RalewayRegular extends TextView {

    public RalewayRegular(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public RalewayRegular(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public RalewayRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface(FontCache.RALEWAY_REGULAR, context);
        setTypeface(customFont);
    }
}
