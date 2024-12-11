/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mendezfrancogabriel.biblioteca2025.biblioteca2025;

import java.util.ArrayList;

/**
 *
 * @author alu15d
 */
public class Biblioteca2025 {

    private ArrayList <Book> books;
    private ArrayList <User> users;
    private ArrayList <Loan> loans;

    public Biblioteca2025() {
        this.books = new ArrayList();
        this.users = new ArrayList();
        this.loans = new ArrayList();
    }
    
    
    
    
    public static void main(String[] args) {
        
        Biblioteca2025 b = new Biblioteca2025();
        b.dataLoader();  
        b.menu();
    }
    
    private void dataLoader(){
     
        
        
    }
    
    private void menu(){
        
    }
    
}
