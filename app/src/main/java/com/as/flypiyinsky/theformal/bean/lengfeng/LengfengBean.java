package com.as.flypiyinsky.theformal.bean.lengfeng;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * -----------------------------
 * Created by zqf on 2019/2/11.
 * ---------------------------
 */
public class LengfengBean implements MultiItemEntity {
    public static  final int Type0=23212;
    public static  final int Type1=12313;

    private int Type;

    @Override
    public int getItemType() {
        return Type;
    }

    private TitleBean titleBean;

    public LengfengBean(int type, TitleBean titleBean) {
        Type = type;
        this.titleBean = titleBean;
    }

    public static int getType0() {
        return Type0;
    }

    public static int getType1() {
        return Type1;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public TitleBean getTitleBean() {
        return titleBean;
    }

    public void setTitleBean(TitleBean titleBean) {
        this.titleBean = titleBean;
    }









    /*********************2222222222***************************/
    private ContentBean contentBean;


    public ContentBean getContentBean() {
        return contentBean;
    }

    public void setContentBean(ContentBean contentBean) {
        this.contentBean = contentBean;
    }

    public LengfengBean(int type, ContentBean contentBean) {
        Type = type;
        this.contentBean = contentBean;
    }
}
