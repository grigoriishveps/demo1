package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity(name="User")
@Table(name="Users")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(name="topic_user", joinColumns = @JoinColumn(name="id"), inverseJoinColumns = @JoinColumn(name="id"))
//    private List<Topic> topicsList;
//    @JsonIgnore
//    @OneToMany(mappedBy = "author_id", targetEntity = Message.class)
//    private List<Message> messageList;

    public User(){}
    public User(int id, String name){
        this.id = id;
        this.name = name;

    }
}

