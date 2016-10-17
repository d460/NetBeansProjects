/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakefeedsample;

import java.util.Date;

/**
 *
 * @author Dagoberto
 */
public class Quake {
    
    //fields for quake information
    
    private Date date;
    private String details;
    private String location;
    private double magnitude;
    private String link;
    
    //constructor takes initial values

    public Quake(Date date, String details, String location, double magnitude, String link) {
        this.date = date;
        this.details = details;
        this.location = location;
        this.magnitude = magnitude;
        this.link = link;
    }

    public Date getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    public String getLocation() {
        return location;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLink() {
        return link;
    }
}