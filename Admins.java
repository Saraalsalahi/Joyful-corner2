package joyfullcorner;

import static joyfullcorner.Person.owners;

public class Admins extends Person {
    
    String name;
    String adminID;
    String username;
    String password;
    String mobileNumber;
    String email;
    int numOfReviews;
    

    public Admins() {
        
    }
    
    public void showRequests(){
        System.out.println(owners);
    }
    
    public void stateOfRequest(){
        System.out.println("Enter the code of the request to change it: ");
        
        
    }
    
}
