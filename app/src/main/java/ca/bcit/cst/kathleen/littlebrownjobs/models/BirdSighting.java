package ca.bcit.cst.kathleen.littlebrownjobs.models;

import android.location.Location;

import java.util.Date;
import java.util.Map;

/**
 * Created by Kathleen on 2017-06-30.
 */

public class BirdSighting
{
    private String description;
    private String photoURL;
    private Location location;
    private Date sightingTime;
    private Map<String, Integer> votes;

    public BirdSighting() {}

    public BirdSighting(String description, String photoURL, Location location, Date sightingTime, Map<String, Integer> votes)
    {
        this.description = description;
        this.photoURL = photoURL;
        this.location = location;
        this.sightingTime = sightingTime;
        this.votes = votes;
    }

    public Map<String, Integer> getVotes()
    {
        return votes;
    }

    public void setVotes(Map<String, Integer> votes)
    {
        this.votes = votes;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getPhotoURL()
    {
        return photoURL;
    }

    public void setPhotoURL(String photoURL)
    {
        this.photoURL = photoURL;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public Date getSightingTime()
    {
        return sightingTime;
    }

    public void setSightingTime(Date sightingTime)
    {
        this.sightingTime = sightingTime;
    }
}
