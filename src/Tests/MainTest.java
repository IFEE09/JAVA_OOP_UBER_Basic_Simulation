package Tests;
import Models.Account;
import Models.CarAdvanced;
import Models.CarBasic;
import Models.Driver;
import Models.Car;
/**
 *
 * @author uomo2
 */
public class MainTest {
   public static void main (String[] args){
       
       Account driver_Juan = new Driver(1258, "Oscar Navarrete", "Passport", "Oscar@gmail.com", "password");
       Account user_Ivan = new Account(1234, "Ivan Espadas", "IFE", "ivan@gmail.com", "hola1234");
       
       driver_Juan.printDataDriver();
       user_Ivan.printDataUser();
       
       
       
       
      } 
   }
       
   

