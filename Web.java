package com.example.myapplication3;

public class Web {
    private String title;
    private String des;
    private String url;

    public Web(){}
    public Web(String url, String title, String des){
        this.title = title;
        this.des = des;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
