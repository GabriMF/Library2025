/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mendezfrancogabriel.library2025.library2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author alu15d
 */
public class Library2025 {

    private ArrayList <Book> books;
    private ArrayList <User> users;
    private ArrayList <Loan> loans;
    private ArrayList <Loan> LoanHist;

    public Library2025() {
        this.books = new ArrayList();
        this.users = new ArrayList();
        this.loans = new ArrayList();
        this.LoanHist = new ArrayList();
    }
    
    public static void main(String[] args) {
        
        Library2025 b = new Library2025();
        b.dataLoader();  
        b.mainMenu();
    }
    
    /*
    ------------------------------------------------ Menus --------------------------------
    */
    
    private void mainMenu(){
        Scanner sc=new Scanner (System.in);
        int option;
        do{        
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Principal
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para consultas sobre libros.
                    - 2 Para consultas sobre usuarios.
                    - 3 Para consultas sobre prestamos.

                    - 0 Para cerrar la aplicacion.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    bookMenu();
                    break;
                }    
                case 2:{
                    userMenu();
                    break;
                } 
                case 3:{
                    loanMenu();
                    break;
                }
                case 0:{
                    System.out.println("\n\n                            Gracias por probar mi aplicacion!                                    \n"
                        + "_________________________________________________________________________________________________\n"
                        + "_________________________________________________________________________________________________\n\n"
                        + "               #   #   #   ##### #####   #       #     #   # #####  ####  ###   #                \n"
                        + "               #   #  # #  #       #    # #      #     #   # #     #     #   #  #                \n"
                        + "               ##### #   # #####   #   #   #     #     #   # ####  #  ## #   #  #                \n"
                        + "               #   # #####     #   #   #####     #     #   # #     #   # #   #                   \n"
                        + "               #   # #   # #####   #   #   #     #####  ###  #####  ###   ###   #                \n"
                        + "_________________________________________________________________________________________________\n"
                        + "_________________________________________________________________________________________________\n\n");
                    break;
                }
                default :{
                    System.out.println("Por favor, introduzca una opcion valida");   
                }
                
            }
        }while (option != 0);
    }
    
    private void bookMenu() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Libros
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un libro.
                    - 2 Para eliminar un libro.
                    - 3 Para modificar un libro.
                    - 4 Para consultar el listado de ejemplares.

                    - 0 Para volver al menu principal.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    newBook();
                    break;
                }    
                case 2:{
                    deleteBook();
                    break;
                } 
                case 3:{
                    modifyBook();
                    break;
                } 
                case 4:{
                    bookList();
                    break;
                } 
            }
        }while (option != 0);
    }

    private void userMenu() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{
            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Usuarios
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un usuario.
                    - 2 Para eliminar un usuario.
                    - 3 Para modificar un usuario.
                    - 4 Para consultar el listado de usuarios.

                    - 0 Para volver al menu principal.
                                                                                                                        """);
            option=sc.nextInt();
            switch (option){
                case 1:{
                    newUser();
                    break;
                }    
                case 2:{
                    deleteUser();
                    break;
                } 
                case 3:{
                    modifyUser();
                    break;
                } 
                case 4:{
                    userList();
                    break;
                } 
            }
        }while (option != 0);
    }

    private void loanMenu() {
        Scanner sc=new Scanner (System.in);
        int option;
        do{

            System.out.println("""
            __________________________________________________________________________________________________________

                                                           Menu Prestamos
            __________________________________________________________________________________________________________

            Por favor, pulsa alguna de las siguientes opciones:

                    - 1 Para agregar un prestamo.
                    - 2 Para devolver un prestamo.
                    - 3 Para prorrogar un prestamo.
                    - 4 Para consultar el listado de prestamos.

                    - 0 Para volver al menu principal.
                                                                                                                        """);            
            option=sc.nextInt();
            switch (option){
                case 1:{
                    newLoan();
                    break;
                }    
                case 2:{
                    refundLoan();
                    break;
                } 
                case 3:{
                    extendLoan();
                    break;
                } 
                case 4:{
                    loanList();
                    break;
                } 
            }
        }while (option != 0);
    }
    
    
    /*
    ------------------------------------------------ Gestion Libros --------------------------------
    */
    
    private void newBook() {
    }

    private void deleteBook() {
    }

    private void modifyBook() {
    }

    private void bookList() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    
    
    /*
    ------------------------------------------------ Gestion Usuarios --------------------------------
    */
    
    private void newUser() {
    }

    private void deleteUser() {
    }

    private void modifyUser() {
    }

    private void userList() {
        for (User u : users){
            System.out.println(u);
        }
    }
    
    
    
    /*
    ------------------------------------------------ Gestion Prestamos --------------------------------
    */
    
    private void newLoan() {
        System.out.println("Identificación del usuario:");
        int userPosition = searchDni(requestDni());
        if (userPosition==-1){
            System.out.println("No es aún usuario de la biblioteca");
        }else{
            System.out.println("Identificación del libro:"); 
            int posLibro=searchIsbn(requestIsbn());
            if (posLibro==-1){
                System.out.println("El ISBN pertenece a un libro inexistente");
            } else if (books.get(posLibro).getCopies()>0){
                LocalDate hoy=LocalDate.now();
                loans.add(new Loan(books.get(posLibro),users.get(userPosition),hoy,hoy.plusDays(15)));
                books.get(posLibro).setCopies(books.get(posLibro).getCopies()-1);
                }else{
                    System.out.println("No quedan unidades disponibles del libro");
                }
        }
    }

    private void loanList() {
        for (Loan l : loans) {
            System.out.println(l);  
        }
    }
    
    private void extendLoan(){
        System.out.println("Datos Prorroga: ");
        
        String dni = requestDni();
        String isbn = requestIsbn();
        int pos = searchLoan(dni,isbn);
        
        if(pos==-1){
            System.out.println("No hat prestamos con losdatos proporcionados.");
        }else{
            loans.get(pos).setRefundDate(loans.get(pos).getRefundDate().plusDays(15));
        }
    }
    
    private void refundLoan(){
        System.out.println("Datos devolucion:");
        
        String isbnBook = requestIsbn();
        int pos = searchLoan(requestDni(), isbnBook);
        
        if (pos==-1){
            System.out.println("No hay prestamos con los datos proporcionados");
        }else{
            loans.get(pos).setRefundDate(LocalDate.now());
            books.get(searchIsbn(isbnBook)).setCopies(books.get(searchIsbn(isbnBook)).getCopies()+1);
        }
    }
    
    
    /*
    ------------------------------------------------ Metodos auxiliares --------------------------------
    */
        /**
     * Método para solicitar por teclado el DNI de un usuario. pdte de validación
     * @return (String) dni del usuario tecleado
     */
    public String requestDni(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el dni del usuario:");
        String dni=sc.next();
        return dni;
    }
    /**
     * Método para solicitar por teclado el ISBN de un libro. pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String requestIsbn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Teclea el isbn del libro:");
        String isbn=sc.next();
        return isbn;
    }
    
    /**
     * Método para buscar un dni en la colección usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int searchDni(String dni){
        int pos=-1;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getDni().equals(dni)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
     /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro el Arraylist, valor -1 si no se encuentra
     */
    public int searchIsbn(String isbn){
        int pos=-1;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;       
    }
    
    public int searchLoan(String dni, String isbn){
        int pos = -1;
        for(int i=0; i<loans.size(); i++){
            if(loans.get(i).getUserLoan().getDni().equals(dni) && loans.get(i).getLoanedBook().getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;
    }
    
    public void dataLoader(){
        books.add(new Book("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        books.add(new Book("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        books.add(new Book("1-33","El Médico","N. Gordon","Aventuras",4)); 
        books.add(new Book("1-44","Chamán","N. Gordon","Aventuras",3)); 
        books.add(new Book("1-55","Momo","M. Ende","Aventuras",2)); 
        books.add(new Book("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        books.add(new Book("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        books.add(new Book("1-88","El último barco","D.Villar","Novela Negra",3)); 
        books.add(new Book("1-99","Ojos de agua","D.Villar","Novela Negra",0)); 

        users.add(new User("11","Ana","ana@email.com","621111111")); 
        users.add(new User("22","David","david@email.com","622222222")); 
        users.add(new User("33","Bea","bea@email.com","623333333")); 
        users.add(new User("44","Lucas","lucas@email.com","624444444")); 
        users.add(new User("55","Carlota","carlota@email.com","625555555")); 
        users.add(new User("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        loans.add(new Loan(books.get(2),users.get(0), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(8),users.get(2), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(5),users.get(4), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(5),users.get(0), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(6),users.get(2), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(2),users.get(1), hoy,hoy.plusDays(15)));
    /*
        for (Book b:books) {
            System.out.println(b);
        }
        System.out.println("");
        for (User u:users) {
            System.out.println(u);
        }
        System.out.println("");
        for (Loan l:loans) {
            System.out.println(l);
        }
    */
    }
}
