/*
 * Holds course and related course details
 */
public class PastCourse extends Course {
    /* Parameter constructor */
    PastCourse(String aCRN, String aCourse, int aSection, String theTitle, int numCredits, String theProfessor, String yourGrade,
            String aUser)
    {
            /* Set the values to their respective parameters */
            super (aCRN,aCourse,aSection,theTitle,numCredits,theProfessor);
            grade = yourGrade;
            user = aUser;
    }
     /**
     * toString method : used to create a string of the data members of a past course
     * @return contents : a string of the data members
     */
    @Override
    public String toString()
    {
        String contents = "";
        
        contents = getCRN() + " " + getName() + " " + getSection() + " " + getTitle() + " " + getCredits() + " " + getProfessor() + 
                " " + grade + " " + user;
        
        return contents;
    }
    
     /**
     * backup method : used to backup all the data members
     * from this past course to a comma delimited string, which
     * will be written to a file
     * 
     * @return backup : a string of the data members
     */
    @Override
    public String backup()
    {
        String backup;

        /* create the string that we will return */
        backup = getCRN() + "," + getName() + "," + getSection() + "," + getTitle() + "," + getCredits() + "," + getProfessor() + 
                "," + grade + "," + user +"\n";

        return backup;
    }
    
    /**
     * set grade data member
     * @param aGrade 
     */
    public void setGrade(String aGrade)
    {
        grade = aGrade;
    }
    
    /**
     * returns grade data member
     * @return 
     */
    public String getGrade()
    {
        return grade;
    }
    
    /**
     * set user data member
     * @param aUser 
     */
    public void setUser(String aUser)
    {
        user = aUser;
    }
    
    /**
     * returns user data member 
     * @return 
     */
    public String getUser()
    {
        return user;
    }
    /************DATA MEMBERS********/
    private String grade;
    private String user;
}
