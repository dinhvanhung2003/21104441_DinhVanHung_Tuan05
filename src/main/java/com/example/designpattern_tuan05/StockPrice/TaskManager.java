package com.example.designpattern_tuan05.StockPrice;

public class TaskManager extends Subject {
    private String taskName;
    private String status;

    public TaskManager(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
    }

    public void setStatus(String newStatus) {
        if (!this.status.equals(newStatus)) {
            this.status = newStatus;
            notifyObservers("Công việc '" + taskName + "' thay đổi trạng thái: " + newStatus);
        }
    }
}
