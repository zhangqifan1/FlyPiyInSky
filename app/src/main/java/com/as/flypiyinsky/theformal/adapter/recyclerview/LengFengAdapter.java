package com.as.flypiyinsky.theformal.adapter.recyclerview;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.theformal.bean.lengfeng.ContentBean;
import com.as.flypiyinsky.theformal.bean.lengfeng.LengfengBean;
import com.as.flypiyinsky.theformal.bean.lengfeng.TitleBean;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.luliang.shapeutils.shape.DevShape;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/2/11.
 * ---------------------------
 */
public class LengFengAdapter extends BaseMultiItemQuickAdapter<LengfengBean,BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public LengFengAdapter(List<LengfengBean> data) {
        super(data);
        addItemType(LengfengBean.Type0, R.layout.lengfeng_title);
        addItemType(LengfengBean.Type1, R.layout.lengfeng_content);
    }

    @Override
    protected void convert(BaseViewHolder helper, LengfengBean item) {
        switch (item.getItemType()){
                    case  LengfengBean.Type0:
                        helper.itemView.setTag(true);

                        TitleBean titleBean = item.getTitleBean();
                        ImageView image_title = helper.getView(R.id.image_title);
                        TextView text_title = helper.getView(R.id.text_title);

                        text_title.setText(titleBean.getTitle());
                        Glide.with(mContext)
                                .load(titleBean.getImage())
                                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                                .into(image_title);
                        DevShape.getInstance(DevShape.RECTANGLE)
                            .line(2, R.color.shapeline)
                            .radius(8)
                            .into(text_title);

                        break;
                    case  LengfengBean.Type1:
                        helper.itemView.setTag(false);

                        ContentBean contentBean = item.getContentBean();
                        ImageView image_content = helper.getView(R.id.image_content);
                        TextView text_content = helper.getView(R.id.text_content);

                        text_content.setText(contentBean.getTitle());
                        Glide.with(mContext)
                                .load(contentBean.getImage())
                                .apply(RequestOptions.bitmapTransform(new RoundedCorners(8)))
                                .into(image_content);
                        DevShape.getInstance(DevShape.RECTANGLE)
                                .line(2, R.color.shapeline)
                                .radius(8)
                                .into(text_content);

                        break;
                    default:
                        break;
                }
    }

    @Override
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateDefViewHolder(parent, viewType);
    }
}
