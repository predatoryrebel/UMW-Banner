
import java.util.*;

/*
 * Takes a user and finds the user as a student, faculty or admin
  * @author cjoyner
 */
public class FindUser {
    /**
     *  Constructs an FindUser object with the given parameters
     * @param person
     * @param admin
     * @param student
     * @param faculty 
     */
    FindUser(User person, LinkedList<Admin> admin, LinkedList<Student> student, LinkedList<Faculty> faculty)
    {
        user = person;
        adminList = admin;
        studentList = student;
        facultyList = faculty;
    }
    /**
     Searches adminList to find an admin with the same user name
     * @return admin the admin with the same user name as the user.
     */
    public Admin findAdmin()
    {
        ListIterator<Admin> iterator = adminList.listIterator();
        Admin person = null;
        //search for admin
        while (iterator.hasNext())
        {
            Admin element = iterator.next();
            if (user.getUserName().equalsIgnoreCase(element.getUserName()))
            {
                person = element;
            }
        }
        
        return person;
    }
    
    /**
     Searches adminList to find a student with the same user name
     * @return Student the student with the same user name as the user.
     */
    public Student findStudent()
    {
        ListIterator<Student> iterator = studentList.listIterator();
        Student person = null;
        //search for admin
        while (iterator.hasNext())
        {
            Student element = iterator.next();
            if (user.getUserName().equalsIgnoreCase(element.getUserName()))
            {
                person = element;
            }
        }
        
        return person;
    }
    
    /**
     Searches adminList to find a faculty member with the same user name
     * @return faculty the faculty member with the same user name as the user.
     */
    public Faculty findFaculty()
    {
        ListIterator<Faculty> iterator = facultyList.listIterator();
        Faculty person = null;
        //search for admin
        while (iterator.hasNext())
        {
            Faculty element = iterator.next();
            if (user.getUserName().equalsIgnoreCase(element.getUserName()))
            {
                person = element;
            }
        }
        
        return person;
    }
            
    /********** DATA MEMBERS **********/
    private User user;
    private LinkedList<Admin> adminList;
    private LinkedList<Student> studentList;
    private LinkedList<Faculty> facultyList;
}
