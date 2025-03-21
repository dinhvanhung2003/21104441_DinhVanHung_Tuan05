package com.example.designpattern_tuan05.LibraryManage;

public class PhysicalBookFactory extends BookFactory {
    @Override
    public Book createBook(String title, String author) {
        return new PhysicalBook(title, author);
    }
}
