import java.util.*;
import java.io.*;
/**
 * 
 * @author cjoyner
 */
public class Student extends User {
    
    /**
     * Constructs a student object with the given parameters
     * @param yourIDNumber
     * @param firstName
     * @param lastName
     * @param userName
     * @param password
     * @param email
     * @param yourMajor
     * @param yourMinor
     * @param yourApprovedCredits
     * @param yourCreditHoursEnrolled
     * @param yourCurrentSchudule
     * @param yourHolds 
     */
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
    
    /**
     * Constructs a student object with the given parameters
     * @param id 
     */
    Student(String id)
    {
            idNumber = id;
            currentSchudule = new LinkedList<CurrentCourse>();
            pastCourses = new LinkedList<PastCourse>();
    }        
            
   /**
    * method builds current schedule for this student
    * @param courseList list of all courses
    */
    public void buildCurrentSchedule(LinkedList<CurrentCourse> courseList)
    {
        String temp = tempCurrentSchudule;
        Scanner input = new Scanner(temp);
        input.useDelimiter(" ");
        creditHoursEnrolled = 0;
        //creates current schedule
        while (input.hasNext()){
        
            String crn = input.next();
            CurrentCourse tempCourse = new CurrentCourse();
            tempCourse.setCRN(crn);        
            Collections.sort(courseList, Course.comparatorByCRN());
            //finds course
            int index = Collections.binarySearch(courseList, tempCourse , Course.comparatorByCRN());
            //add course
            currentSchudule.add(courseList.get(index));
            CurrentCourse course = courseList.get(index);
            //set hours this student is enrolled in
           creditHoursEnrolled =  creditHoursEnrolled + course.getCredits();
        }
        
    }
    
    /**
     * method that builds a string of this student's current schedule
     */
    private void buildTempCurrentSchedule()
    {
       ListIterator<CurrentCourse> iterator = currentSchudule.listIterator();
       tempCurrentSchudule = "";
       //creates string
       while (iterator.hasNext())
       {
           CurrentCourse element = iterator.next();
           tempCurrentSchudule = tempCurrentSchudule + " " + element.getCRN();
       }
       
    }
    
    /**
     * set students data types to a string
     * @return string
     */
    @Override
    public String toString()
    {
        String contents = "";
        this.buildTempCurrentSchedule();
        contents = idNumber + " " + getFirstName() + " " + getLastName() + " " + getEmail()  + " " + major + " " + minor + " " + approvedCredits + " " +
                creditHoursEnrolled + " " + tempCurrentSchudule + " " + holds;
        
        return contents;
    }
    
    /**
     * backup method that backs up the
     * attributes of this object as a comma
     * delimited string used for writing to a file
     * @return string
     */
    public String backup()
    {
        String backup = "";
        this.buildTempCurrentSchedule();
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
    
    /**
     * method that sets id number for this student
     * @param id 
     */
    public void setIDNumber(String id)
    {
        idNumber = id;
    }
    
    /**
     * method that returns id number for this student
     * @return string
     */
    public String getIDNumber()
    {
        return idNumber;
    }
    
    /**
     * method that sets major for this student
     * @param yourMajor 
     */
    public void setMajor(String yourMajor)
    {
        major = yourMajor;
    }
    
    /**
     * method that returns major for this student
     * @return string
     */
    public String getMajor()
    {
        return major;
    }
    
    /**
     * method that sets minor for this student
     * @param yourMinor 
     */
    public void setMinor(String yourMinor)
    {
        minor = yourMinor;
    }
    
    /**
     * method that returns minor for this student
     * @return string
     */
    public String getMinor()
    {
        return minor;
    }
    
    /**
     * method that set approved credits for this student
     * @param yourApprovedCredits 
     */
    public void setApprovedCredits(int yourApprovedCredits)
    {
        approvedCredits = yourApprovedCredits;
    }
    
    /**
     * method that returns approved credits for this student
     * @return int
     */
    public int getApprovedCredits()
    {
        return approvedCredits;
    }
    
    /**
     * method that sets hours enrolled for this student
     * @param yourCreditHoursEnrolled 
     */
    public void setCreditHoursEnrolled(int yourCreditHoursEnrolled)
    {
        creditHoursEnrolled = yourCreditHoursEnrolled;
    }
    
    /**
     * method that returns hours enrolled for this student
     * @return 
     */
    public int getCreditHoursEnrolled()
    {
        return creditHoursEnrolled;
    }
    
    /**
     * method that returns current schedule for this student
     * @return 
     */
    public LinkedList<CurrentCourse> getCurrentSchudule()
    {
        return currentSchudule;
    }
    
    /**
     * method that sets holds for this student
     * @param yourHolds 
     */
    public void setHolds(boolean yourHolds)
    {
        holds = yourHolds;
    }
    
    /**
     * method that returns holds for this students
     * @return 
     */
    public boolean getHolds()
    {
        return holds;
    }
    
    /**
     * method that sets past course schedule for this student
     * @param course 
     */
    public void setPastCourses(LinkedList<PastCourse> course)
    {
        pastCourses = course;
    }
    
    /**
     * method that returns past courses schedule
     * @return LinkedList<PastCourse>
     */
    public LinkedList<PastCourse> getPastCourses()
    {
        return pastCourses;
    }
    
    /**
     * method that sets gpa for this student
     * @param yourGPA 
     */
    public void setGPA( double yourGPA)
    {
        gpa = yourGPA;
    }
    
    /**
     * method that returns gpa for this student
     * @return double
     */
    public double getGPA()
    {
        return gpa;
    }
    
    /**
     * returns total credits
     * @return 
     */
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
    
    /********** DATA MEMBERS **********/
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
