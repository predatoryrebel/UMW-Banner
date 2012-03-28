import java.util.*;

public class User implements Comparable<User>{

    User (String yourUserName, String yourPassword, String yourEmail, String yourFirstName, String yourLastName){
    
            userName = yourUserName;
            password = yourPassword;
            email = yourEmail;
            firstName = yourFirstName;
            lastName = yourLastName;
    }
    
    User()
    {
    
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
    
    public void setUserName(String yourUserName)
    {
        userName = yourUserName;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setPassword(String yourPassword)
    {
        password = yourPassword;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setEmail(String yourEmail)
    {
        email = yourEmail;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setFirstName(String yourFirstName)
    {
        firstName = yourFirstName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName(String yourLastName)
    {
        lastName = yourLastName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;    
}
