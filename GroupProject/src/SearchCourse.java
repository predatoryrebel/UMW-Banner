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
    SearchCourse(LinkedList<Course> yourCourseList)
    {
        courseList = yourCourseList;
    }
    
    /**
     * Search for courses by course name
     * @param courseName
     * @return 
     */
    public LinkedList<Course> searchCourseByCourseName(String courseName )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseNameList = new LinkedList<Course>();
        courseName = courseName.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            //adds course with matching name to course name list
            Course element = iterator.next();
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
     public LinkedList<Course> searchCourseByTitle(String title )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseTitleList = new LinkedList<Course>();
        title = title.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            Course element = iterator.next();
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
     public LinkedList<Course> searchCourseByTime(String time )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseTimeList = new LinkedList<Course>();
        time = time.toUpperCase();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            //adds matches to course time list
            Course element = iterator.next();
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
     public LinkedList<Course> searchCourseByDay(String days )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseDaysList = new LinkedList<Course>();
        //goes though course list to find match
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            //adds matches to course days list
            if (element.getDays().contains(days))
            {
                courseDaysList.add(element);
            }
        }
        
        
        return courseDaysList; 
        
    } 
     
     
     
    /********DATA MEMBER*********/
    private LinkedList<Course> courseList;
}
