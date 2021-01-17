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
public class Car {
    //Atributes
    public int id;    
    public String license;
    public String driver;
    public int passengers;
    
    public Car(int id, String license, String driver, int passengers){
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
    }
    
    public void InfoDataCar(){
        System.out.println("Id :" + id);
        System.out.println("license: " + license);
        System.out.println("Driver: " + driver);
        System.out.println("Number of passenger: " + passengers);
    }
    
}
