import java.util.*;
import java.io.*;

public class Student extends User {
    
    Student(String yourIDNumber, String firstName, String lastName, String userName, String password, String email, String yourMajor, 
            String yourMinor, int yourApprovedCredits, int yourCreditHoursEnrolled, String yourCurrentSchudule, 
            boolean yourHolds){
    
        super ( userName, password, email, firstName, lastName);
        
        idNumber = yourIDNumber;
        major = yourMajor;
        minor = yourMinor;
        approvedCredits = yourApprovedCredits;
        creditHoursEnrolled = yourCreditHoursEnrolled; 
        tempCurrentSchudule = yourCurrentSchudule;
        holds = yourHolds;
        currentSchudule = new LinkedList<Course>();
        setPermission(0);
    }
   
    public void buildCurrentScudule(LinkedList<Course> courseList)
    {
        String temp = tempCurrentSchudule;
        Scanner input = new Scanner(temp);
        input.useDelimiter(" ");
        
        while (input.hasNext()){
        
            String crn = input.next();
            Course tempCourse = new Course();
            tempCourse.setCRN(crn);        
            Collections.sort(courseList, Course.comparatorByCRN());
            int index = Collections.binarySearch(courseList, tempCourse , Course.comparatorByCRN());
            currentSchudule.add(courseList.get(index));
        }
        
    }
    
    
    @Override
    public String toString()
    {
        String contents = "";
        
        contents = idNumber + " " + getFirstName() + " " + getLastName() + " " + getEmail()  + " " + major + " " + minor + " " + approvedCredits + " " +
                creditHoursEnrolled + " " + tempCurrentSchudule + " " + holds;
        
        return contents;
    }
    
    public String backup()
    {
        String backup = "";

        backup = idNumber + "," + getFirstName() + "," + getLastName() + "," + getUserName() + getPassword() + getEmail() + "," + major + "," + minor + "," + approvedCredits + "," +
                creditHoursEnrolled + "," + tempCurrentSchudule + "," + holds + "\n";

        return backup;
    }
    
    public void setIDNumber(String id)
    {
        idNumber = id;
    }
    
    public String getIDNumber()
    {
        return idNumber;
    }
    
    public void setMajor(String yourMajor)
    {
        major = yourMajor;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public void setMinor(String yourMinor)
    {
        minor = yourMinor;
    }
    
    public String getMinor()
    {
        return minor;
    }
    
    public void setApprovedCredits(int yourApprovedCredits)
    {
        approvedCredits = yourApprovedCredits;
    }
    
    public int getApprovedCredits()
    {
        return approvedCredits;
    }
    
    public void setCreditHoursEnrolled(int yourCreditHoursEnrolled)
    {
        creditHoursEnrolled = yourCreditHoursEnrolled;
    }
    
    public int getCreditHoursEnrolled()
    {
        return creditHoursEnrolled;
    }
    
    public LinkedList<Course> getCurrentSchudule()
    {
        return currentSchudule;
    }
    
    public void setHolds(boolean yourHolds)
    {
        holds = yourHolds;
    }
    
    public boolean getHolds()
    {
        return holds;
    }        
            
    private String idNumber;
    private String major;
    private String minor;
    private int approvedCredits;
    private int creditHoursEnrolled;
    private LinkedList<Course> currentSchudule;
    private String tempCurrentSchudule;
    private boolean holds;
    
   
}
