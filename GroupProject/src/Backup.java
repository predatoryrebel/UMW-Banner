/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/* Import Statements */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.Timer;

/**
 *
 * @author Bradley Ruggiero
 * @version 1.0
 * @since
 */
public class Backup {

    Backup(final LinkedList<Course> courses, final LinkedList<Student> students, final LinkedList<Faculty> faculty, final LinkedList<Admin> admin, final int backupTime){
        
        setCourses(courses);
        setStudents(students);
        setFaculty(faculty);
        setAdmin(admin);

        /* time = backupTime;

                ActionListener listener = new
             ActionListener()
             {
                public void actionPerformed(ActionEvent event)
                {
                    backupAll();
                 
                }
             };

          int DELAY = (time * (60 * 1000));
             // Milliseconds between timer ticks
          Timer t = new Timer(DELAY, listener);
          t.start();
        */

    }

    Backup (final LinkedList<Course> courses, final LinkedList<Student> students, final LinkedList<Faculty> faculty, final LinkedList<Admin> admin){
        
        setCourses(courses);
        setStudents(students);
        setFaculty(faculty);
        setAdmin(admin);

       /*         ActionListener listener = new
             ActionListener()
             {
                public void actionPerformed(ActionEvent event)
                {
                    backupAll();
                    
                }
             };

          int DELAY = (2 * (60 * 1000));
             // Milliseconds between timer ticks
          Timer t = new Timer(DELAY, listener);
          t.start();

*/

    }

    Backup(){}

    public int backupFaculty(final LinkedList<Faculty> faculty){

         /******** BACKUP FACULTYLIST.CSV *********/

            setFaculty(faculty);

            ListIterator<Faculty> iteratorFaculty = facultyList.listIterator();

            try{

            /* Make a buffered file writer with a tmp file facultyList.csv.tmp */
            BufferedWriter out2 = new BufferedWriter(new FileWriter("facultyList.csv.tmp"));

                /* For each faculty member */
                while(iteratorFaculty.hasNext())
                {
                    /* Temporarily store them in a variable */
                    Faculty element = iteratorFaculty.next();

                    /* And write the backup out to the file */
                    out2.write(element.backup());
                    out2.flush();

                }

            }catch (IOException e){

            }

        /****** Rename the current facultyList.csv file *****/

            // File (or directory) with old name
            File file = new File("facultyList.csv");

            // File (or directory) with new name
            File file2 = new File("facultyList.csv.bak");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);
            if (!success) {
                 // File was not successfully renamed
            }
            file.delete();

            /* Rename the temp file we made to courselist.csv */

            // File (or directory) with old name
            file = new File("facultyList.csv.tmp");

            // File (or directory) with new name
            file2 = new File("facultyList.csv");

            // Rename file (or directory)
            success = file.renameTo(file2);
            if (!success) {
                // File was not successfully renamed
            }

        /******** END RENAME FACULTYLIST.CSV *********/

