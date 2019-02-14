package com.as.flypiyinsky.theformal.bean.lengfeng;

/**
 * -----------------------------
 * Created by zqf on 2019/2/11.
 * ---------------------------
 */
public class TitleBean {
    private String image,title;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TitleBean(String image, String title) {
        this.image = image;
        this.title = title;
    }
}
