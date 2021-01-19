/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author uomo2
 */
public class Account {
    public int id; //Atributes
    public String name_Driver;
    public String document;
    public String email;
    public String password;
    
    public Account(String name_driver, String document){
        this.name_Driver = name_Driver;
        this.document = document;
    }
    
    //Methods
    public void print_Data_User(){
        System.out.println("El nombre del usuario  es " + this.name_Driver + " , con ID: " + this.id);
    }
}
