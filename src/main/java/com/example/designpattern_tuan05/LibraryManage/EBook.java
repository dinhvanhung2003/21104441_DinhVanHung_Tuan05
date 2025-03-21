package com.example.designpattern_tuan05.LibraryManage;

public class EBook implements Book {
    private String title;
    private String author;

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sách Điện Tử - Tiêu đề: " + title + ", Tác giả: " + author);
    }
}