package com.as.flypiyinsky.theformal.adapter.recyclerview;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.graphics.Palette;
import android.widget.ImageView;
import android.widget.TextView;

import com.as.flypiyinsky.R;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type0;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type1;
import com.as.flypiyinsky.theformal.bean.beibao.BeibaoBean_Type2;
import com.as.flypiyinsky.theformal.bean.beibao.MultiBeibaoBean;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2019/1/22.
 * ---------------------------
 */
public class BeibaoAdapter extends BaseMultiItemQuickAdapter<MultiBeibaoBean, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public BeibaoAdapter(List<MultiBeibaoBean> data) {
        super(data);
        addItemType(MultiBeibaoBean.TYPE0, R.layout.item_beibao0);
        addItemType(MultiBeibaoBean.TYPE1, R.layout.item_beibao1);
        addItemType(MultiBeibaoBean.TYPE2, R.layout.item_beibao2);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultiBeibaoBean item) {
        switch (helper.getItemViewType()) {
            case MultiBeibaoBean.TYPE0:
                BeibaoBean_Type0 beibaoBean_type0 = item.getBeibaoBean_type0();
                helper.setText(R.id.tv_item0, beibaoBean_type0.getName());
                Glide.with(mContext)
                        .load(beibaoBean_type0.getImage())
                        .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                        .into((ImageView) helper.getView(R.id.image_item0));

                break;
            case MultiBeibaoBean.TYPE1:
                BeibaoBean_Type1 beibaoBean_type1 = item.getBeibaoBean_type1();
                helper.setText(R.id.tv_item1, beibaoBean_type1.getName());
                Glide.with(mContext)
                        .load(beibaoBean_type1.getImage0())
                        .apply(RequestOptions.bitmapTransform(new RoundedCorners(10)))
                        .into((ImageView) helper.getView(R.id.image0_item1));
                Glide.with(mContext)
                        .load(beibaoBean_type1.getImage1())
                        .apply(RequestOptions.bitmapTransform(new RoundedCorners(10)))
                        .into((ImageView) helper.getView(R.id.image1_item1));

                break;
            case MultiBeibaoBean.TYPE2:
                BeibaoBean_Type2 beibaoBean_type2 = item.getBeibaoBean_type2();
                TextView tv_item2 = helper.getView(R.id.tv_item2);
                tv_item2.setText(beibaoBean_type2.getName());


                Glide.with(mContext)
                        .asBitmap()
                        .load(beibaoBean_type2.getImage())
                        .into(new SimpleTarget<Bitmap>() {
                            @Override
                            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                                ((ImageView) helper.getView(R.id.image_item2)).setImageBitmap(resource);

                                Palette.from(resource)
                                        .generate(palette -> {

                                            tv_item2.setTextColor(palette.getDarkVibrantColor(Color.BLUE));
//
//                                                    // 获取到柔和的明亮的颜色（可传默认值）
//                                                    int lightMutedColor = palette.getLightMutedColor(Color.BLUE);
//                                                    view2.setBackgroundColor(lightMutedColor);
//
//                                                    // 获取到活跃的明亮的颜色（可传默认值）
//                                                    int lightVibrantColor = palette.getLightVibrantColor(Color.BLUE);
//                                                    view3.setBackgroundColor(lightVibrantColor);
//
//                                                    // 获取图片中最活跃的颜色（也可以说整个图片出现最多的颜色）（可传默认值）
//                                                    int vibrantColor = palette.getVibrantColor(Color.BLUE);
//                                                    view4.setBackgroundColor(vibrantColor);

                                            // 获取图片中一个最柔和的颜色（可传默认值）
//                                     palette.getMutedColor(Color.BLUE);

                                        });

                            }
                        });


                break;
            default:
                break;
        }
    }


}
