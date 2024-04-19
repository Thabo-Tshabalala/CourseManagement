package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Course {
    @OneToOne
   private Topic topic;
@Id

private String courseId;
private String name;
private String description;

    public Course() {
    }

    public Course(String courseId, String name, String description) {
        super();
        this.courseId = courseId;
        this.name = name;
        this.description = description;

    }

    public String getTopicId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
