/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earthquakefeedsample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Dagoberto
 */
public class Main {
    
    public static void Main(String[] args){
        
        ArrayList<Quake> earthquakes = getQuakes("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_day.atom");
        
        System.out.println("TODAY'S EARTHQUAKES 4.5 AND HIGHER");
        SimpleDateFormat df = new SimpleDateFormat("HH:MM");
        System.out.printf("%s\t%-25s\t%s\t%s\n","WHEN","LAT / LONG","MAGNITUDE","DETAILS");
        for(Quake q : earthquakes){
            System.out.printf("%s\t%-25s\t%s\t%s\n", df.format(q.getDate()),q.getLocation(),q.getMagnitude(),q.getDetails());
        }
        
    }
    
    public static ArrayList<Quake> getQuakes(String url){
        
        
    }
    
    
}
