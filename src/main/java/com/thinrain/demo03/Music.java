package com.thinrain.demo03;

public class Music {
    private String title;
    private Integer duration;

    public Music() {
        super();
        System.out.println("Music无参构造");
    }

    public Music(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("--在"+ this.toString() + "注入title");
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
        System.out.println("--在"+ this.toString() + "注入duration");
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }
}
