package com.example.uliana.moneymanagerapp.transactionsmodel;

public class Transaction {
    private String title;
    private int sum;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Transaction(String title, int sum,String date) {
        this.title = title;
        this.sum = sum;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSum() {
        return Integer.toString(sum);
    }

    public void setSum(int  sum) {
        this.sum = sum;
    }
}