            return 0;
    }

    public int backupAdmin(final LinkedList<Admin> admin){

         /******** BACKUP ADMINLIST.CSV *********/

            setAdmin(admin);

            ListIterator<Admin> iteratorAdmin = adminList.listIterator();

            try{

            /* Make a buffered file writer with a tmp file facultyList.csv.tmp */
            BufferedWriter out2 = new BufferedWriter(new FileWriter("adminList.csv.tmp"));

                /* For each faculty member */
                while(iteratorAdmin.hasNext())
                {
                    /* Temporarily store them in a variable */
                    Admin element = iteratorAdmin.next();

                    /* And write the backup out to the file */
                    out2.write(element.backup());
                    out2.flush();

                }

            }catch (IOException e){

            }

        /****** Rename the current adminList.csv file *****/

            // File (or directory) with old name
            File file = new File("adminList.csv");

            // File (or directory) with new name
            File file2 = new File("adminList.csv.bak");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);
            if (!success) {
                 // File was not successfully renamed
            }
            file.delete();

            /* Rename the temp file we made to courselist.csv */

            // File (or directory) with old name
            file = new File("adminList.csv.tmp");

            // File (or directory) with new name
            file2 = new File("adminList.csv");

            // Rename file (or directory)
            success = file.renameTo(file2);
            if (!success) {
                // File was not successfully renamed
            }

        /******** END RENAME ADMINLIST.CSV *********/

            return 0;
    }

    public int backupStudents(final LinkedList<Student> students){

        /******** BACKUP STUDENTLIST.CSV ***********/

            setStudents(students);

            /* Declare a new student iterator */
            ListIterator<Student> iteratorStudent = studentList.listIterator();

            /* Try to create a file */
            try {

            /* Declare and instantiate a new Buffered writer for studentList.csv.temp */
            BufferedWriter out1 = new BufferedWriter(new FileWriter("studentList.csv.tmp"));

                /* While there are still students */
                while (iteratorStudent.hasNext()){

                    /* Temporarily store the element */
                    Student element = iteratorStudent.next();

                    /* Write the comma delimited backup method reult out to a file */
                    out1.write(element.backup());
                    out1.flush();

               }
           }
           /* Else if we can't create the file throw xception */
          catch (IOException e){

          }

        /******** END BACKUP STUDENTLIST.CSV *********/

        /****** Rename the current studentlist.csv file *****/

            // File (or directory) with old name
            File file = new File("studentList.csv");

            // File (or directory) with new name
            File file2 = new File("studentList.csv.bak");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);
            if (!success) {
                 // File was not successfully renamed
            }
            file.delete();

            /* Rename the temp file we made to courselist.csv */

            // File (or directory) with old name
            file = new File("studentList.csv.tmp");

            // File (or directory) with new name
            file2 = new File("studentList.csv");

            // Rename file (or directory)
            success = file.renameTo(file2);
            if (!success) {
                // File was not successfully renamed
            }

        /******** END RENAME STUDENTLIST.CSV *********/

            return 0;

    }

    public int backupCourses(final LinkedList<Course> courses){

            setCourses(courses);


           /******** BACKUP courselist.CSV ***********/
            ListIterator<Course> iterator = courseList.listIterator();

            /* Try to write out to file, if can't ctch IOException*/
            try {

                /* Declare and intanitate a new bffered writer named out */
                BufferedWriter out = new BufferedWriter(new FileWriter("courseList.csv.tmp"));

                /* While the list isn't empty */
                while (iterator.hasNext()) {

                    /* Temporarily store the element */
                    Course element = iterator.next();

                    /* Write the comma delimited backup method result to file */
                    out.write(element.backup());
                    out.flush();
                }

                /* Close the file */
                out.close();

        /* Catch an IOException */
        } catch (IOException e) {
        }
        /******** END BACKUP STUDENTLIST.CSV ***********/

        /****** Rename the current coureList.csv file *****/

            // File (or directory) with old name
            File file = new File("courseList.csv");

            // File (or directory) with new name
            File file2 = new File("courseList.csv.bak");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);
            if (!success) {
                 // File was not successfully renamed
            }
            file.delete();

            /* Rename the temp file we made to courselist.csv */

            // File (or directory) with old name
            file = new File("courseList.csv.tmp");

            // File (or directory) with new name
            file2 = new File("courseList.csv");

            // Rename file (or directory)
            boolean success2 = file.renameTo(file2);
            if (!success) {
                // File was not successfully renamed
            }

        /******** END RENAME COURSELIST.CSV *********/

            return 0;
    }


    public int backupAll(final LinkedList<Course> courses, final LinkedList<Student> students, final LinkedList<Faculty> faculty, final LinkedList<Admin> admin){

        setCourses(courses);
        setStudents(students);
        setFaculty(faculty);
        setAdmin(admin);


        /* Some temp variables and initialize them to something outside the return scope */
        int x = -999;
        int y = -999;
        int z = -999;
        int w = -999;


        /* Call each method of this class to backup each list and store
         * the result in the temp variables
         */
        x = this.backupCourses(courses);
        y = this.backupFaculty(faculty);
        z = this.backupStudents(students);
        w = this.backupAdmin(admin);

        /* If any variable isn't equal to zero than we know the backup script
         * failed to execute sucessfully
         */
        if ((x != 0) || (y != 0) || z != 0 || w != 0){

            /* So return a -1 */
            return -1;
        }
        else{

            /* We have sucess so return a zero */
            return 0;
        }


    }

    private void setCourses(LinkedList<Course> list){

        courseList = list;
    }

    private void setStudents(LinkedList<Student> list){

        studentList = list;
    }

    private void setFaculty(LinkedList<Faculty> list){

        facultyList = list;
    }
    private void setAdmin(LinkedList<Admin> list){

        adminList = list;
    }
/************ DATA MEMBERS *****************/

private int time = 0;

private LinkedList<Course> courseList;
private LinkedList<Student> studentList;
private LinkedList<Faculty> facultyList;
private LinkedList<Admin> adminList;




}




