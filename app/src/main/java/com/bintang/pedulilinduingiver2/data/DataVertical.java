package com.bintang.pedulilinduingiver2.data;

public class DataVertical {

    private String title,desc;
    private int img;

    public DataVertical(String title, String desc, int img) {
        this.title = title;
        this.desc = desc;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
