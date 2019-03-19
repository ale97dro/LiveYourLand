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
}
