
package models;
/* @author IFEE09 */
public class Card extends Payment{
    
    //atributos
    private Integer number;
    private Integer cvv;
    private Integer date;
    
    //metodo constructor
    public Card(Integer number, Integer cvv, Integer date, Integer id) {
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
    
    //metodos Getters y Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }
    
    
}
