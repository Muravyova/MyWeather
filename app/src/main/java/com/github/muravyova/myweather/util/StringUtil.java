package com.github.muravyova.myweather.util;

import android.support.annotation.Nullable;

public class StringUtil {

    public static boolean isNullOrEmpty(@Nullable String s){
        return s == null || s.length() == 0;
    }
}
