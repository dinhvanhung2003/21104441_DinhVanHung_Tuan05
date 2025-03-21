package com.example.designpattern_tuan05.LibraryManage.Decorator;

public class BasicBorrow implements Borrowable {
    @Override
    public void borrow() {
        System.out.println("Sách đã được mượn.");
    }
}
