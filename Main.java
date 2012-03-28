import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException{   
        
        ReadFile start = new ReadFile();
        LinkedList<Course> courseList = new LinkedList<Course>();
        LinkedList<Student> studentList = new LinkedList<Student>();
        LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
        courseList = start.readCourseList();
        studentList = start.readStudentList();
        facultyList = start.readFacultyList();
                
        ListIterator<Course> iterator = courseList.listIterator();
    
        while (iterator.hasNext()) {
            Course element = iterator.next();
            System.out.println(element.toString());
        }
        System.out.println();
        
        ListIterator<Student> iteratorStudent = studentList.listIterator();
        
        while (iteratorStudent.hasNext())
        {
            Student element = iteratorStudent.next();
            System.out.println(element.toString());
            element.buildCurrentScudule(courseList);
            iterator = element.currentSchudule.listIterator(0);
            while (iterator.hasNext())
            {
                Course courseElement = iterator.next();
                System.out.println(courseElement.toString());
            }
            System.out.println();
        }
        
        iterator = courseList.listIterator(0);
        
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            element.buildEnrolledStudents(studentList);
        }
        
        ListIterator<Faculty> iteratorFaculty = facultyList.listIterator();
        
        while(iteratorFaculty.hasNext())
        {
            Faculty element = iteratorFaculty.next();
            System.out.println(element.toString());
            element.buildCourseList(courseList);
            iterator = element.courses.listIterator(0);
            while (iterator.hasNext())
            {
                Course courseElement = iterator.next();
                System.out.println(courseElement.toString());
                System.out.println(courseElement.enrolledStudents.toString());
            }
            System.out.println();
        }
        
   
    } 
}
