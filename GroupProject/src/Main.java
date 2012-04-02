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
<<<<<<< HEAD
        
        siterator = studentList.listIterator(0);
        
        while (siterator.hasNext())
        {
            Student element = siterator.next();
            element.buildCurrentScudule(courseList);
        }
               
        // Create MainGUI here and pass Login parameters to it
        MainGUI mainWindow = new MainGUI(studentList, courseList, facultyList, userList);
        mainWindow.setVisible(true);
        
        //Login login = new Login(studentList, courseList, facultyList, userList);
        //login.setVisible(true);

        /* Create timer and set to backup every ten mins */
        ActionListener listener = new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
                
                //PROBLEM HERE - WORKING ON IT
                //systemBackup(courseList, studentList, facultyList);
            }
         };
=======
>>>>>>> 90d43d4647ee8f731df59e8de8bf24c80541b03b

        Backup backup = new Backup(courseList, studentList, facultyList);
               
        // Create MainGUI here and pass Login parameters to it
        MainGUI mainWindow = new MainGUI(studentList, courseList, facultyList, userList);
        mainWindow.setVisible(true);

        
    }
<<<<<<< HEAD
    
    private static int systemBackup(LinkedList<Course> courseList, LinkedList<Student> studentList, LinkedList<Faculty> facultyList){

           /******** BACKUP STUDENTLIST.CSV ***********/
            ListIterator<Course> iterator = courseList.listIterator();

            /* Try to write out to file, if can't ctch IOException*/
            try {

                /* Declare and intanitate a new bffered writer named out */
                BufferedWriter out = new BufferedWriter(new FileWriter("courselist.csv.tmp"));

                /* While the list isn't empty */
                while (iterator.hasNext()) {

                    /* Temporarily store the element */
                    Course element = iterator.next();

                    /* Write the comma delimited backup method result to file */
                    out.write(element.backup());
                }

                /* Close the file */
                out.close();

        /* Catch an IOException */
        } catch (IOException e) {
        }
        /******** END BACKUP STUDENTLIST.CSV ***********/

        /****** Rename the current coureList.csv file *****/

            // File (or directory) with old name
            File file = new File("courselist.csv");

            // File (or directory) with new name
            File file2 = new File("courselist.csv.bak");

            // Rename file (or directory)
            boolean success = file.renameTo(file2);
            if (!success) {
                 // File was not successfully renamed
            }
            file.delete();

            /* Rename the temp file we made to courselist.csv */

            // File (or directory) with old name
            file = new File("courselist.csv.tmp");

            // File (or directory) with new name
            file2 = new File("courselist.csv");

            // Rename file (or directory)
            boolean success2 = file.renameTo(file2);
            if (!success) {
                // File was not successfully renamed
            }

        /******** END RENAME COURSELIST.CSV *********/

        /******** BACKUP STUDENTLIST.CSV ***********/

            /* Declare a new student iterator */
            ListIterator<Student> iteratorStudent = studentList.listIterator();

            /* Try to create a file */
            try {

            /* Declare and instantiate a new Buffered writer for studentList.csv.temp */
            BufferedWriter out = new BufferedWriter(new FileWriter("studentList.csv.tmp"));

                /* While there are still students */
                while (iteratorStudent.hasNext()){

                    /* Temporarily store the element */
                    Student element = iteratorStudent.next();

                    /* Write the comma delimited backup method reult out to a file */
                    out.write(element.backup());

               }
           }
           /* Else if we can't create the file throw xception */
          catch (IOException e){

          }

        /******** END BACKUP STUDENTLIST.CSV *********/

        /****** Rename the current courseList.csv file *****/

            // File (or directory) with old name
            file = new File("studentList.csv");

            // File (or directory) with new name
            file2 = new File("studentList.csv.bak");

            // Rename file (or directory)
            success = file.renameTo(file2);
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

        /******** END RENAME COURSELIST.CSV *********/

        /******** END BACKUP STUDENTLIST.CSV *********/

            ListIterator<Faculty> iteratorFaculty = facultyList.listIterator();

            try{

            /* Make a buffered file writer with a tmp file facultyList.csv.tmp */
            BufferedWriter out = new BufferedWriter(new FileWriter("facultyList.csv.tmp"));

                /* For each faculty member */
                while(iteratorFaculty.hasNext())
                {
                    /* Temporarily store them in a variable */
                    Faculty element = iteratorFaculty.next();

                    /* And write the backup out to the file */
                    out.write(element.backup());

                }

            }catch (IOException e){

            }

        /****** Rename the current facultyList.csv file *****/

            // File (or directory) with old name
            file = new File("facultyList.csv");

            // File (or directory) with new name
            file2 = new File("facultyList.csv.bak");

            // Rename file (or directory)
            success = file.renameTo(file2);
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
=======
   
>>>>>>> 90d43d4647ee8f731df59e8de8bf24c80541b03b
}

