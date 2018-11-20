package com.example.tasktest;

public class TodayTask {

    String description = "任务描述";
    String bonus = "任务奖励";
    int senderImg = R.drawable.list_image;

    public int getSenderImg() {
        return senderImg;
    }

    public void setSenderImg(int senderImg) {
        this.senderImg = senderImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

}
