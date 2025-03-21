package com.example.designpattern_tuan05.FolderManage;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        display("", true);
    }

    private void display(String prefix, boolean isLast) {
        // Hiển thị thư mục hiện tại
        System.out.println(prefix + (isLast ? "└── " : "├── ") + "📂 Directory: " + name);

        // Tạo prefix mới cho cấp con
        String newPrefix = prefix + (isLast ? "    " : "│   ");

        for (int i = 0; i < children.size(); i++) {
            FileComponent component = children.get(i);
            boolean lastElement = (i == children.size() - 1);
            if (component instanceof Directory) {
                ((Directory) component).display(newPrefix, lastElement);
            } else {
                System.out.println(newPrefix + (lastElement ? "└── " : "├── ") + "📄 " + component.name);
            }
        }
    }
}


