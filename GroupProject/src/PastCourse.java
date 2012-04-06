
public class PastCourse extends Course {
    
    PastCourse(String aCRN, String aCourse, int aSection, String theTitle, int numCredits, String theProfessor, String yourGrade,
            String aUser)
    {
            super (aCRN,aCourse,aSection,theTitle,numCredits,theProfessor);
            grade = yourGrade;
            user = aUser;
    }
    
    @Override
    public String toString()
    {
        String contents = "";
        
        contents = getCRN() + " " + getName() + " " + getSection() + " " + getTitle() + " " + getCredits() + " " + getProfessor() + 
                " " + grade + " " + user;
        
        return contents;
    }
    
    @Override
    public String backup()
    {
        String backup;

        /* create the string that we will return */
        backup = getCRN() + "," + getName() + "," + getSection() + "," + getTitle() + "," + getCredits() + "," + getProfessor() + 
                "," + grade + "," + user +"\n";

        return backup;
    }
    public void setGrade(String aGrade)
    {
        grade = aGrade;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void setUser(String aUser)
    {
        user = aUser;
    }
    
    public String getUser()
    {
        return user;
    }
    
    private String grade;
    private String user;
}
