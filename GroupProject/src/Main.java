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
        LinkedList<Admin> adminList = new LinkedList<Admin>();
        courseList = start.readCourseList();
        studentList = start.readStudentList();
        facultyList = start.readFacultyList();
        adminList = start.readAdminList();
        
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

        ListIterator<Admin> aiterator = adminList.listIterator();

        while (aiterator.hasNext())
        {
            User element = aiterator.next();
            userList.add(element);
        }
        
         siterator = studentList.listIterator(0);
        //adds courses to a student
        while (siterator.hasNext())
        {
            Student element = siterator.next();
            element.buildCurrentScudule(courseList);
        }

        ListIterator<Course> citerator = courseList.listIterator();
        //adds students to a course
        while (citerator.hasNext())
        {
            Course element = citerator.next();
            element.buildEnrolledStudents(studentList);
        }
        
        fiterator = facultyList.listIterator(0);
        //adds courses to faculty member 
        while (fiterator.hasNext())
        {
            Faculty element = fiterator.next();
            element.buildCourseList(courseList);
        }
        
       

        /* Create a new backup object that wil automaticaly backup an interval
         * which is the fourth parameter
         */

        Backup backup = new Backup(courseList, studentList, facultyList, adminList);

        

        // Create MainGUI here and pass Login parameters to it
        MainGUI mainWindow = new MainGUI(studentList, courseList, facultyList, userList, adminList);
        mainWindow.setVisible(true);

        backup.backupAll(courseList, studentList, facultyList, adminList);
        System.out.println("BACKED UP");
       

        
    }




}

