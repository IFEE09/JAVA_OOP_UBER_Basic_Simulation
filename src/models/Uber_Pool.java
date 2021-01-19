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
public class Uber_Pool extends Car{
    String brand;
    String model;
    
    public Uber_Pool(String License, Account name_Driver, String brand, String model){
        super(License, name_Driver);
        this.brand = brand;
        this.model = model;
    }
    
    
}
