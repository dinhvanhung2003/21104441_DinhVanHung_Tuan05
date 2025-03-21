package com.example.designpattern_tuan05.LibraryManage;

import java.util.List;

public class BookSearchContext {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Book> searchBooks(List<Book> books, String query) {
        return strategy.search(books, query);
    }
}

