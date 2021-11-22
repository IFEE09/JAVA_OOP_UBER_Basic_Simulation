package models;

public class Account {
    
    //atributos
    private String name;
    private Integer id;
    private String license;
    private String email;
    private String password;

    //metodo constructor
    public Account(String name, Integer id, String license, String email, String password) {
        this.name = name;
        this.id = id;
        this.license = license;
        this.email = email;
        this.password = password;
    }
    
    //metodo constructor acotado
    public Account(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    //metodos Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}