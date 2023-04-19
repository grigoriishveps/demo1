package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity(name="Topic")
@Table(name="Topic")

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Topic implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
//    @ManyToMany(mappedBy="topicsList")
//    private List<User> usersList;
//    @JsonIgnore
//    @OneToMany(mappedBy = "topic_id", targetEntity = Message.class)
//    private List<Message> messageList;

    public Topic(int id, String name){
        this.id = id;
        this.name = name;
    }
}
