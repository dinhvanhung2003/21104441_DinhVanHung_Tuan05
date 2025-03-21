package com.example.designpattern_tuan05.LibraryManage;

public class AudioBookFactory extends BookFactory {
    @Override
    public Book createBook(String title, String author) {
        return new AudioBook(title, author);
    }
}