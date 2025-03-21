package com.example.designpattern_tuan05.StockPrice;

public class Test {
    public static void main(String[] args) {
        // Test hệ thống theo dõi cổ phiếu
        System.out.println("==== TEST HỆ THỐNG CỔ PHIẾU ====");
        Stock appleStock = new Stock("Apple", 150.0);
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Alice");

        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);

        appleStock.setPrice(155.0);
        appleStock.setPrice(160.0);

        // Test hệ thống theo dõi công việc
        System.out.println("\n==== TEST HỆ THỐNG CÔNG VIỆC ====");
        TaskManager task = new TaskManager("Phát triển Backend", "To Do");
        TeamMember dev1 = new TeamMember("David");
        TeamMember dev2 = new TeamMember("Emma");

        task.registerObserver(dev1);
        task.registerObserver(dev2);

        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
