import java.util.*;

public class Course implements  Comparable<Course>{

    /* Parameter constructor */
    Course(String aCRN, String aCourse, int aSection, String theTitle, String thePrer, int numCredits, String theTime,
           String theDays, String theBuilding, String theRoom, String theProfessor, int totalSeatNumber, int theFilledSeats ) 
    {
        /* Set the values to their respective parameters */
        crn = aCRN;
        course = aCourse;
        section = aSection;
        title = theTitle;
        prer = thePrer;
        credits = numCredits;
        time = theTime;
        days = theDays;
        building = theBuilding;
        room = theRoom;
        professor = theProfessor;
        totalSeats = totalSeatNumber;
        filledSeats = theFilledSeats;
        prerequisites = new LinkedList<Course>();
        enrolledStudents = new LinkedList<Student>();
        next = null;
    }
    
    Course()
    {
       prerequisites = new LinkedList<Course>();
       enrolledStudents = new LinkedList<Student>(); 
       next = null;
    }

    /**
     * buildEnrolledStudents: MEthod that bulds a linked list of currently
     * enrolled students in Course
     *
     * @param studentList
     */
    public void buildEnrolledStudents(LinkedList<Student> studentList)
    {
        ListIterator<Student> iterator = studentList.listIterator();
        
        while (iterator.hasNext())
        {
            Student person = iterator.next();
            LinkedList<Course> checkForStudent = person.getCurrentSchudule();
            ListIterator<Course> iteratorCourse = checkForStudent.listIterator();
            while (iteratorCourse.hasNext())
            {
                Course studentCourse = iteratorCourse.next();
                if (studentCourse == this)
                {
                    enrolledStudents.add(person);
                    addStudent();
                }
            }
        }
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
    * addStudent method adds a student to this course
    * @return booleen true if student is added
    */
    public boolean addStudent(){
        if (totalSeats != filledSeats)
        {
            filledSeats++;
            return true;
        }    
        else
            return false;
    }

    /**
     * dropStudent method drops a student from this course
     */
    public void dropStudent(){
        if (filledSeats != 0)
            filledSeats--;
        
    }

    /**
     * toString method : used to create a string of the data members of a course
     * @return contents : a string of the data members
     */
    public String toString(){
    
        String contents;
        
        contents = crn + " " + course + " " + section + " " + title + " " + prer + " "  + credits + " " + time + " "
                + days + " " + building + " " + room + " " + professor + " " + totalSeats + " " + filledSeats;
        
        return contents;
    }

    /**
     * backup method : used to backup all the data members
     * from this course to a comma delimited string, which
     * will be written to a file
     * 
     * @return
     */
    public String backup(){

        String backup;

        /* create the string that we will return */
        backup = crn + "," + course + "," + section + "," + title + "," + prer + ","  + credits + "," + time + ","
                + days + "," + building + "," + room  + "," + totalSeats + "," + filledSeats + "," + professor +"\n";

        return backup;
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
     * Method that gets the list of currently enrolled students
     * @return
     */
    public LinkedList<Student> getEnrolledStudents()
    {
        return enrolledStudents;
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
     * Sets the time this course will be
     * @param yourTime
     */
    public void setTime(String yourTime)
    {
        time = yourTime;
    }

    /**
     * returns the time of this course
     * @return
     */
    public String getTime()
    {
        return time;
    }

    /**
     * Sets the days this course will be on
     * @param yourDays
     */
    public void setDays(String yourDays)
    {
        days = yourDays;
    }

    /**
     * method that returns the days data member
     * @return
     */
    public String getDays()
    {
        return days;
    }

    /**
     * Method that sets the building where this class will be help
     * @param yourBuilding
     */
    public void setBuilding(String yourBuilding)
    {
        building = yourBuilding;
    }

    /**
     * Return the building this class is held in
     * @return
     */
    public String getBuilding()
    {
        return building;
    }

    /**
     * Sets the room that this class will use
     * @param yourRoom
     */
    public void setRoom(String yourRoom)
    {
        room = yourRoom;
    }
    /**
     * Gets the room that this class is in
     * @return
     */
    public String getRoom()
    {
        return room;
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

    /**
     * Method that sets the total amount of seats that will
     * be available in this course
     *
     * @param yourTotalSeats
     */
    public void setTotalSeats(int yourTotalSeats)
    {
        if (yourTotalSeats > -1)
        {
            totalSeats = yourTotalSeats;
        }
    }

    /**
     * Method that returns the total amount of seats in
     * this course
     * @return
     */
    public int getTotalSeats()
    {
        return totalSeats;
    }

    /**
     * Gets the amount of seats that are filled in this course
     * @param yourFilledSeats
     */
    public void setFilledSeats(int yourFilledSeats)
    {
        if (yourFilledSeats > 0 && yourFilledSeats >= getTotalSeats())
        {
            filledSeats = yourFilledSeats;
        }
    }

    /**
     * Returns the amount of filled seats in this course
     * @return
     */
    public int getFilledSeats()
    {
        return filledSeats;
    }


/****** DATA MEMBERS *****************/

    private String crn;
    private String course;
    private int section;
    private String title;
    private String prer;
    private LinkedList<Course> prerequisites;
    private LinkedList<Student> enrolledStudents;
    private int credits;
    private String time;
    private String days;
    private String building;
    private String room;
    private String professor;
    private Course next;
    private int totalSeats;
    private int filledSeats;

    
}
