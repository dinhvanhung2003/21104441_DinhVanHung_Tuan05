package com.example.designpattern_tuan05.LibraryManage;

import java.util.List;
import java.util.stream.Collectors;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String query);
}

class SearchByGenre implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream().filter(b -> b.toString().contains(query)).collect(Collectors.toList());
    }
}
