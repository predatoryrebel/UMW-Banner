import java.util.*;
/**
 * Different types of search on a course list returns a course list
 * @author cjoyner
 */
public class SearchCourse {
    /**
     * Constructor
     * @param yourCourseList 
     */
    SearchCourse(LinkedList<CurrentCourse> yourCourseList)
    {
        courseList = yourCourseList;
    }
    
    /**
     * Search for courses by course name
     * @param courseName
     * @return 
     */
    public LinkedList<CurrentCourse> searchCourseByCourseName(String courseName )
    {
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        LinkedList<CurrentCourse> courseNameList = new LinkedList<CurrentCourse>();
        courseName = courseName.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            //adds course with matching name to course name list
            CurrentCourse element = iterator.next();
            if (element.getName().toUpperCase().contains(courseName))
            {
                courseNameList.add(element);
            }
        }
        
        
        return courseNameList; 
        
    }
    /**
     * Search for course by title
     * @param title
     * @return 
     */
     public LinkedList<CurrentCourse> searchCourseByTitle(String title )
    {
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        LinkedList<CurrentCourse> courseTitleList = new LinkedList<CurrentCourse>();
        title = title.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            CurrentCourse element = iterator.next();
            //adds course with matching title to course title list
            if (element.getTitle().toUpperCase().contains(title))
            {
                courseTitleList.add(element);
            }
        }
        
        
        return courseTitleList; 
        
    }
    
     
     /**
      * Search for course by time
      * @param time
      * @return 
      */
     public LinkedList<CurrentCourse> searchCourseByTime(String time )
    {
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        LinkedList<CurrentCourse> courseTimeList = new LinkedList<CurrentCourse>();
        time = time.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            //adds matches to course time list
            CurrentCourse element = iterator.next();
            if (element.getTime().toUpperCase().contains(time))
            {
                courseTimeList.add(element);
            }
        }
        
        
        return courseTimeList; 
        
    }
     /**
      * Search for course by day
      * @param days
      * @return 
      */
     public LinkedList<CurrentCourse> searchCourseByDay(String days )
    {
        ListIterator<CurrentCourse> iterator = courseList.listIterator();
        LinkedList<CurrentCourse> courseDaysList = new LinkedList<CurrentCourse>();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            CurrentCourse element = iterator.next();
            //adds matches to course days list
            if (element.getDays().contains(days))
            {
                courseDaysList.add(element);
            }
        }
        
        
        return courseDaysList; 
        
    } 
     
     
     
    /********DATA MEMBER*********/
    private LinkedList<CurrentCourse> courseList;
}
