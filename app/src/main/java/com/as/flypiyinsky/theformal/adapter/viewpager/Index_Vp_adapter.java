package com.as.flypiyinsky.theformal.adapter.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/22.
 * ---------------------------
 */
public class Index_Vp_adapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public Index_Vp_adapter(FragmentManager fm) {
        super(fm);
    }

    public void setFragments(List<Fragment> fragments) {
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

}
