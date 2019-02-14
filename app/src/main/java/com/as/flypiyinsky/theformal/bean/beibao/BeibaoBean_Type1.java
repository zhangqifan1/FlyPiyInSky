package com.as.flypiyinsky.theformal.bean.beibao;

/**
 * -----------------------------
 * Created by zqf on 2019/1/22.
 * ---------------------------
 */
public class BeibaoBean_Type1 {
    private String image0;
    private String image1;
    private String name;

    public String getImage0() {
        return image0;
    }

    public void setImage0(String image0) {
        this.image0 = image0;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeibaoBean_Type1(String image0, String image1, String name) {
        this.image0 = image0;
        this.image1 = image1;
        this.name = name;
    }
}
