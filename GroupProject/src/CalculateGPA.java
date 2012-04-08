import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Calculates a GPA
 * @author cjoyner
 */
public class CalculateGPA {
    /**
     * Constructs an CalculateGPA object with the given parameters
     * @param course 
     */
     
    CalculateGPA(LinkedList<PastCourse> course)
    {
        courseList = course;
    }
    /**
     * calculates a single student's gpa from past course
     * @return double a gpa
     */
    public double calculate()
    {
        double gpa = 0;
        double totalCredits = 0;
        double totalClasses = 0;
        boolean validGPA = false;//used to tell if a student has a gpa
        
        ListIterator<PastCourse> iterator = courseList.listIterator();
        
        //find total credits and total classes from past courses
        while (iterator.hasNext())
        {
            PastCourse course = iterator.next();
            totalCredits = totalCredits + getNumberValue(course.getGrade());
            totalClasses++;
            validGPA = true;
        }
        
        //if false student does not have any past courses
        if (validGPA)
        {
            //calculate gpa
            gpa = totalCredits / totalClasses;
            return gpa;
        }
        else
            return 0;
    }
    
    /**
     * Take a letter grade and converts it into a number grade
     * @param grade letter grade
     * @return double number grade
     */
    private double getNumberValue(String grade)
    {
        //returns number grade that matches a letter grade
        if (grade.equalsIgnoreCase("A"))
            return 4.00;
        else if (grade.equalsIgnoreCase("A-"))
            return 3.67;
        else if (grade.equalsIgnoreCase("B+"))
            return 3.33;
        else if (grade.equalsIgnoreCase("B"))
            return 3.00;
        else if (grade.equalsIgnoreCase("B-"))
            return 2.67;
        else if (grade.equalsIgnoreCase("C+"))
            return 2.33;
        else if (grade.equalsIgnoreCase("C"))
            return 2.00;
        else if (grade.equalsIgnoreCase("C-"))
            return 1.67;
        else if (grade.equalsIgnoreCase("D+"))
            return 1.33;
        else if (grade.equalsIgnoreCase("D"))
            return 1.00;
        else if (grade.equalsIgnoreCase("D-"))
            return 0.67;
        //return 0 if grade doesn't match an above letter
        else
            return 0;
    }
     /********** DATA MEMBER **********/
    private LinkedList<PastCourse> courseList;
}
