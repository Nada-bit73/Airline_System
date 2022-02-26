package airline_reservation_system;

import java.util.Arrays;

public class People {
 
      private String name;
      private String nationality;
      private String dateOfBirth;
      private String[] passport;
      private int seatNumber;
      
      
      
      public People(String name,String nationality, String dateOfBirth, int seatNumber ,String[] passportInfo){
        
       this.name = name;
       this.nationality = nationality;
       this.dateOfBirth = dateOfBirth;
       this.seatNumber = seatNumber;
       this.passport = passportInfo;
       
   } 
        //inside the CC, set the current object's passport field equal to a copy of the source object's field.
   public People(String name,String nationality, String dateOfBirth, int seatNumber ){
        
       this.name = name;
       this.nationality = nationality;
       this.dateOfBirth = dateOfBirth;
       this.seatNumber = seatNumber;
       this.passport = new String[3];
       
   } 
   
   //copy the values from the first constructor 
   public People(People source){
       this.name = source.name;
       this.nationality = source.nationality;
       this.dateOfBirth = source.dateOfBirth;
       this.passport = source.passport;
       this.seatNumber = source.seatNumber;
       this.passport = Arrays.copyOf(passport, passport.length); 
       
   } 
   
   //Getters
   /*
   Arrays getter and setter MUST return copy of other than this reference trap will happen !!!
   */
   public String getName(){
       return this.name;
   }
   
    public String getNationality(){
       return this.nationality;
   }
    
    public String getDateOfBirth(){
       return this.dateOfBirth;
   }
    
      public String[] getPassport(){
       return Arrays.copyOf(this.passport, passport.length);
   }
      
      public int getseatNumber(){
       return this.seatNumber;
   }
    
      
      
    //Seters
        public void setName(String name){
            
        this.name=name;
   }
   
    public void setNationality(String nationality){
        this.nationality=nationality;
   }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
   }
   
      
     
      public void setseatNumber(int seatNum){
        this.seatNumber = seatNum;
   }
    
     public void setPassport(){
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
   } 
   
    

    public boolean applyPassport(){
        
        int number = (int) (Math.random() * 2);  
        if (number == 0) {
            return false;
        } else {
            return true;
        }
       
    }
    
    
    
    public void  chooseSeat(){
        this.seatNumber = (int)(Math.random() * 11 + 1);

    }   
    
    
    
    public String toString(){
         return "Name: " + this.getName() + "\n" + 
        "Nationality: " + this.getNationality() + "\n" + 
        "Date of Birth: " + this.getDateOfBirth() + "\n" +
        "Seat Number: " + this.getseatNumber() + "\n" + "Passport: " +
        Arrays.toString(this.getPassport()) + "\n";
    }

    
}
