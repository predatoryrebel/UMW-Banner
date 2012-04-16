import java.util.*;
/**
 * 
 * @author cjoyner
 */
public class Faculty extends User {

    /**
     * The Parameter constructor that sets up the entire Faculty object
     *
     * @param userName
     * @param password
     * @param email
     * @param firstName
     * @param lastName
     * @param yourOffice
     * @param yourPhoneNumber
     */
    Faculty(String userName, String password, String email, String firstName, String lastName, String yourOffice, 
            String yourPhoneNumber){
        
        super ( userName, password, email, firstName, lastName);
        
        office = yourOffice;
        phoneNumber = yourPhoneNumber;
        courses = new LinkedList<CurrentCourse>();
        setPermission(1);
    }
    
     /**
      * Builds faculty course list by matching course criteria professor to faculty members Last name and first initial
      * @param courseList 
      */     
    public void buildCourseList(LinkedList<CurrentCourse> courseList)
    {
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        while (iterator.hasNext())
        {
            CurrentCourse tempCourse = iterator.next();
            String professor = getLastName() + getFirstName().substring(0, 1);
            if (tempCourse.getProfessor().equalsIgnoreCase(professor))
            {
                courses.add(tempCourse);
            }
        }
    }
    /**
     * Overridden toString method that returns the information of
     * this faculty member as a string
     *
     * @return contents
     */
    @Override
    public String toString()
    {
        String contents = "";
        
        contents =  getFirstName() + " " + getLastName() + " " + getEmail()  + " " + office + " " + phoneNumber;
        
        return contents;
    }

    /**
     * Backup method used to backup all the information in this faculty
     * member object to a comma delimited string used for writing to a file
     * 
     * @return
     */
    public String backup()
    {
        String backup = "";

        backup =  getFirstName() + "," + getLastName() +  "," + getUserName() + "," + getPassword()  + ","  + getEmail()  + "," + office + phoneNumber + '\n';

        return backup;
    }

    /**
     * A comparing method used to compare two
     * faculty member objects with each other
     * @param faculty2
     * @return
     */
    public int compareTo(Faculty faculty2){


        if(this.getFirstName() != null && faculty2.getFirstName() != null){
            return this.getFirstName().compareToIgnoreCase(faculty2.getFirstName());
        }
        return 0;

    }

    /**
     * Sets the faculty member's office number
     * @param yourOffice
     */
    public void setOffice(String yourOffice)
    {
        office = yourOffice;
    }

    /**
     * Returns the faculty member's office number
     * @return
     */
    public String getOffice()
    {
        return office;
    }

    /**
     * Sets the phone number of this faculty
     * member
     * @param yourPhoneNumber
     */
    public void setPhoneNumber(String yourPhoneNumber)
    {
        phoneNumber = yourPhoneNumber;
    }

    /**
     * MEthod that returns the phone number of this faculty members
     * @return
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * This method returns a list of courses that this faculty member
     * teaches
     * @return
     */
    public LinkedList<CurrentCourse> getCourses()
    {
        return courses;
    }

/******** DATA MEMBERS ********/
    private String office;
    private String phoneNumber;
    private LinkedList<CurrentCourse> courses;

}
