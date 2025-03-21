package com.example.designpattern_tuan05.LibraryManage.Test;

import com.example.designpattern_tuan05.LibraryManage.*;
import com.example.designpattern_tuan05.LibraryManage.Decorator.BasicBorrow;
import com.example.designpattern_tuan05.LibraryManage.Decorator.Borrowable;
import com.example.designpattern_tuan05.LibraryManage.Decorator.ExtendedBorrow;
import com.example.designpattern_tuan05.LibraryManage.Decorator.SpecialEditionBorrow;
import com.example.designpattern_tuan05.LibraryManage.Observer.Librarian;
import com.example.designpattern_tuan05.LibraryManage.Observer.LibraryNotifier;
import com.example.designpattern_tuan05.LibraryManage.Observer.LibraryUser;

import java.util.*;

public class LibrarySystemTest {
    public static void main(String[] args) {
        // Test Singleton Pattern - Thư viện duy nhất
        System.out.println("==== TEST SINGLETON PATTERN ====");
        Library library1 = Library.getInstance();
        Library library2 = Library.getInstance();
        System.out.println("Library instance check: " + (library1 == library2));

        // Test Factory Method Pattern - Tạo các loại sách
        System.out.println("\n==== TEST FACTORY METHOD PATTERN ====");
        BookFactory physicalBookFactory = new PhysicalBookFactory();
        BookFactory eBookFactory = new EBookFactory();
        BookFactory audioBookFactory = new AudioBookFactory();

        Book book1 = physicalBookFactory.createBook("Design Patterns", "GoF");
        Book book2 = eBookFactory.createBook("Clean Code", "Robert C. Martin");
        Book book3 = audioBookFactory.createBook("Refactoring", "Martin Fowler");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Thêm sách vào thư viện
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);

        // Test Strategy Pattern - Tìm kiếm sách
        System.out.println("\n==== TEST STRATEGY PATTERN ====");
        BookSearchContext searchContext = new BookSearchContext();

        searchContext.setStrategy(new SearchByTitle());
        List<Book> searchResults = searchContext.searchBooks(library1.getBooks(), "Design Patterns");
        System.out.println("Tìm theo tiêu đề: " + searchResults.size() + " kết quả.");

        searchContext.setStrategy(new SearchByAuthor());
        searchResults = searchContext.searchBooks(library1.getBooks(), "Robert C. Martin");
        System.out.println("Tìm theo tác giả: " + searchResults.size() + " kết quả.");

        // Test Observer Pattern - Thông báo khi có sách mới
        System.out.println("\n==== TEST OBSERVER PATTERN ====");
        LibraryNotifier notifier = new LibraryNotifier();
        Librarian librarian = new Librarian("John");
        LibraryUser user = new LibraryUser("Alice");

        notifier.addObserver(librarian);
        notifier.addObserver(user);

        notifier.notifyObservers("Thư viện vừa cập nhật sách mới!");

        // Test Decorator Pattern - Mở rộng tính năng mượn sách
        System.out.println("\n==== TEST DECORATOR PATTERN ====");
        Borrowable basicBorrow = new BasicBorrow();
        Borrowable extendedBorrow = new ExtendedBorrow(basicBorrow);
        Borrowable specialEditionBorrow = new SpecialEditionBorrow(basicBorrow);

        System.out.println("Người dùng mượn sách thường:");
        basicBorrow.borrow();

        System.out.println("\nNgười dùng gia hạn thời gian mượn:");
        extendedBorrow.borrow();

        System.out.println("\nNgười dùng mượn phiên bản đặc biệt:");
        specialEditionBorrow.borrow();
    }
}
