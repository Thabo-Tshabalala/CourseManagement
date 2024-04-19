package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import za.ac.cput.domain.Course;
import za.ac.cput.service.CourseService;

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
        @RequestMapping("/topics/{topicId}/courses/{id}")
        public Course getCourse(@PathVariable String id){

            return courseService.getCourse(id);
        }
        @PostMapping( "/courses/{topicId}/courses/{id}")
        public void addCourse(@RequestBody Course course){
            courseService.addCourse( course);

        }
        @PutMapping( "/courses/{id}")
        public void updateCourse(@RequestBody Course course,@PathVariable String id){
            courseService.updateCourse(id, course);

        }
        @DeleteMapping ("/courses/{id}")
        public void deleteCourse(@PathVariable String id){
            courseService.deleteCourse(id);

        }
    }

