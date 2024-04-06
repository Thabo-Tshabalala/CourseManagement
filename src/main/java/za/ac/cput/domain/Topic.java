package za.ac.cput.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import za.ac.cput.util.Helper;

@Entity
public class Topic {
@Id

private String topicId;
private String name;
private String description;

    public Topic() {
    }

    public Topic(String topicId, String name, String description) {
        this.topicId = topicId;
        this.name = name;
        this.description = description;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
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
