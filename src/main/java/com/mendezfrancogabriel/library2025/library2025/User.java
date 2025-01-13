/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mendezfrancogabriel.library2025.library2025;

/**
 *
 * @author alu15d
 */
public class User {
    
    private String name;
    private String email;
    private String phoneNumber;
    private String dni;

    public User(String dni, String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dni = dni;
    }

    
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDni() {
        return dni;
    }

    
        
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
    @Override
    public String toString() {
        return "\n\n"
            +" ____________________________________________________________________________ \n"
            +"|                               Usuario                                      |\n"
            +"|____________________________________________________________________________|\n"
            +"|    - Usuario: " + name + "                                                  \n"
            +"|    - eMail: " + email + "                                                   \n"
            +"|    - Nº Telefono: " + phoneNumber + "                                       \n"
            +"|    - DNI: " + dni + "                                                       \n"
            +"|____________________________________________________________________________|\n";
    }

}
