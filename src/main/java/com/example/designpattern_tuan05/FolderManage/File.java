package com.example.designpattern_tuan05.FolderManage;

public class File extends FileComponent {
    private String data; // Nội dung tập tin

    public File(String name, String data) {
        super(name);
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("📄 File: " + name + " | Data: " + data);
    }
}
