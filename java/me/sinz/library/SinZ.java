package me.sinz.library;

import android.content.Context;

public class SinZ {

    public static int dip2px(Context ctx, int dips) {
        return (int) Math.ceil(dips * ctx.getResources().getDisplayMetrics().density);
    }

}
