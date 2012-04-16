

/**
 *
 * @author Bradley Ruggiero
 * @version 1.0
 * @since
 */
public class Admin extends User{

    /**
     * Constructs an administrator object with the given parameters
     *
     * @param userName
     * @param password
     * @param email
     * @param firstName
     * @param lastName
     * @param yourOffice
     * @param yourPhoneNumber
     */
    Admin(String userName, String password, String email, String firstName, String lastName, String yourOffice,
            String yourPhoneNumber){

        super ( userName, password, email, firstName, lastName);

        office = yourOffice;
        phoneNumber = yourPhoneNumber;
        setPermission(2);
    }

    /**
     * Returns the attributes of this object as a string
     * @return contents :  a string of the data members
     */
    @Override
    public String toString()
    {
        String contents = "";

        contents =  getFirstName() + " " + getLastName() + " " + getEmail()  + " " + office + " " + phoneNumber;

        return contents;
    }


    /**
     * backup method that backs up the
     * attributes of this object as a comma
     * delimited string used for writing to a file
     * @return
     */
    public String backup()
    {
        String backup = "";

        /* Build the conctenated string */
        backup =  getFirstName() + "," + getLastName() +  "," + getUserName() + "," + getPassword()  + ","  + getEmail()  + "," + office  + phoneNumber + "\n";

        return backup;
    }

    /**
     * method that sets the office of this admin
     * @param yourOffice
     */
    public void setOffice(String yourOffice)
    {
        office = yourOffice;
    }

    /**
     * method that returns the office number of this admin
     * @return
     */
    public String getOffice()
    {
        return office;
    }

    /**
     * setPhoneNumber sets the admin's phone number as a string
     * @param yourPhoneNumber
     */
    public void setPhoneNumber(String yourPhoneNumber)
    {
        phoneNumber = yourPhoneNumber;
    }

    /**
     * getPhoneNumber method returns the phone number
     * of the admin
     * @return
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }


    /********** DATA MEMBERS **********/
    String office;
    String phoneNumber;

}
