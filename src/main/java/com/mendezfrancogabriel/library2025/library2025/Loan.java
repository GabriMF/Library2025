/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mendezfrancogabriel.library2025.library2025;

import java.time.LocalDate;

/**
 *
 * @author alu15d
 */
public class Loan {
    
    private Book loanedBook;
    private User userLoan;
    
    private LocalDate loanDate;
    private LocalDate refundDate;

    
    
    public Loan(Book loanedBook, User userLoan, LocalDate loanDate, LocalDate refundDate) {
        this.loanedBook = loanedBook;
        this.userLoan = userLoan;
        this.loanDate = loanDate;
        this.refundDate = refundDate;
    }

    
    
    public Book getLoanedBook() {
        return loanedBook;
    }

    public User getUserLoan() {
        return userLoan;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getRefundDate() {
        return refundDate;
    }

    
    
    public void setLoanedBook(Book loanedBook) {
        this.loanedBook = loanedBook;
    }

    public void setUserLoan(User userLoan) {
        this.userLoan = userLoan;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public void setRefundDate(LocalDate refundDate) {
        this.refundDate = refundDate;
    }

    
    
    @Override
    public String toString() {
        //return "Loan{" + "loanedBook=" + loanedBook + ", userLoan=" + userLoan + ", loanDate=" + loanDate + ", refundDate=" + refundDate + '}';
        return "\n\n"
            +"_____________________________________________________________________________\n"
            +"------------------------------- Prestamo ------------------------------------\n"
            +"_____________________________________________________________________________\n"
            + loanedBook
            + userLoan
            +"    - Fecha del prestamo: " + loanDate + "\n"
            +"    - Fecha de devolucion: " + refundDate + "\n"
            +"_____________________________________________________________________________\n";
    }
 
}
