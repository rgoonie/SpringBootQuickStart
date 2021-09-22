package io.github.rgoonie.springbootquickstart.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = Arrays.asList(
            Topic.builder().id("spring").name("Spring Framework").description("Spring Framework Description").build(),
                Topic.builder().id("java").name("Core Java").description("Core Java Description").build(),
                Topic.builder().id("javascript").name("JavaScript").description("JavaScript Description").build()
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        for(Topic t : topics)
            if(t.getId().equals(id))
                return t;

        return null;
    }

}
