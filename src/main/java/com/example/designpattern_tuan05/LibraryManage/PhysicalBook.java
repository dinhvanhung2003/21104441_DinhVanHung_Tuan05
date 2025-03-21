package com.example.designpattern_tuan05.LibraryManage;

public class PhysicalBook implements Book {
    private String title;
    private String author;

    public PhysicalBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sách Giấy - Tiêu đề: " + title + ", Tác giả: " + author);
    }
}


