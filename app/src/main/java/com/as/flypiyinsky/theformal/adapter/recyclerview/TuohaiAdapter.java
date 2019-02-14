package com.as.flypiyinsky.theformal.adapter.recyclerview;

import android.support.annotation.Nullable;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.theformal.bean.tuohai.TuohaiBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.luliang.shapeutils.shape.DevShape;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/2/13.
 * ---------------------------
 */
public class TuohaiAdapter extends BaseQuickAdapter<TuohaiBean,BaseViewHolder> {


    public TuohaiAdapter(int layoutResId, @Nullable List<TuohaiBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TuohaiBean item) {
        DevShape.getInstance(DevShape.RECTANGLE)
                .radius(8)
                .solid(R.color.white)
                .into(helper.getView(R.id.tv_tuohai));
        DevShape.getInstance(DevShape.RECTANGLE)
                .radius(8)
                .solid(R.color.white)
                .into(helper.getView(R.id.tvtitle_tuohai));
        helper.setText(R.id.tvtitle_tuohai, item.getId()+"");
        helper.setText(R.id.tv_tuohai, item.getContent());
    }

}
