package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Course;
import za.ac.cput.repository.CourseRepository;
import za.ac.cput.util.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    //Creates instances of the class when the program starts
    @Autowired
private CourseRepository courseRepository;





    public Course getCourse(String id){

//        return courses.stream().filter( c ->c.getCourseId().equals(id)).findFirst().get();
        return courseRepository.findById(id).orElse(null);

    }

    public void addCourse(Course topic) {
      topic.setCourseId(Helper.generateId());
            courseRepository.save(topic);

        }


    public void updateCourse(String id, Course topic) {
        Optional<Course> existingCourse = courseRepository.findById(id);
        if (existingCourse.isPresent()) {
            Course topicToUpdate = existingCourse.get();
            topicToUpdate.setName(topic.getName());  // Update name and description based on provided ID
            topicToUpdate.setDescription(topic.getDescription());
            courseRepository.save(topicToUpdate);  // Save the updated topic
        } else {

//            throw new RuntimeException("Course not found with ID: " + id);
        }
    }





    public void deleteCourse(String id) {
//        courses.removeIf(c -> c.getCourseId().equals(id));
        courseRepository.deleteById(id);
    }
    public List<Course> getALlCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
}
