import java.util.*;
import java.io.*;

public class Student extends User {
    
    Student(String yourIDNumber, String firstName, String lastName, String userName, String password, String email, String yourMajor, 
            String yourMinor, int yourApprovedCredits, int yourCreditHoursEnrolled, String yourCurrentSchudule, boolean yourHolds){
    
        super ( userName, password, email, firstName, lastName);
        
        idNumber = yourIDNumber;
        major = yourMajor;
        minor = yourMinor;
        approvedCredits = yourApprovedCredits;
        creditHoursEnrolled = yourCreditHoursEnrolled; 
        tempCurrentSchudule = yourCurrentSchudule;
        holds = yourHolds;
        currentSchudule = new LinkedList<Course>();
    }
    
    
    public void buildCurrentScudule(LinkedList<Course> courseList)
    {
        String temp = tempCurrentSchudule;
        Scanner input = new Scanner(temp);
        input.useDelimiter(" ");
        
        while (input.hasNext()){
        
            String courseName = input.next();
            Course tempCourse = search(courseList, courseName);
            currentSchudule.add(tempCourse);
        }
        
    }
    
     private Course search(LinkedList<Course> courseList, String courseName)
    {
        Course tempCourse = new Course(courseName);
        int low = 0;
        int high = courseList.size();
        int mid;

        while( low <= high )
        {
            mid = ( low + high ) / 2;

            if( courseList.get(mid).compareTo(tempCourse) < 0 ){
                low = mid + 1;
            }
            else if (courseList.get(mid).compareTo(tempCourse) > 0 ){
                high = mid - 1;
            }
            else
            {
                return courseList.get(mid);
            }
        }

        return null;    
    
    }
    
    
    @Override
    public String toString()
    {
        String contents = "";
        
        contents = idNumber + " " + firstName + " " + lastName + " " + email  + " " + major + " " + minor + " " + approvedCredits + " " +
                creditHoursEnrolled + " " + tempCurrentSchudule + " " + holds;
        
        return contents;
    }
    
    String idNumber;
    String major;
    String minor;
    int approvedCredits;
    int creditHoursEnrolled;
    LinkedList<Course> currentSchudule;
    String tempCurrentSchudule;
    boolean holds;

   
}
