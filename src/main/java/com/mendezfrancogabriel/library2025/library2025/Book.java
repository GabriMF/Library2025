/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mendezfrancogabriel.library2025.library2025;

/**
 *
 * @author alu15d
 */
public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int copies;

    
    public Book(String isbn, String title, String author, String genre, int copies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.copies = copies;
    }

    
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getCopies() {
        return copies;
    }

    
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    
    
    @Override
    public String toString() {
        //return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", genre=" + genre + ", copies=" + copies + '}';
        return "\n\n"
                +"_____________________________________________________________________________\n"
                +"                                  libro                                      \n"
                +"_____________________________________________________________________________\n"
                +"    - Titulo: " + title + "\n"
                +"    - Autor: " + author + "\n"
                +"    - Genero: " + genre + "\n"
                +"    - isbn: " + isbn + "\n"
                +"    - Nº de ejemplares: " + copies + "\n"
                +"_____________________________________________________________________________\n";
    }
 
}
