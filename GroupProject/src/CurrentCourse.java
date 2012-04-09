
import java.util.LinkedList;
import java.util.ListIterator;



/**
 *
 * @author cjoyner
 */
public class CurrentCourse extends Course {
    
     /* Parameter constructor */
    CurrentCourse(String aCRN, String aCourse, int aSection, String theTitle, String thePrer, int numCredits, String theTime,
           String theDays, String theBuilding, String theRoom, String theProfessor, int totalSeatNumber, int theFilledSeats ) 
    {
        /* Set the values to their respective parameters */
       super (aCRN,aCourse,aSection,theTitle,numCredits,theProfessor);
        
        prer = thePrer;
        time = theTime;
        days = theDays;
        building = theBuilding;
        room = theRoom;
        totalSeats = totalSeatNumber;
        filledSeats = theFilledSeats;
        prerequisites = new LinkedList<CurrentCourse>();
        enrolledStudents = new LinkedList<Student>();
        waitingList = new LinkedList<Student>();
    }
    
    /**
     * Default constructor no parameters
     */
    CurrentCourse()
    {
       super ("","",0,"",0,"");
       prerequisites = new LinkedList<CurrentCourse>();
       enrolledStudents = new LinkedList<Student>(); 
       waitingList = new LinkedList<Student>();
    }
    
     /**
     * buildEnrolledStudents: Method that builds a linked list of currently
     * enrolled students in Course
     *
     * @param studentList
     */
    public void buildEnrolledStudents(LinkedList<Student> studentList)
    {
        ListIterator<Student> iterator = studentList.listIterator();
        //iterates though student list
        while (iterator.hasNext())
        {
            Student person = iterator.next();
            LinkedList<CurrentCourse> checkForStudent = person.getCurrentSchudule();
            ListIterator<CurrentCourse> iteratorCourse = checkForStudent.listIterator();
            //adds student to a course if they are enrolled
            while (iteratorCourse.hasNext())
            {
                CurrentCourse studentCourse = iteratorCourse.next();
                if (studentCourse == this)
                {
                    enrolledStudents.add(person);
                }
            }
        }
    }
    
    /**
    * addStudent method adds a student to this course
    * @return boolean true if student is added
    */
    public boolean addStudent(){
        if (totalSeats > filledSeats)
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
        
         contents = getCRN() + " " + getName() + " " + getSection() + " " + getTitle() + " " + prer + " "  + getCredits() + " " + time + " "
                + days + " " + building + " " + room  + " " + totalSeats + " " + filledSeats + " " + getProfessor();
        
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
        backup = getCRN() + "," + getName() + "," + getSection() + "," + getTitle() + "," + prer + ","  + getCredits() + "," + time + ","
                + days + "," + building + "," + room  + "," + totalSeats + "," + filledSeats + "," + getProfessor() +"\n";

        return backup;
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
    
    /**
     * Get waiting list for the course
     * @return list of students waiting on the course
     */
    public LinkedList<Student> getWaitingList()
    {
        return waitingList;
    }
    
    private LinkedList<Student> waitingList;
    private LinkedList<CurrentCourse> prerequisites;
    private LinkedList<Student> enrolledStudents;
    private String time;
    private String days;
    private String building;
    private String room;
    private int totalSeats;
    private int filledSeats;
    private String prer;
    
    
}
