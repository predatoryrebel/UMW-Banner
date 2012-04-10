
import java.io.*;
import java.util.*;

public class ReadFile{
    
    ReadFile()
    {
        
    }
    
    public LinkedList<Faculty> readFacultyList()throws FileNotFoundException{
        FileInputStream fstream = new FileInputStream("facultyList.csv");
        LinkedList<Faculty> facultyList = new LinkedList<Faculty>();
        Scanner input = new Scanner(fstream);
        input.useDelimiter(",");
        
        try
        {
            while (input.hasNext())
            {
                String firstName = input.next();
                String lastName = input.next();
                String userName = input.next();
                String password = input.next();
                String email = input.next();
                String office = input.next();
                String phoneNumber = input.nextLine();
                
                Faculty newFaculty = new Faculty(userName, password, email, firstName, lastName, office, phoneNumber);
                
                facultyList.add(newFaculty);
            }
            fstream.close();
        }
        catch (Exception e)
        {
            facultyList = null;
        }
        
        Collections.sort(facultyList);
        
        return facultyList;
    }
    
    public LinkedList<Student> readStudentList() throws FileNotFoundException{
        FileInputStream fstream = new FileInputStream("studentList.csv");
        LinkedList<Student> studentList = new LinkedList<Student>();
        Scanner input = new Scanner(fstream);
        input.useDelimiter(",");
        
        try
        {
            while (input.hasNext())
            {
                String idNumber = input.next();
                String firstName = input.next();
                String lastName = input.next();
                String userName = input.next();
                String password = input.next();
                String email = input.next();
                String major = input.next();
                String minor = input.next();
                int approvedCredits = input.nextInt();
                int creditHoursEnrolled = input.nextInt();
                String currentSchudule = input.next();
                String hold = input.nextLine();
                hold = hold.substring(1, hold.length());
                
                boolean holds;
                if (hold.equalsIgnoreCase("True"))
                    holds = true;
                else
                    holds = false;
                    
                Student newStudent = new Student(idNumber,firstName,lastName, userName,password,email,major,minor,approvedCredits,creditHoursEnrolled,
                        currentSchudule, holds);
                
                studentList.add(newStudent);
                
                 fstream.close();
            }
        }
        catch (Exception e)
        {
            studentList = null;
        }    
        
       
       Collections.sort(studentList);
        
        return studentList;
    }
            
    public LinkedList<CurrentCourse> readCourseList() throws FileNotFoundException{
        FileInputStream fstream = new FileInputStream("courseList.csv");
        LinkedList<CurrentCourse> courseList = new LinkedList<CurrentCourse>();
        Scanner input = new Scanner(fstream);

        input.useDelimiter(",");
        try
        {
            while (input.hasNextLine())
            {

                String crn;
                crn = input.next();
                String course = input.next();
                int section = input.nextInt();
                String title = input.next();
                String prer = input.next();
                int credits = input.nextInt();
                String time = input.next();
                String days = input.next();
                String building = input.next();
                String room = input.next();
                int totalSeats = input.nextInt();
                int filledSeats = input.nextInt();
                String tempWaiting = input.next();
                String professor = input.nextLine();
                professor = professor.substring(1, professor.length());
                
                CurrentCourse newCourse = new CurrentCourse(crn, course, section, title, prer,credits, time, days, building, room, professor,
                    totalSeats, filledSeats, tempWaiting);
                     
                courseList.add(newCourse);
                     
                fstream.close(); 
                }
            }
            catch (Exception e)
            {
                courseList = null;
            }
        
            
            
            Collections.sort(courseList);

               
       
            return courseList;
    }
    
    public LinkedList<PastCourse> readPastCourseList() throws FileNotFoundException{
        FileInputStream fstream = new FileInputStream("pastCourses.csv");
        LinkedList<PastCourse> courseList = new LinkedList<PastCourse>();
        Scanner input = new Scanner(fstream);

        input.useDelimiter(",");
        try
        {
            while (input.hasNextLine())
            {

                String crn;
                crn = input.next();
                String course = input.next();
                int section = input.nextInt();
                String title = input.next();
                int credits = input.nextInt();
                String professor = input.next();
                String grade = input.next();
                String user = input.nextLine();
                user = user.substring(1, user.length());
                
                PastCourse pastCourse = new PastCourse(crn, course, section, title, credits, professor, grade, user);
                     
                courseList.add(pastCourse);
                     
                fstream.close(); 
                }
            }
            catch (Exception e)
            {
                courseList = null;
            }
        
            
            
            Collections.sort(courseList);

               
       
            return courseList;
    }
    
    /**
     * The read admin list reads in admin objects from a readfile
     * @return
     * @throws FileNotFoundException
     */
    public LinkedList<Admin> readAdminList()throws FileNotFoundException{
        FileInputStream fstream = new FileInputStream("adminList.csv");
        LinkedList<Admin> adminList = new LinkedList<Admin>();
        Scanner input = new Scanner(fstream);
        input.useDelimiter(",");

        try
        {
            while (input.hasNext())
            {
                String firstName = input.next();
                String lastName = input.next();
                String userName = input.next();
                String password = input.next();
                String email = input.next();
                String office = input.next();
                String phoneNumber = input.nextLine();

                Admin newAdmin = new Admin(userName, password, email, firstName, lastName, office, phoneNumber);

                adminList.add(newAdmin);
            }
            fstream.close();
        }
        catch (Exception e)
        {
            adminList = null;
        }

        Collections.sort(adminList);

        return adminList;
    }

}
