package io.github.rgoonie.springbootquickstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topicList = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topicList::add);

        return topicList;

    }

    public Topic getTopic(String id){
        Optional<Topic> topic = topicRepository.findById(id);
        return topic.isPresent()? topic.get() : null;
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }

}
