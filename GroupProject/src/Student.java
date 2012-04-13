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
        creditHoursEnrolled =  yourCreditHoursEnrolled;
        tempCurrentSchudule = yourCurrentSchudule;
        holds = yourHolds;
        currentSchudule = new LinkedList<CurrentCourse>();
        pastCourses = new LinkedList<PastCourse>();
        gpa = 0;
        setPermission(0);
    }
    
    Student(String id)
    {
            idNumber = id;
    }        
            
   
    public void buildCurrentScudule(LinkedList<CurrentCourse> courseList)
    {
        String temp = tempCurrentSchudule;
        Scanner input = new Scanner(temp);
        input.useDelimiter(" ");
        creditHoursEnrolled = 0;
        while (input.hasNext()){
        
            String crn = input.next();
            CurrentCourse tempCourse = new CurrentCourse();
            tempCourse.setCRN(crn);        
            Collections.sort(courseList, Course.comparatorByCRN());
            int index = Collections.binarySearch(courseList, tempCourse , Course.comparatorByCRN());
            currentSchudule.add(courseList.get(index));
            CurrentCourse course = courseList.get(index);
           creditHoursEnrolled =  creditHoursEnrolled + course.getCredits();
        }
        
    }
    
    private void buildTempCurrentSchudule()
    {
       ListIterator<CurrentCourse> iterator = currentSchudule.listIterator();
       tempCurrentSchudule = "";
       while (iterator.hasNext())
       {
           CurrentCourse element = iterator.next();
           tempCurrentSchudule = tempCurrentSchudule + " " + element.getCRN();
       }
       
    }
    
    
    @Override
    public String toString()
    {
        String contents = "";
        this.buildTempCurrentSchudule();
        contents = idNumber + " " + getFirstName() + " " + getLastName() + " " + getEmail()  + " " + major + " " + minor + " " + approvedCredits + " " +
                creditHoursEnrolled + " " + tempCurrentSchudule + " " + holds;
        
        return contents;
    }
    
    public String backup()
    {
        String backup = "";
        this.buildTempCurrentSchudule();
        backup = idNumber + "," + this.getFirstName() + "," + this.getLastName() + "," + this.getUserName() + "," + this.getPassword() + "," + this.getEmail() + "," + major + "," + minor + "," + approvedCredits + "," +
                creditHoursEnrolled + "," + tempCurrentSchudule + "," + holds + "\n";

        return backup;
    }
    
    /**
     * Method used to compare a student by id number
     * @return result of comparison
     */
    public static Comparator<Student> comparatorByID()
    {
        return new
                Comparator<Student>()
                {
                    public int compare(Student a, Student b)
                    {
                        return a.getIDNumber().compareTo(b.getIDNumber());
                    }
                };
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
    
    public LinkedList<CurrentCourse> getCurrentSchudule()
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
    
    public void setPastCourses(LinkedList<PastCourse> course)
    {
        pastCourses = course;
    }
    
    public LinkedList<PastCourse> getPastCourses()
    {
        return pastCourses;
    }
    
    public void setGPA( double yourGPA)
    {
        gpa = yourGPA;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    
    // Return total credits
    public int getEarnedCredits()
    {
        int totalCredits = 0;
        ListIterator<PastCourse> it = pastCourses.listIterator();
        
        while(it.hasNext())
        {
            PastCourse course = it.next();
            totalCredits += CalculateGPA.getNumberValue(course.getGrade());
        }
        
        return totalCredits;
    }
            
    private String idNumber;
    private String major;
    private String minor;
    private int approvedCredits;
    private int creditHoursEnrolled;
    private LinkedList<CurrentCourse> currentSchudule;
    private LinkedList<PastCourse> pastCourses;
    private double gpa;
    private String tempCurrentSchudule;
    private boolean holds;
    
   
}
