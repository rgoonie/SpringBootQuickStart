package io.github.rgoonie.springbootquickstart.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    /**
     * Gets all topic in DB
     * @return List of topics
     */
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){

        return Arrays.asList(
                Topic.builder().id("spring").name("Spring Framework").description("Spring Framework Description").build(),
                Topic.builder().id("java").name("Core Java").description("Core Java Description").build(),
                Topic.builder().id("javascript").name("JavaScript").description("JavaScript Description").build()
        );
    }
}
