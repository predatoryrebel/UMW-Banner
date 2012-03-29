import java.util.*;

public class Faculty extends User {
    
    Faculty(String userName, String password, String email, String firstName, String lastName, String yourOffice, 
            String yourPhoneNumber){
        
        super ( userName, password, email, firstName, lastName);
        
        office = yourOffice;
        phoneNumber = yourPhoneNumber;
        courses = new LinkedList<Course>();
        permission = 1;
    }
    
   Faculty()
   {
   
   }        
    public void buildCourseList(LinkedList<Course> courseList)
    {
        ListIterator<Course> iterator = courseList.listIterator();
        while (iterator.hasNext())
        {
            Course tempCourse = iterator.next();
            String professor = getLastName() + getFirstName().substring(0, 1);
            if (tempCourse.getProfessor().equalsIgnoreCase(professor))
            {
                courses.add(tempCourse);
            }
        }
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


    public int compareTo(Faculty faculty2){


        if(this.getFirstName() != null && faculty2.getFirstName() != null){
            return this.getFirstName().compareToIgnoreCase(faculty2.getFirstName());
        }
        return 0;

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
    
    public LinkedList<Course> getCourses()
    {
        return courses;
    }
   
    String office;
    String phoneNumber;
    int permission;
    LinkedList<Course> courses;

}
