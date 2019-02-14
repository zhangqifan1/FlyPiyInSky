package com.as.flypiyinsky.theformal.bean.beibao;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * -----------------------------
 * Created by zqf on 2019/1/22.
 * ---------------------------
 */
public class MultiBeibaoBean implements MultiItemEntity {

    public static final int TYPE0=1231;
    public static final int TYPE1=4563;
    public static final int TYPE2=7484;

    private int Type;
    private int  _id;
    @Override
    public int getItemType() {
        return Type;
    }

    /*****************Type0*****************/
    private BeibaoBean_Type0 beibaoBean_type0;

    public MultiBeibaoBean(int id,int type, BeibaoBean_Type0 beibaoBean_type0) {
        _id=id;
        Type = type;
        this.beibaoBean_type0 = beibaoBean_type0;
    }

    /*****************Type1*****************/
    private BeibaoBean_Type1 beibaoBean_type1;

    public MultiBeibaoBean(int  id,int type, BeibaoBean_Type1 beibaoBean_type1) {
        _id=id;
        Type = type;
        this.beibaoBean_type1 = beibaoBean_type1;
    }

    /*****************Type2*****************/
    private BeibaoBean_Type2 beibaoBean_type2;

    public MultiBeibaoBean(int id,int type, BeibaoBean_Type2 beibaoBean_type2) {
        _id=id;
        Type = type;
        this.beibaoBean_type2 = beibaoBean_type2;
    }





    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public BeibaoBean_Type0 getBeibaoBean_type0() {
        return beibaoBean_type0;
    }

    public void setBeibaoBean_type0(BeibaoBean_Type0 beibaoBean_type0) {
        this.beibaoBean_type0 = beibaoBean_type0;
    }

    public BeibaoBean_Type1 getBeibaoBean_type1() {
        return beibaoBean_type1;
    }

    public void setBeibaoBean_type1(BeibaoBean_Type1 beibaoBean_type1) {
        this.beibaoBean_type1 = beibaoBean_type1;
    }

    public BeibaoBean_Type2 getBeibaoBean_type2() {
        return beibaoBean_type2;
    }

    public void setBeibaoBean_type2(BeibaoBean_Type2 beibaoBean_type2) {
        this.beibaoBean_type2 = beibaoBean_type2;
    }


    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }
}
