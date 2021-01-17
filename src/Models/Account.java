/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author uomo2
 */
public class Account {
    public int id;
    public String name;
    public String document;
    public String email;
    public String password;
    
    public Account(int id, String name, String document, String email, String password){
        this.id = id;
        this.name = name;
        this.document = name;
        this.email = name;
        this.password = name;
    }
    
    public void printDataUser(){
        System.err.println("El nombre del usuario  es " + this.name + " , con ID: " + this.id);
    }
    
    
    public void printDataDriver(){
        System.err.println("El nombre del conductor es " + this.name + " , con ID: " + this.id);
    }
}
