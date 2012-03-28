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
    
    Course(String courseName)
    {
        course = courseName;
    }
    
    public void buildEnrolledStudents(LinkedList<Student> studentList)
    {
        ListIterator<Student> iterator = studentList.listIterator();
        
        while (iterator.hasNext())
        {
            Student person = iterator.next();
            LinkedList<Course> checkForStudent = person.currentSchudule;
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
    
    public void addStudent(){
        if (totalSeats != filledSeats)
            filledSeats++;
    }
    
    public void dropStudent(){
        if (filledSeats != 0)
            filledSeats--;
        
    }
    
    public void setName(String courseName)
    {
        course = courseName;
    }    
    
    
    public String backup(){
    
        String contents;
        
        contents = crn + "," + course + "," + section + "," + title + "," + prer + ","  + credits + "," + time + ","
                + days + "," + building + "," + room  + "," + totalSeats + "," + filledSeats + "," + professor +"\n";
        
        return contents;
    }
    
    String crn;
    String course;
    int section;
    String title;
    String prer;
    LinkedList<Course> prerequisites;
    LinkedList<Student> enrolledStudents;
    int credits;
    String time;
    String days;
    String building;
    String room;
    String professor;
    Course next;
    int totalSeats;
    int filledSeats;

    
}
