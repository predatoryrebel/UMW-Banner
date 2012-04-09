import java.util.*;
/*
 * Holds course and related course details
 */
public class Course implements  Comparable<Course>{
 
    /**
     * Constructor used to set a past course
     * @param aCRN
     * @param aCourse
     * @param aSection
     * @param theTitle
     * @param numCredits
     * @param theProfessor 
     */    
    Course(String aCRN, String aCourse,int aSection, String theTitle, int numCredits, String theProfessor)
    {
        /* Set the values to their respective parameters */
        crn = aCRN;
        course = aCourse; 
        section = aSection;
        title = theTitle;
        credits = numCredits;
        professor = theProfessor;
    }

    /**
     * compareTo method : method used to compare to two courses
     * with each other
     * @param a : a course to compare with this one
     * @return status of compare
     */
    public int compareTo(Course a){
        
       return course.compareTo(a.course);
    }
    
    /**
     * Method used to compare a course by CRN number
     * @return result of comparison
     */
    public static Comparator<Course> comparatorByCRN()
    {
        return new
                Comparator<Course>()
                {
                    public int compare(Course a, Course b)
                    {
                        return a.getCRN().compareTo(b.getCRN());
                    }
                };
    }
    

    /**
     * sets the CRN data member
     * @param yourCRN
     */

    public void setCRN(String yourCRN)
    {
        crn = yourCRN;
    }

    /**
     * Access method for the CRN data member
     * @return
     */
    public String getCRN()
    {
        return crn;
    }

    /**
     * sets that Course name
     * @param courseName
     */
    public void setName(String courseName)
    {
        course = courseName;
    }    

    /**
     * return the Course name
     * @return
     */
    public String getName()
    {
        return course;
    }

    /**
     * returns the section of this course
     * @return section
     */
    public int getSection()
    {
        return section;
    }

    /**
     * Method that sets the course title
     * @param yourTitle
     */
    public void setTitle(String yourTitle)
    {
        title = yourTitle;
    }

    /**
     * Method that gets and returns the Course title
     * @return
     */
    public String getTitle()
    {
        return title;
    }

    
    /**
     * set the amount of credit hours this course will have
     * @param yourCredits
     */
    public void setCredits(int yourCredits)
    {
        credits = yourCredits;
    }

    /**
     * Method that returns the amount of credits that this course is worth
     * @return
     */
    public int getCredits()
    {
        return credits;
    }

   

    /**
     * Sets the name of the professor that teaches this course
     * @param yourProfessor
     */
    public void setProfessor(String yourProfessor)
    {
        professor = yourProfessor;
    }

    /**
     * returns the name of the professor for this course
     * @return
     */
    public String getProfessor()
    {
        return professor;
    }

    


/****** DATA MEMBERS *****************/
    
    private String crn;
    private String course;
    private int section;
    private String title;
    private String professor;
    private int credits;
    

    
}
