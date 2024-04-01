package za.ac.cput.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.domain.Course;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topic {
@RequestMapping("/topics")
    public List<Course> getALlTopics(){
        return Arrays.asList(
                new Course("ADP3503","Application Development Practice 3","Java SpringBoot"),
    new Course("ADF203","Application Development Fundamental 3","Data Structures"),
    new Course("ADT001","Application Development  Theory 3","Software Engineering"));

    }
}
