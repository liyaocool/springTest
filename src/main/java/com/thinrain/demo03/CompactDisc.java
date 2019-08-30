package com.thinrain.demo03;

import java.util.Set;

public class CompactDisc {
    private String title; //专辑名
    private String artist; //歌手
    private Set<Music> musicList; //歌曲单


    public CompactDisc() {
        super();
        System.out.println("CompactDisc 无参构造" + this.toString());
    }

    public CompactDisc(String title, String artist, Set<Music> musicList) {
        this.title = title;
        this.artist = artist;
        this.musicList = musicList;
    }

    public void play(){
        System.out.println("播放音乐" + this.toString() + " " + this.title +" by "+ this.artist);
        for (Music music : this.musicList) {
            System.out.println("音乐:" + music.getTitle() +" "+ "时长:" + music.getDuration());
        }
    }
}
