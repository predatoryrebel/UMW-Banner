import java.io.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        ReadFile start = new ReadFile();
        LinkedList<CurrentCourse> courseList = new LinkedList<CurrentCourse>();
        LinkedList<Student> studentList = new LinkedList<Student>();
        LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
        LinkedList<User> userList = new LinkedList<User>();
        LinkedList<Admin> adminList = new LinkedList<Admin>();
        LinkedList<PastCourse> pastCourseList = new LinkedList<PastCourse>();
        courseList = start.readCourseList();
        studentList = start.readStudentList();
        facultyList = start.readFacultyList();
        adminList = start.readAdminList();
        pastCourseList = start.readPastCourseList();
        
        
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

        ListIterator<CurrentCourse> citerator = courseList.listIterator();
        //adds students to a course
        while (citerator.hasNext())
        {
            CurrentCourse element = citerator.next();
            element.buildEnrolledStudents(studentList);
        }
        
        fiterator = facultyList.listIterator(0);
        //adds courses to faculty member 
        while (fiterator.hasNext())
        {
            Faculty element = fiterator.next();
            element.buildCourseList(courseList);
        }
        
        //add past course to students
        siterator = studentList.listIterator(0);
        while (siterator.hasNext())
        {
            Student student = siterator.next();
            ListIterator<PastCourse> pastIterator = pastCourseList.listIterator();
            while (pastIterator.hasNext())
            {
                PastCourse past = pastIterator.next();
                if (past.getUser().equalsIgnoreCase(student.getUserName()))
                {
                    student.getPastCourses().add(past);
                }
            }
           
        }
        
        siterator = studentList.listIterator(0);
        while (siterator.hasNext())
        {
            Student student = siterator.next();
            CalculateGPA findGPA = new CalculateGPA(student.getPastCourses());
            student.setGPA(findGPA.calculate());
        }
       

        /* Create a new backup object that wil automaticaly backup an interval
         * which is the fourth parameter
         */

        Backup backup = new Backup(courseList, studentList, facultyList, adminList, pastCourseList);

        

        // Create MainGUI here and pass Login parameters to it
        MainGUI mainWindow = new MainGUI(studentList, courseList, facultyList, userList, adminList, pastCourseList);
        mainWindow.setVisible(true);

        backup.backupAll(courseList, studentList, facultyList, adminList, pastCourseList);
        System.out.println("BACKED UP");
       

        
    }




}

