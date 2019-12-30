package com.example.sojunrecycleredview;

public class regular_item
{
    private String leeyujin;
    private String gg;
    private  String date;

    public regular_item(String leeyujin, String gg, String date) {
        this.leeyujin = leeyujin;
        this.gg = gg;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getLeeyujin() {
        return leeyujin;
    }

    public void setLeeyujin(String leeyujin) {
        this.leeyujin = leeyujin;
    }
}
