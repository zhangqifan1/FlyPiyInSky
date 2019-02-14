package com.as.flypiyinsky.theformal.bean.lengfeng;

/**
 * -----------------------------
 * Created by zqf on 2019/2/11.
 * ---------------------------
 */
public class ContentBean {
    private String image;
    private String title;

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

    public ContentBean(String image, String title) {
        this.image = image;
        this.title = title;
    }
}
