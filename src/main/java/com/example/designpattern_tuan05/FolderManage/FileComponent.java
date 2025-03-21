package com.example.designpattern_tuan05.FolderManage;

import java.util.List;

public abstract class FileComponent {
    protected String name;

    public FileComponent(String name) {
        this.name = name;
    }

    public abstract void display(); // Phương thức chung để hiển thị thông tin
}

