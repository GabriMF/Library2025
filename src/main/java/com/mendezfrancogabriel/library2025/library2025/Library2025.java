/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mendezfrancogabriel.library2025.library2025;

import java.util.ArrayList;

/**
 *
 * @author alu15d
 */
public class Library2025 {

    private ArrayList <Book> books;
    private ArrayList <User> users;
    private ArrayList <Loan> loans;

    public Library2025() {
        this.books = new ArrayList();
        this.users = new ArrayList();
        this.loans = new ArrayList();
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Library2025 b = new Library2025();
        b.dataLoader();  
        b.menu();
    }
    
    private void dataLoader(){
     
        
        
    }
    
    private void menu(){
        
    }
    
}
