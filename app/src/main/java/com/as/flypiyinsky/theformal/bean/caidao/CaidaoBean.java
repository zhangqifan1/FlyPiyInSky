package com.as.flypiyinsky.theformal.bean.caidao;

/**
 * -----------------------------
 * Created by zqf on 2019/1/23.
 * ---------------------------
 */
public class CaidaoBean {

    private String image;
    private String title;
    private String content;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CaidaoBean(String image, String title, String content) {
        this.image = image;
        this.title = title;
        this.content = content;
    }
}
