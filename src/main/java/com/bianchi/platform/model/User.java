package com.bianchi.platform.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User
{
    @Id
    private String username;

    private String name;
    private String surname;
    private Date birthDate;
    private String password;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Role role;
}
