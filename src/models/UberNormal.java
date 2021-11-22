
package models;
/* @author IFEE09 */
public class UberNormal extends Car{
    
    private String brand;
    private String model;
    
    public UberNormal(Integer id, String license, Account driver, Integer passenger, String brand, String model){
        super(id, license , driver, passenger);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
}
