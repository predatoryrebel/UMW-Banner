import java.io.*;
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

        
        systemBackup(courseList, studentList, facultyList);
   
    }



            /***************************************************/

        public static int systemBackup(final LinkedList<Course> courseList, final LinkedList<Student> studentList, final LinkedList<Faculty> facultyList){
            //studentList
            //faculty
            ListIterator<Course> iterator = courseList.listIterator();

            System.out.println("BACKING UP!!");

            try {
            BufferedWriter out = new BufferedWriter(new FileWriter("courselist.csv.tmp"));



                while (iterator.hasNext()) {
                    Course element = iterator.next();
                    out.write(element.backup());
                }

                out.close();
        } catch (IOException e) {
        }

        /* Rename the current readin file */

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
        File file33 = new File("courselist.csv.tmp");

        // File (or directory) with new name
        File file23 = new File("courselist.csv");

        // Rename file (or directory)
        boolean success2 = file33.renameTo(file23);
        if (!success) {
            // File was not successfully renamed
        }

        System.out.println();

        ListIterator<Student> iteratorStudent = studentList.listIterator();
        try {
        BufferedWriter out = new BufferedWriter(new FileWriter("studentList.csv.tmp"));

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
            }
            catch (IOException e){

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




            return 0;

        }


}
