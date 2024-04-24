package com.example.recyclerproject;

public class BlogModel {
    private String title;
    private String subtitle;
    private String content;

    BlogModel(String title,String subtitle,String content){
        this.title=title;
        this.subtitle=subtitle;
        this.content=content;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getContent() {
        return content;
    }
}
