package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity(name="Message")
@Table(name="Messages")
@Access(value=AccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    @Column(name="text")
    private String text;
    @ManyToOne(targetEntity = User.class)
    //@ManyToOne()
    @JoinColumn(name="author_id", referencedColumnName = "id")
    private User author;
    @Column(name="datetime")
    private String datetime;
    @ManyToOne(targetEntity = Topic.class)
    @JoinColumn(name="topic_id", referencedColumnName = "id")
    private Topic topic;
    //private Status status;
    public Message(String text, User author, String datetime, Topic topic){
        this.text = text;
        this.author = author;
        this.datetime = datetime;
        this.topic = topic;
    }
    public Message(){}
}
