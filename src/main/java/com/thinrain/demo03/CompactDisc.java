package com.thinrain.demo03;

public class CompactDisc {
    private String title;
    private String artist;


    public CompactDisc() {
        super();
        System.out.println("CompactDisc 无参构造" + this.toString());
    }

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("播放音乐" + this.toString() + " " + this.title +" by "+ this.artist);
    }
}
