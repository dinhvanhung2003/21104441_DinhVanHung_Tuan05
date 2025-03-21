package com.example.designpattern_tuan05.LibraryManage.Observer;

public class LibraryUser implements Observer {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Người dùng " + name + " nhận thông báo: " + message);
    }
}
