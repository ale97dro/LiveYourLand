package com.bianchi.platform.model;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String description;

    @OneToOne(mappedBy = "place", cascade = CascadeType.ALL)
    private CityProfilePic profilePic;


    @Transient
    private String truncateDescription;

    public City(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public City()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
        this.truncateDescription = this.description.substring(0, 50);
    }

    public CityProfilePic getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(CityProfilePic profilePic) {
        this.profilePic = profilePic;
    }

    public String getTruncateDescription() {
        return truncateDescription;
    }

    public void createTruncateDescription()
    {
        try
        {
            truncateDescription = description.substring(0, 50);
        }
        catch (Exception ex)
        {
            truncateDescription = description;
        }
    }
}
