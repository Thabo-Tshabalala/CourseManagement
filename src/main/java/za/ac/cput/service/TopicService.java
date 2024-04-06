package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Topic;
import za.ac.cput.repository.TopicRepository;

import java.util.ArrayList;
import java.util.List;

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
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic course) {
        topicRepository.save(course);
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
