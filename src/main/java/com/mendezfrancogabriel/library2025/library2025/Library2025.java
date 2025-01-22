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
    private ArrayList <Loan> loansHist;

    public Library2025() {
        this.books = new ArrayList();
        this.users = new ArrayList();
        this.loans = new ArrayList();
        this.loansHist = new ArrayList();
    }
    
    public static void main(String[] args) {
        
        Library2025 b = new Library2025();
        b.dataLoader();
        b.outdatedLoan();
        b.mainMenu();
    }
    
    /*
    -------------------------------- Menus --------------------------------
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
                    - 4 Para consultar el listado de prestamos general.
                    - 5 Para consultar el listado de prestamos de un usuario.
                    - 6 Para consultar el listado de prestamos de un libro.
                    - 7 Para consultar el libro mas leido.
                    - 8 Para consultar el usuario mas lector.

                    - 0 Para volver al menu principal.
                                                                                                                        """);            
            option=sc.nextInt();
            switch (option){
                case 1:{
                    newLoan();
                    break;
                }    
                case 2:{
                    returnLoan();
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
                case 5:{
                    
                    break;
                }
                case 6:{
                    bookListLoaned();
                    break;
                }
                case 7:{
                    mostReadBook();
                    break;
                }
                case 8:{
                    mostReaderUser();
                    break;
                }
                default:{
                    System.out.println("Introduzca una opcion valida.");
                }
            }
        }while (option != 0);
    }
    
    
    /*
    -------------------------------- Gestion Libros --------------------------------
    */
    
    private void newBook() {
        String isbn, title, author, genre;
        int copies;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Nuevo Libro
                           __________________________________________________________________________________________________________""");
        
        System.out.println("Titulo: ");
        title = sc.nextLine();
        
        System.out.println("Autor: ");
        author = sc.nextLine();
             
        System.out.println("Genero: ");
        genre = sc.nextLine();
        
        System.out.println("ISBN: ");
        isbn = sc.nextLine();
        
        System.out.println("Ejemplares: ");
        copies = sc.nextInt();
        
        Book newBook = new Book(isbn, title, author, genre, copies);
        books.add(newBook);
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "El libro " + newBook.getTitle() + " se ha agregado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void deleteBook() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                        Eliminar Libro
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el ISBN del libro que desea eliminar.");

        String isbn = requestIsbn();
        int bookPosition = searchIsbn(isbn);
        
        if (bookPosition == -1){
            System.out.println("Por favor, introduca un libro registrado.");
        }else{
            String deletedBook = books.get(bookPosition).getTitle();
            books.remove(bookPosition);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "El libro " + deletedBook + " ha sido eliminado satisfactoriamente.\n"
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        } 
    }

    private void modifyBook() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Editar Libro
                           __________________________________________________________________________________________________________""");
        
        Scanner sc=new Scanner (System.in);
        String isbn;
        int bookPosition = -1;
        boolean bookExist = false;
        do {
            System.out.println("Escribe el ISBN del libro a editar.");
            
            isbn = requestIsbn();
            bookPosition = searchIsbn(isbn);
            
            if(bookPosition == -1){
                System.out.println("Por favor, introduzca un libro registrado.");
            }
            if (bookPosition!=-1){
                bookExist = true;
            }
        } while (bookExist = false);

        System.out.println("Introduzca cuandos libros quiere agregar o restar al total de ejemplares:");
        int copiesVariation = sc.nextInt();
        int newCopiesAmount = books.get(bookPosition).getCopies() + copiesVariation;
        books.get(bookPosition).setCopies(newCopiesAmount);
 
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "                 El libro "+ books.get(bookPosition).getTitle() + ", con ISBN " + books.get(bookPosition).getIsbn() +" se ha modificado a correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void bookList() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    
    
    /*
    -------------------------------- Gestion Usuarios --------------------------------
    */
    
    private void newUser() {
        String dni, name, email, phoneNumber;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Nuevo Usuario
                           __________________________________________________________________________________________________________""");
        
        System.out.println("Nombre: ");
        name = sc.nextLine();
        
        System.out.println("Telefono: ");
        phoneNumber = sc.nextLine();
        
        System.out.println("Email: ");
        email = sc.nextLine();
        
        System.out.println("DNI: ");
        dni = sc.nextLine();
        
        User newUser = new User(dni, name, email, phoneNumber);
        users.add(newUser);
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "El usuario " + newUser.getName()+ " se ha agregado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void deleteUser() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                        Eliminar Usuario
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca el dni del usuario a eliminar.");
          
        String dni = requestDni();       
        int userPosition = searchDni(dni);
        
        if(userPosition == -1){
            System.out.println("El DNI introducido no esta registrado.\n"
                    + "Por favor, introduzca el dni de un usuario registrado.");
        }else{
            String deletedUserName = users.get(userPosition).getName();
            String deletedUserDni = users.get(userPosition).getDni();
            
            users.remove(userPosition);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "El usuario " + deletedUserName + " con DNI "+ deletedUserDni +" ha sido eliminado satisfactoriamente.\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }
    }

    private void modifyUser() {
        
        System.out.println("""
                           __________________________________________________________________________________________________________
                           
                                                                         Editar Usuario
                           __________________________________________________________________________________________________________""");
        
        Scanner sc = new Scanner (System.in);
        String userDni;
        int userPosition = -1;
        boolean userExist = false;
        
        do {
            System.out.println("Escribe el DNI del usuario a editar.");

            userDni = requestDni();
            userPosition = searchDni(userDni);
            
            if(userPosition==-1){
                System.out.println("Por favor, introduzca un DNI de un usuario registrado.");
            }
            if (userPosition!=-1){
                userExist = true;
            }
        } while (userExist = false);
        
        System.out.println("""
                           Por favor, indicque el valor a modificar.
                                - 1. Nombre.
                                - 2. Telefono.
                                - 3. Correo Electronico.""");
        int option;
        option = sc.nextInt();
        sc.nextLine();
        switch(option){
            case 1 :{
                System.out.println("Introduzca el nuevo nombre:");
                String newName = new String(sc.nextLine());
                users.get(userPosition).setName(newName);
                break;
            }
            case 2 :{
                System.out.println("Introduzca el nuevo telefono:");
                String newPhoneNumber = new String(sc.nextLine());
                users.get(userPosition).setPhoneNumber(newPhoneNumber);
                break;
            }
            case 3 :{
                System.out.println("Introduzca el nuevo correo electronico:");
                String newEmail = new String(sc.nextLine());
                users.get(userPosition).setEmail(newEmail);
                break;
            }
            default:{
                System.out.println("Introduzca una opcion valida.");
            }
        } 
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
            + "                 El usuario "+ users.get(userPosition).getName() +" se ha modificado correctamente.\n"
            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    }

    private void userList() {
        for (User u : users){
            System.out.println(u);
        }
    }
    
    
    
    /*
    -------------------------------- Gestion Prestamos --------------------------------
    */
    
    private void newLoan() {
        
        System.out.println("Identificación del usuario:");
        String dni = requestDni();
        int userPosition = searchDni(dni);
        
        if (userPosition==-1){
            System.out.println("No es aún usuario de la biblioteca");
            
        }else{
            System.out.println("Identificación del libro:"); 
            String isbn = requestIsbn();
            int bookPosition = searchIsbn(isbn);
            
            if (bookPosition==-1){
                System.out.println("El ISBN pertenece a un libro inexistente");
                
            } else if (books.get(bookPosition).getCopies()>0){
                
                if((searchLoan(dni, isbn)) == -1){
                    LocalDate hoy=LocalDate.now();
                
                    loans.add(new Loan(books.get(bookPosition),users.get(userPosition),hoy,hoy.plusDays(15)));
                
                    books.get(bookPosition).setCopies(books.get(bookPosition).getCopies()-1);
                    
                }else{
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                                + "El usuario " + users.get(userPosition).getName()+" ya tiene "
                                + books.get(bookPosition).getTitle()+" prestado.\n"
                                        + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
                }
    
            }else{
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                            + "No quedan unidades disponibles del libro\n"
                            + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
            }
        }
    }
    
    private void returnLoan(){
        System.out.println("Datos para la devolucion del préstamo:");
        
        System.out.println("Introduzca el ISBN del libro, por favor.");
        String isbnBook = requestIsbn();
        
        int pos = searchLoan(requestDni(), isbnBook);
        
        if (pos==-1){
            System.out.println("No hay prestamos con los datos proporcionados");
            
        }else{
            
            loans.get(pos).setReturnDate(LocalDate.now());
            books.get(searchIsbn(isbnBook)).setCopies(books.get(searchIsbn(isbnBook)).getCopies()+1);
            loansHist.add(loans.get(pos));
            loans.remove(pos);
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "Devolucion registrada correctamente."
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }
    }
    
    private void extendLoan(){
        System.out.println("Datos para la prorroga del préstamo.");
        
        System.out.println("Introduzca el DNI del usuario.");
        String dni = requestDni();
        System.out.println("Introduzca el ISBN del libro.");
        String isbn = requestIsbn();
        
        int pos = searchLoan(dni,isbn);
        
        if(pos==-1){
            System.out.println("No hay prestamos con los datos proporcionados.");
        }else{
            loans.get(pos).setReturnDate(loans.get(pos).getReturnDate().plusDays(15));
            loans.get(pos).setLoanDate(LocalDate.now());
            
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                    + "Prorroga registrada correctamente."
                    + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
        }
    }

    private void loanList() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                         Listado de prestamos activos"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        for (Loan l : loans) {
            if (l.getReturnDate().isBefore(LocalDate.now())){
                        System.out.print("Libro fuera de plazo: ");
            }
            System.out.println(l);  
        }
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"
                + "                         Listado de prestamos historicos"
                + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        for (Loan l : loansHist) {
            System.out.println(l);  
        }
    }
    
    private void bookListLoaned(){
        
        String isbn = requestIsbn();
        int pos = searchIsbn(isbn);
        
        if (pos == -1){
            System.out.println("El ISBN no coincide con ningun libro existente.");
            
        }else{
            System.out.println("Usuarios en posesion:");
            for (Loan ln : loans) {
                if(ln.getLoanedBook().getIsbn().equals(isbn)){
                    System.out.println(ln.getUserLoan());
                }
            }
            
            System.out.println("Usuarios que lo han leido:");
            for (Loan ln : loansHist) {
                if (ln.getLoanedBook().getIsbn().equals(isbn)){
                    System.out.println(ln.getUserLoan());
                }
            }
            
            
        }  
    }
    
    private void mostReadBook(){
        ArrayList <Integer> bookCounter = new ArrayList();
        int counter;
        for (Book b : books) {
            counter=0;
            for (Loan l : loans) {
                if (b==l.getLoanedBook()){
                    counter++;
                }
            }
            for (Loan l : loansHist) {
                if (b==l.getLoanedBook()){
                    counter++;
                }
            }
            bookCounter.add(counter);
        }
        
        int max=0;
        for (int c:bookCounter){
            if (c>max){
                max=c;
            }
        }
        System.out.println("El libro mas leido con " + max + " prestamos es: " );
               
        for (int i = 0; i < bookCounter.size(); i++) {
            if (bookCounter.get(i)==max){
                System.out.println(books.get(i));
            }
        }
    }
    
    private void mostReaderUser(){
        ArrayList <Integer> userCounter=new ArrayList();
        int counter;
        for (User u : users) {
            counter=0;
            for (Loan l:loans) {
                if (u==l.getUserLoan()){
                    counter++;
                }
            }
            for (Loan l:loansHist) {
                if (u==l.getUserLoan()){
                    counter++;
                }
            }
            userCounter.add(counter);
        }
        
        int max=0;
        for (int c:userCounter){
            if (c>max){
                max=c;
            }
        }
        System.out.println("El usuario mas lector con " + max + " prestamos es: " );
               
        for (int i = 0; i < userCounter.size(); i++) {
            if (userCounter.get(i)==max){
                System.out.println(users.get(i));
            }
        }
    }
    
    /*
    -------------------------------- Metodos auxiliares --------------------------------
    */
    
    private void outdatedLoan(){
        System.out.println("Prestamos fuera de plazo: ");
        
        for(Loan ln : loans){
            if(ln.getLoanDate().isBefore(LocalDate.now())){
                System.out.println(ln);
            }
        }
    }
    
    
     public boolean intChecker(String s){
        int n;
        try {
            n = Integer.parseInt(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }
    
    
    public boolean doubleChecker(String s){
        Double n;
        try {
            n = Double.parseDouble(s);
            return true;
            
        } catch (NumberFormatException e) {
            return false;
            
        }
    }
    
    
    /**
     * Método para solicitar por teclado el DNI de un usuario. pdte de validación
     * @return (String) dni del usuario tecleado
     */
    public String requestDni(){
        Scanner sc=new Scanner(System.in);
        String dni=sc.next();
        return dni;
    }
    /**
     * Método para solicitar por teclado el ISBN de un libro. pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String requestIsbn(){
        Scanner sc=new Scanner(System.in);
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
        loans.add(new Loan(books.get(2),users.get(2), hoy.minusDays(10),hoy.minusDays(3)));
        loans.add(new Loan(books.get(8),users.get(2), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(5),users.get(4), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(5),users.get(0), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(6),users.get(2), hoy,hoy.plusDays(15)));
        loans.add(new Loan(books.get(2),users.get(1), hoy,hoy.plusDays(15)));
        
        loansHist.add(new Loan(books.get(0),users.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(2),users.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(7),users.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(5),users.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(1),users.get(1), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(7),users.get(2), hoy.minusDays(20),hoy.minusDays(5)));
        loansHist.add(new Loan(books.get(6),users.get(3), hoy.minusDays(20),hoy.minusDays(5)));
    }
}
