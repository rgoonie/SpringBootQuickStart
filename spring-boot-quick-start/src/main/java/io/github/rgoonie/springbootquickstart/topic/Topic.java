package io.github.rgoonie.springbootquickstart.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Topic {

    private String id;
    private String name;
    private String description;
}
