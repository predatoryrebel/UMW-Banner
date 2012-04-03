import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        ReadFile start = new ReadFile();
        LinkedList<Course> courseList = new LinkedList<Course>();
        LinkedList<Student> studentList = new LinkedList<Student>();
        LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
        LinkedList<User> userList = new LinkedList<User>();
        courseList = start.readCourseList();
        studentList = start.readStudentList();
        facultyList = start.readFacultyList();
        
        ListIterator<Student> siterator = studentList.listIterator();
        
        while (siterator.hasNext())
        {
            User element = siterator.next();
            userList.add(element);
        }
        
        ListIterator<Faculty> fiterator = facultyList.listIterator();
        
        while (fiterator.hasNext())
        {
            User element = fiterator.next();
            userList.add(element);
        }

        
        siterator = studentList.listIterator(0);
        
        while (siterator.hasNext())
        {
            Student element = siterator.next();
            element.buildCurrentScudule(courseList);
        }


        /* Create a new backup object that wil automaticaly backup an interval
         * which is the fourth parameter
         */
        Backup backup = new Backup(courseList, studentList, facultyList, 1);



        // Create MainGUI here and pass Login parameters to it
        MainGUI mainWindow = new MainGUI(studentList, courseList, facultyList, userList);
        mainWindow.setVisible(true);
       

        
    }
   

}

