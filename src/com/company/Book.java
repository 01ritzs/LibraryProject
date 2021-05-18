package com.company;

public class Book {

    private String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not the book is checked out
    int dayCheckedOut = -1;

    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    //Getters
    public String getTitle() {
        return this.title;
    }
    public int getISBN() {
        return this.ISBN;
    }
    public int getPageCount() {
        return this.pageCount;
    }
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // Setters

    public void isCheckOut(boolean newisCheckedOut, int currentDayCheckout) {
        this.isCheckedOut = newisCheckedOut;
        setDayCheckedOut(currentDayCheckout);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
