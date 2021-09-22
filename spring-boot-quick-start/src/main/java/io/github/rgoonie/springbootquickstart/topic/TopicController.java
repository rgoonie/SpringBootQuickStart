package io.github.rgoonie.springbootquickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    /**
     * Gets all topic in DB
     * @return List of topics
     */
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    /**
     * Gets a topic based on the id provided
     * @param id the id of the topic
     * @return return topic from DB if exists
     */
    @GetMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void createTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping("/topic/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
