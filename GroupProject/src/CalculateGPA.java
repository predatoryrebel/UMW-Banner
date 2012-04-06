
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Calculates a GPA
 * @author cjoyner
 */
public class CalculateGPA {
     
    CalculateGPA(LinkedList<PastCourse> course)
    {
        courseList = course;
    }
    
    public double calculate()
    {
        double gpa = 0;
        double totalCredits = 0;
        double totalClasses = 0;
        boolean validGPA = false;
        
        ListIterator<PastCourse> iterator = courseList.listIterator();
        
        //find total credits and total classes
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
    
    private double getNumberValue(String grade)
    {
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
        else
            return 0;
    }
    
    private LinkedList<PastCourse> courseList;
}
