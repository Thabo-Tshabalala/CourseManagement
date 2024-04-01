package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.domain.Course;
import za.ac.cput.service.CourseService;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

@Autowired
private CourseService courseService;
    // It's a singleton,
@RequestMapping("/courses")
    public List<Course> getALlCourses(){
        return courseService.getALlCourses();

    }
@RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id){

    return courseService.getCourse(id);
    }
}
