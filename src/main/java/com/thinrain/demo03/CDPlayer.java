package com.thinrain.demo03;

public class CDPlayer {
    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("无参构造CDPlayer" + this.toString());
    }

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println(("有参构造CDPlayer" + this.toString()));
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
        System.out.println("在"+this.toString()+"注入cd");
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void play() {
        cd.play();
    }
}
