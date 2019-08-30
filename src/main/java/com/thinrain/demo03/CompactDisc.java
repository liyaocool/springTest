package com.thinrain.demo03;



public class CompactDisc {
    private String title; //专辑名
    private String artist; //歌手
    private Music[] musicList; //歌曲单


    public CompactDisc() {
        super();
        System.out.println("CompactDisc 无参构造" + this.toString());
    }

    public CompactDisc(String title, String artist, Music[] musicList) {
        this.title = title;
        this.artist = artist;
        this.musicList = musicList;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("在" + this.toString() +"注入title");
    }

    public void setArtist(String artist) {
        this.artist = artist;
        System.out.println("在" + this.toString() +"注入artist");
    }

    public void setMusicList(Music[] musicList) {
        this.musicList = musicList;
        System.out.println("在" + this.toString() +"注入musicList");
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Music[] getMusicList() {
        return musicList;
    }

    public void play(){
        System.out.println("播放音乐" + this.toString() + " " + this.title +" by "+ this.artist);
        for (Music music : this.musicList) {
            System.out.println("音乐:" + music.getTitle() +" "+ "时长:" + music.getDuration());
        }

    }
}
