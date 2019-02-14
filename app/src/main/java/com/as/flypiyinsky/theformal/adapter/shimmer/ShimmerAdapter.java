package com.as.flypiyinsky.theformal.adapter.shimmer;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/24.
 * ---------------------------
 */
public class ShimmerAdapter extends BaseQuickAdapter<Integer,BaseViewHolder> {


    public ShimmerAdapter(int layoutResId, @Nullable List<Integer> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Integer item) {
    }
}
