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
public class CarAdvanced extends Car{
    //Atributes
    String typeCar;
    String seatMaterial;
    //Constructor Method
    public CarAdvanced(int id, String license, String driver, int passengers, String brand, int model){
        super(id, license, driver, passengers);
        this.typeCar = typeCar;
        this.seatMaterial = seatMaterial;
    }
}
