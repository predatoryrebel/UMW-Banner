import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException{   
        
        ReadFile start = new ReadFile();
        LinkedList<Course> courseList = new LinkedList<Course>();
        LinkedList<Student> studentList = new LinkedList<Student>();
        LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
        LinkedList<User> userList = new LinkedList<User>();
        courseList = start.readCourseList();
        studentList = start.readStudentList();
        facultyList = start.readFacultyList();
        
        Login login = new Login(studentList, courseList);
        login.setVisible(true);
    } 
}
