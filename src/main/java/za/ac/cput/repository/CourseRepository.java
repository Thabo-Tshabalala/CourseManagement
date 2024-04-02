package za.ac.cput.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.domain.Course;

public interface CourseRepository extends CrudRepository<Course,String> {



}
