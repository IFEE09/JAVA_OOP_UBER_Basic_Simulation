package models;

//esta es una superclase. 
public class Car{
    
    //atributos de instancia
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;
    
    //metodo constructor
    public Car(Integer id, String license, Account driver, Integer passenger) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }
    
    //metodo constructor acotado
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //metodos Setters y Getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }
    
}