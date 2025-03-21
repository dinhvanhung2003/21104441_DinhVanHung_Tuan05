package com.example.designpattern_tuan05.LibraryManage.Observer;

public class Librarian implements Observer {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Nhân viên thư viện " + name + " nhận thông báo: " + message);
    }
}
