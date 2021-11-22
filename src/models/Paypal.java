package models;
/* @author IFEE09 */
public class Paypal extends Payment {
    
    //atributos
    private String email;
    
    //metodo constructor
    public Paypal(Integer id, String email){
        super(id);
        this.email = email;
    }
    
    //metodos Setters y Getters 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
