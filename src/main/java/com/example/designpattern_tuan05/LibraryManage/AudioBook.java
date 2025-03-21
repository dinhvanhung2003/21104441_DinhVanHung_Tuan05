package com.example.designpattern_tuan05.LibraryManage;

public class AudioBook implements Book {
    private String title;
    private String author;

    public AudioBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sách Nói - Tiêu đề: " + title + ", Tác giả: " + author);
    }
}