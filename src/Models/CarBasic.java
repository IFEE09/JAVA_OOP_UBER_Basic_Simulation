package Models;
/**
 *
 * @author uomo2
 */
public class CarBasic extends Car{
    //Atributes
    String brand;
    int model;
    //Constructor
    public CarBasic(int id, String license, String driver, int passengers, String brand, int model){
        super(id, license, driver, passengers);
        this.brand = brand;
        this.model = model;
    }
    
}
