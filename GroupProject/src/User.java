import java.util.*;
/**
 * 
 * @author cjoyner
 */
public class User implements Comparable<User>{
    /**
     * Constructs a user object with the given parameters
     * @param yourUserName
     * @param yourPassword
     * @param yourEmail
     * @param yourFirstName
     * @param yourLastName 
     */
    User (String yourUserName, String yourPassword, String yourEmail, String yourFirstName, String yourLastName){
    
            userName = yourUserName;
            password = yourPassword;
            email = yourEmail;
            firstName = yourFirstName;
            lastName = yourLastName;
    }
    
    /**
     * Constructs a user object
     */
    User()
    {
    
    }

    /**
     * Compares the last name of to users
     * @param u
     * @return int 
     */
    public int compareTo(User u)
    {
        return lastName.compareToIgnoreCase(u.lastName);
    }
    
   /**
    * Sets last name, first name and email to a string
    * @return string 
    */
    public String toString()
    {
        String contents = "";
        
        contents = firstName + " " + lastName + " " + email;
        
        return contents;
    }
    
    /**
     * method that sets the username of this user
     * @param yourUserName 
     */
    public void setUserName(String yourUserName)
    {
        userName = yourUserName;
    }
    /**
     *  method that returns the username of this user
     * @return username
     */
    public String getUserName()
    {
        return userName;
    }
    
    /**
     * method that sets password of this user
     * @param yourPassword 
     */
    public void setPassword(String yourPassword)
    {
        password = yourPassword;
    }
    
    /**
     * method that returns password of this user
     * @return string
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * method that sets email for this user
     * @param yourEmail 
     */
    public void setEmail(String yourEmail)
    {
        email = yourEmail;
    }
    
    /**
     * method that returns email for this user
     * @return string
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * method that sets first name of this user 
     * @param yourFirstName 
     */
    public void setFirstName(String yourFirstName)
    {
        firstName = yourFirstName;
    }
    
    /**
     * method that returns first name of this user
     * @return String
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * method that sets lat name of this user
     * @param yourLastName 
     */
    public void setLastName(String yourLastName)
    {
        lastName = yourLastName;
    }
    
    /**
     * method that returns last name of this user
     * @return string
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * method that sets permission for this user
     * @param yourPermission 
     */
    public void setPermission(int yourPermission)
    {
        permission = yourPermission;
    }
    
    /**
     * method that returns permission for this user
     * @return 
     */
    public int getPermission()
    {
        return permission;
    }
    
     /********** DATA MEMBERS **********/
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;    
    private int permission;
}
