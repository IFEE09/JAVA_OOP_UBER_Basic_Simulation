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
public class Car {
    //Atributes
    public int id;    
    public String license;
    public Account name_Driver;
    public int passengers;
    
    public Car(String license, Account name_Driver){
        this.license = license;
        this.name_Driver = name_Driver;
    }
    //Methods
    public void print_Data_Car(){
        System.out.println("Id :" + id);
        System.out.println("license: " + license);
        System.out.println("Driver: " + name_Driver);
        System.out.println("Number of passenger: " + passengers);
    }
    
}
