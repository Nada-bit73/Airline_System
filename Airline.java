
package airline_reservation_system;

import java.util.Arrays;

/**
 *
 * @Nada
 */
public class Airline {
    private People[] seats;
    
    
    public Airline(){
        this.seats = new People[11];
        
    }
   
    
    public People getPerson(int index){
        
        return new People(this.seats[index]);
    }
    
    
    
   
    public void setPerson(People people){
      this.seats[people.getseatNumber() - 1] = new People(people);
      
    }
   
public void createReservation(People people){
    
    while(seats[people.getseatNumber() - 1] != null){ //test the availability 
     System.out.println("\n"+people.getName()+" , seat: "+people.getseatNumber()+" is already taken. Please choose another one. \n");   
     people.chooseSeat();
    }
    int index = people.getseatNumber() - 1;
    seats[index] = new People(people);
    System.out.println("Thank you "+people.getName()+" for flying with Java airlines. Your seat number is "+people.getseatNumber()+"\n");
}    
 public String toString() {
        String temp = "";
        for (int i = 0; i < this.seats.length; i++) {
           if (seats[i] != null) {                      
                temp += seats[i].toString();
                temp += "\n\n";    
           } 
            else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }
    
}
