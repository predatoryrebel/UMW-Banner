import java.util.*;
public class SearchCourse {
    
    SearchCourse(LinkedList<Course> yourCourseList)
    {
        courseList = yourCourseList;
    }
    
    public LinkedList<Course> searchCourseByCourseName(String courseName )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseNameList = new LinkedList<Course>();
        courseName = courseName.toUpperCase();
        
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            if (element.getName().toUpperCase().contains(courseName))
            {
                courseNameList.add(element);
            }
        }
        
        
        return courseNameList; 
        
    }
    
     public LinkedList<Course> searchCourseByTitle(String title )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseTitleList = new LinkedList<Course>();
        title = title.toUpperCase();
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            if (element.getTitle().toUpperCase().contains(title))
            {
                courseTitleList.add(element);
            }
        }
        
        
        return courseTitleList; 
        
    }
    
     public LinkedList<Course> searchCourseByTimeAndDay(String time, String days )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseTimeAndDayList = new LinkedList<Course>();
        
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            if (element.getTime().contains(time) && element.getDays().contains(days))
            {
                courseTimeAndDayList.add(element);
            }
        }
        
        
        return courseTimeAndDayList; 
        
    } 
     
     public LinkedList<Course> searchCourseByTime(String time )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseTimeList = new LinkedList<Course>();
        time = time.toUpperCase();
        
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            if (element.getTime().toUpperCase().contains(time))
            {
                courseTimeList.add(element);
            }
        }
        
        
        return courseTimeList; 
        
    }
     
     public LinkedList<Course> searchCourseByDay(String days )
    {
        ListIterator<Course> iterator = courseList.listIterator();
        LinkedList<Course> courseDaysList = new LinkedList<Course>();
        
        while (iterator.hasNext())
        {
            Course element = iterator.next();
            if (element.getDays().contains(days))
            {
                courseDaysList.add(element);
            }
        }
        
        
        return courseDaysList; 
        
    } 
     
     
     
    
    private LinkedList<Course> courseList;
}
