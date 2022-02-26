
package airline_reservation_system;
/*
Important notes : 
when try SOP(objName);
it prints the objName@address
so solve this 
create toString function in the people class 
return string with all the att. values !!!!
EVERY CLASS SHOULD HAVE TOSTRING METHOD

3.when deal with objects must create the BIG 3
constructor
getters
setters
*/
import java.util.*;

/**
 *
 * @Nada
 */
public class Airline_Reservation_System {

    public static void main(String[] args) {
    
    
    People[] people = new People[] {                                       
            new People("Cleopatra", "Egypt", "69 BC", 1),                  
            new People("Alexander the Great", "Macedon", "356 BC", 2),
            new People("Julius Caesar", "Rome", "100 BC", 3),
            new People("Hannibal", "Carthage", "247 BC", 1),                   
            new People("Confucius", "China", "551 BC", 1),                     
            new People("Pericles", "Greece", "429 BC", 1),                     
            new People("Spartacus", "Thrace", "111 BC", 2),                    
            new People("Marcus Aurelius", "Rome", "121 AD", 2),
            new People("Leonidas", "Greece", "540 BC", 2),                     
            new People("Sun Tzu", "China", "544 BC", 2),                    
            new People("Hammurabi", "Babylon", "1750 BC", 2)
        };
        Airline airline = new Airline();                                      
                          
       
         for (int i = 0; i < people.length; i++) {
            if (people[i].applyPassport() == true) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            }
        }
         
          System.out.println("********************** RESERVATIONS COMPLETE! **********************\n");
        System.out.println(airline);
  }     
   
     
}
