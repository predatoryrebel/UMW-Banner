import java.util.*;

public class User implements Comparable<User>{

    User (String yourUserName, String yourPassword, String yourEmail, String yourFirstName, String yourLastName){
    
            userName = yourUserName;
            password = yourPassword;
            email = yourEmail;
            firstName = yourFirstName;
            lastName = yourLastName;
    }
    
    public int compareTo(User u)
    {
        return lastName.compareToIgnoreCase(u.lastName);
    }
    
   
    public String toString()
    {
        String contents = "";
        
        contents = firstName + " " + lastName + " " + email;
        
        return contents;
    }
    
    String userName;
    String password;
    String email;
    String firstName;
    String lastName;

    
}
