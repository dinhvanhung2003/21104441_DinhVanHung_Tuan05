package com.example.designpattern_tuan05.StockPrice;

public class Stock extends Subject {
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers("Cổ phiếu " + stockName + " thay đổi giá: " + newPrice);
        }
    }
}
