package com.ktck124.lop124LTDD04.nhom08.model;

import java.util.List;

public class Section {
    private String title;
    private List<Book> itemList;

    public Section(String title, List<Book> itemList) {
        this.title = title;
        this.itemList = itemList;
    }

    public String getTitle() {
        return title;
    }

    public List<Book> getItemList() {
        return itemList;
    }
}
