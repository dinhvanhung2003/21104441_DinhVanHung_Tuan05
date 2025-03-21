package com.example.designpattern_tuan05.LibraryManage.Decorator;

public class SpecialEditionBorrow implements Borrowable {
    private Borrowable borrowable;

    public SpecialEditionBorrow(Borrowable borrowable) {
        this.borrowable = borrowable;
    }

    @Override
    public void borrow() {
        borrowable.borrow();
        System.out.println("Bạn đã mượn phiên bản đặc biệt của cuốn sách.");
    }
}