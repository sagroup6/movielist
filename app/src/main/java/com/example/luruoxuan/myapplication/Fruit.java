package com.example.luruoxuan.myapplication;

public class Fruit {
    private String name;
    private int imageId;
    private String info;
    private String desc;
    private String time;
    private int level;
    public Fruit(String name, int imageId, String info,String desc,String time,int level) {
        this.name = name;
        this.imageId = imageId;
        this.info=info;
        this.desc=desc;
        this.time=time;
        this.level=level;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
    public String getInfo(){
        return info;
    }
    public String getDesc(){
    return desc;
    }
    public String getTime(){
        return time;
    }
    public int getLevel() {
        return level;
    }
}
