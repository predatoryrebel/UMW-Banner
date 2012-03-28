import java.util.*;

public class Faculty extends User {
    
    Faculty(String userName, String password, String email, String firstName, String lastName, String yourOffice, 
            String yourPhoneNumber){
        
        super ( userName, password, email, firstName, lastName);
        
        office = yourOffice;
        phoneNumber = yourPhoneNumber;
        courses = new LinkedList<Course>();
    }
    
    public void buildCourseList(LinkedList<Course> courseList)
    {
        ListIterator<Course> iterator = courseList.listIterator();
        while (iterator.hasNext())
        {
            Course tempCourse = iterator.next();
            String professor = lastName + firstName.substring(0, 1);
            if (tempCourse.professor.equalsIgnoreCase(professor))
            {
                courses.add(tempCourse);
            }
        }
    }
    
    
    
    @Override
    public String toString()
    {
        String contents = "";
        
        contents =  firstName + " " + lastName + " " + email  + " " + office + " " + phoneNumber;
        
        return contents;
    }

    public String backup()
    {
        String backup = "";

        backup =  firstName + "," + lastName +  "," + userName + "," + password + "," + email + "," + office + "," + phoneNumber;

        return backup;
    }
    
    String office;
    String phoneNumber;
    LinkedList<Course> courses;

}
