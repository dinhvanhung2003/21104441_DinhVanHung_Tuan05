package com.example.designpattern_tuan05.FolderManage;

public class Test {
    public static void main(String[] args) {
        // Tạo tập tin
        File file1 = new File("document.txt", "Hello, World!");
        File file2 = new File("photo.jpg", "Image Data");
        File file3 = new File("notes.pdf", "Lecture Notes");

        // Tạo thư mục gốc
        Directory root = new Directory("Root");

        // Tạo thư mục con
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");

        // Thêm tập tin vào thư mục con
        documents.add(file1);
        images.add(file2);
        images.add(file3);

        // Thêm thư mục con vào thư mục gốc
        root.add(documents);
        root.add(images);

        // Hiển thị cấu trúc cây
        root.display();
    }
}
