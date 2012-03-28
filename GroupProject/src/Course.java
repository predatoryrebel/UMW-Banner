import java.util.*;

public class Course implements  Comparable<Course>{
    
    Course(String aCRN, String aCourse, int aSection, String theTitle, String thePrer, int numCredits, String theTime,
           String theDays, String theBuilding, String theRoom, String theProfessor, int totalSeatNumber, int theFilledSeats ) 
    {
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
                }
            }
        }
    }
    
    public int compareTo(Course a){
        
       return course.compareTo(a.course);
    }
    
    
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
    
    
    
   
    public void addStudent(){
        if (totalSeats != filledSeats)
            filledSeats++;
    }
    
    public void dropStudent(){
        if (filledSeats != 0)
            filledSeats--;
        
    }
    
    public String toString(){
    
        String contents;
        
        contents = crn + " " + course + " " + section + " " + title + " " + prer + " "  + credits + " " + time + " "
                + days + " " + building + " " + room + " " + professor + " " + totalSeats + " " + filledSeats;
        
        return contents;
    }
    
    public void setCRN(String yourCRN)
    {
        crn = yourCRN;
    }
    
    public String getCRN()
    {
        return crn;
    }
    
    public void setName(String courseName)
    {
        course = courseName;
    }    
    
    public String getName()
    {
        return course;
    }
    
    public int getSection()
    {
        return section;
    }
    
    public void setTitle(String yourTitle)
    {
        title = yourTitle;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public LinkedList<Student> getEnrolledStudents()
    {
        return enrolledStudents;
    }
    
    public void setCredits(int yourCredits)
    {
        credits = yourCredits;
    }
    
    public int getCredits()
    {
        return credits;
    }
    
    public void setTime(String yourTime)
    {
        time = yourTime;
    }
    
    public String getTime()
    {
        return time;
    }
    
    public void setDays(String yourDays)
    {
        days = yourDays;
    }
    
    public String getDays()
    {
        return days;
    }
    
    public void setBuilding(String yourBuilding)
    {
        building = yourBuilding;
    }
    
    public String getBuilding()
    {
        return building;
    }
    
    public void setRoom(String yourRoom)
    {
        room = yourRoom;
    }
    
    public String getRoom()
    {
        return room;
    }
    
    public void setProfessor(String yourProfessor)
    {
        professor = yourProfessor;
    }
    
    public String getProfessor()
    {
        return professor;
    }
    
    public void setTotalSeats(int yourTotalSeats)
    {
        if (yourTotalSeats > -1)
        {
            totalSeats = yourTotalSeats;
        }
    }
    
    public int getTotalSeats()
    {
        return totalSeats;
    }
    
    public void setFilledSeats(int yourFilledSeats)
    {
        if (yourFilledSeats > 0 && yourFilledSeats >= getTotalSeats())
        {
            filledSeats = yourFilledSeats;
        }
    }
    
    public int getFilledSeats()
    {
        return filledSeats;
    }
    
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
