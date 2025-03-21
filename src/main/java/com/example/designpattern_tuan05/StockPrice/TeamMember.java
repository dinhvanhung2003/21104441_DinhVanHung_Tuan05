package com.example.designpattern_tuan05.StockPrice;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thành viên nhóm " + name + " nhận thông báo: " + message);
    }
}

