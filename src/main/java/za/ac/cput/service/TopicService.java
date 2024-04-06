package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Topic;
import za.ac.cput.repository.TopicRepository;
import za.ac.cput.util.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    //Creates instances of the class when the program starts
    @Autowired
private TopicRepository topicRepository;





    public Topic getTopic(String id){

//        return topics.stream().filter( c ->c.getTopicId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);

    }

    public void addTopic(Topic topic) {
      topic.setTopicId(Helper.generateId());
            topicRepository.save(topic);

        }


    public void updateTopic(String id, Topic topic) {
        Optional<Topic> existingTopic = topicRepository.findById(id);
        if (existingTopic.isPresent()) {
            Topic topicToUpdate = existingTopic.get();
            topicToUpdate.setName(topic.getName());  // Update name and description based on provided ID
            topicToUpdate.setDescription(topic.getDescription());
            topicRepository.save(topicToUpdate);  // Save the updated topic
        } else {

//            throw new RuntimeException("Topic not found with ID: " + id);
        }
    }





    public void deleteTopic(String id) {
//        topics.removeIf(c -> c.getTopicId().equals(id));
        topicRepository.deleteById(id);
    }
    public List<Topic> getALlTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
}
