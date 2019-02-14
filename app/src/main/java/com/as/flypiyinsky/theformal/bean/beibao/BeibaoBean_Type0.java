package com.as.flypiyinsky.theformal.bean.beibao;

/**
 * -----------------------------
 * Created by zqf on 2019/1/22.
 * ---------------------------
 */
public class BeibaoBean_Type0 {
    private  String image;
    private  String  name;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeibaoBean_Type0(String image, String name) {
        this.image = image;
        this.name = name;
    }
}
