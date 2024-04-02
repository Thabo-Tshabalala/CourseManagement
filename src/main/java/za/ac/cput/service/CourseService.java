package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Course;
import za.ac.cput.repository.CourseRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    //Creates instances of the class when the program starts
    @Autowired
private CourseRepository courseRepository;
    List<Course>  courses = new ArrayList<> (Arrays.asList( new Course("ADP3","Application Development Practice 3","Java SpringBoot"),
    new Course("ADF3","Application Development Fundamental 3","Data Structures"),
    new Course("ADT3","Application Development  Theory 3","Software Engineering")));


    public List<Course> getALlCourses(){
        List<Course> courses = new ArrayList<>();
         courseRepository.findAll().forEach(courses::add);
         return courses;
    }

    public Course getCourse(String id){

//        return courses.stream().filter( c ->c.getCourseId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);

    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
        courseRepository.save(course);
            }




    public void deleteCourse(String id) {
//        courses.removeIf(c -> c.getCourseId().equals(id));
        courseRepository.deleteById(id);
    }
}
