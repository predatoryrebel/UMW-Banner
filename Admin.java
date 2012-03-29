/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley Ruggiero
 * @version 1.0
 * @since
 */
public class Admin extends User{

    Admin(String userName, String password, String email, String firstName, String lastName, String yourOffice,
            String yourPhoneNumber){

        super ( userName, password, email, firstName, lastName);

        office = yourOffice;
        phoneNumber = yourPhoneNumber;
        permission = 2;
    }
    
    @Override
    public String toString()
    {
        String contents = "";

        contents =  getFirstName() + " " + getLastName() + " " + getEmail()  + " " + office + " " + phoneNumber;

        return contents;
    }

    public String backup()
    {
        String backup = "";

        backup =  getFirstName() + "," + getLastName() +  "," + getUserName() + "," + getPassword()  + ","  + getEmail()  + "," + office + "," + phoneNumber + '\n';

        return backup;
    }

    public void setOffice(String yourOffice)
    {
        office = yourOffice;
    }

    public String getOffice()
    {
        return office;
    }

    public void setPhoneNumber(String yourPhoneNumber)
    {
        phoneNumber = yourPhoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }


    /**** DATA MEMBERS ********/
    String office;
    String phoneNumber;
    int permission;

}
