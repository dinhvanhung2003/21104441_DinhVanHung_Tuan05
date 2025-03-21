package com.example.designpattern_tuan05.LibraryManage.Decorator;

public class ExtendedBorrow implements Borrowable {
    private Borrowable borrowable;

    public ExtendedBorrow(Borrowable borrowable) {
        this.borrowable = borrowable;
    }

    @Override
    public void borrow() {
        borrowable.borrow();
        System.out.println("Thời gian mượn đã được gia hạn.");
    }
}


