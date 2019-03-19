package com.bianchi.platform.model;

import javax.persistence.*;

@Entity
@Table(name = "picture")
public class Picture
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String path;

    @ManyToOne
    @JoinColumn(name="fk_author")
    private User author;

    @ManyToOne
    @JoinColumn(name="fk_city")
    private City place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public City getPlace() {
        return place;
    }

    public void setPlace(City place) {
        this.place = place;
    }
}
