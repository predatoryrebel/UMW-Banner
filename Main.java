import java.io.*;
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
        
       // Login login = new Login(studentList, courseList);
        //login.setVisible(true);
    }

    public static int systemBackup(final LinkedList<Course> courseList, final LinkedList<Student> studentList, final LinkedList<Faculty> facultyList){

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

        /******** RENAME STUDENTLIST.CSV ***********/

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
                    out.write((element.backup()));

               }
           }
           /* Else if we can't create the file throw xception */
          catch (IOException e){

          }

        /******** END RENAME STUDENTLIST.CSV *********/

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
                System.out.println(courseElement.getEnrolledStudents().toString());
            }
            System.out.println();
        }




            return 0;

        }
}

