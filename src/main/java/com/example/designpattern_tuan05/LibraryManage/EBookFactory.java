package com.example.designpattern_tuan05.LibraryManage;

public class EBookFactory extends BookFactory {
    @Override
    public Book createBook(String title, String author) {
        return new EBook(title, author);
    }
}