package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Topic;
import za.ac.cput.service.TopicService;
import za.ac.cput.service.TopicService;

import java.util.List;

@RestController
public class TopicController {

@Autowired
private TopicService topicService;
    // It's a singleton,
@RequestMapping("/topics")
    public List<Topic> getALlTopics(){
        return topicService.getALlTopics();

    }
@RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){

    return topicService.getTopic(id);
    }
    @PostMapping( "/topics")
    public void addTopic(@RequestBody Topic topic){
    topicService.addTopic( topic);

    }
@PutMapping( "/topics/{id}")
public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
topicService.updateTopic(id,topic);
}
    @DeleteMapping ("/topics/{id}")
    public void deleteTopic(@PathVariable String id){
         topicService.deleteTopic(id);

    }
}
