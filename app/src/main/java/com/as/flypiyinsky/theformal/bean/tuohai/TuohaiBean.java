package com.as.flypiyinsky.theformal.bean.tuohai;

/**
 * -----------------------------
 * Created by zqf on 2019/2/14.
 * ---------------------------
 */
public class TuohaiBean {

    private int id;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TuohaiBean(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
