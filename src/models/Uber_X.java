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
public class Uber_X extends Car{
    String brand;
    String model;
    
    public Uber_X(String license, Account name_Driver, String brand, String Model){
        super(license, name_Driver);
        this.brand = brand;
        this.model = model;
    }
}
