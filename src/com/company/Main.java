package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    Map<String, Book> bookColletion = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public Main(Map<String, Book> collection) {
        this.bookColletion = collection;
    }

    public Main(Map<String, Book> collection, int lengthOfCheckoutPeriod,
                double initialLateFee, double feePerLateDay) {
        this.bookColletion = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    // Getter and Setter

    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookColletion() {
        return this.bookColletion;
    }

    public Book getBook(String bookTitle) {
        return this.getBookColletion().get(bookTitle);

    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    // Setter

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if(book.getIsCheckedOut()) {
//            sorryBookAlreadyCheckedOut(book);
        }
    }

    public void returnBook(String title) {

    }

    public static void main(String[] args) {

    }
}
