package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
    //Creates instances of the class when the program starts

    List<Course>  courses = new ArrayList<> (Arrays.asList( new Course("ADP3","Application Development Practice 3","Java SpringBoot"),
    new Course("ADF3","Application Development Fundamental 3","Data Structures"),
    new Course("ADT3","Application Development  Theory 3","Software Engineering")));


    public List<Course> getALlCourses(){
        return  courses;
    }

    public Course getCourse(String id){

        return courses.stream().filter( c ->c.getCourseId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourse(String id, Course course) {
        for (int i =0; i<courses.size(); i++){
            Course c = courses.get(i);
            if(c.getCourseId().equals(id)){
                courses.set(i,course);
                return;
            }
        }
    }
}
