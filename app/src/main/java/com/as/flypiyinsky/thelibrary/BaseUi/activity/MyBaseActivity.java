package com.as.flypiyinsky.thelibrary.BaseUi.activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

import cn.jzvd.Jzvd;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * -----------------------------
 * Created by zqf on 2018/7/4.
 * ---------------------------
 */

@SuppressLint("Registered")
public class MyBaseActivity extends SupportActivity {


    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBackPressedSupport() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressedSupport();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        JZVideoPlayer.releaseAllVideos();
    }



}
