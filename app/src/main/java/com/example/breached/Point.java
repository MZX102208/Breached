package com.example.breached;

import java.util.ArrayList;

public class Point {
    public String title;
    public double lat;
    public double lng;

    public Point(String t, double lat, double lng) {
        title = t;
        this.lat = lat;
        this.lng = lng;
    }

    public static ArrayList<Point> getPoints() {
        ArrayList<Point> points = new ArrayList<>();points.add(new Point("DWI", 32.994994, -96.749911));
        points.add(new Point("PUBLIC_INTOXICATION", 32.994994, -96.749911));
        points.add(new Point("ARREST WARRANT", 32.989146, -96.752292));
        points.add(new Point("TRESPASSING", 32.989146, -96.752292));
        points.add(new Point("TRESPASSING", 32.989146, -96.752292));
        points.add(new Point("ARREST_WARRANT", 32.989146, -96.752292));
        points.add(new Point("ARREST_WARRANT", 32.989146, -96.752292));
        points.add(new Point("DRUGS", 32.986612, -96.753339));
        points.add(new Point("DRUGS", 32.986612, -96.753339));
        points.add(new Point("THEFT", 32.991742, -96.745879));
        points.add(new Point("DRUGS", 32.982701, -96.756230));
        points.add(new Point("THEFT", 32.991308, -96.754383));
        points.add(new Point("THEFT", 32.984732, -96.749817));
        points.add(new Point("THEFT", 32.984732, -96.749817));
        points.add(new Point("THEFT", 32.980728, -96.755814));
        points.add(new Point("DRUGS", 32.98179, -96.755701));
        points.add(new Point("SEXUAL_ASSAULT", 32.991846, -96.745764));
        points.add(new Point("THEFT", 32.981507, -96.755981));
        points.add(new Point("ACCIDENT", 32.981328, -96.748019));
        points.add(new Point("THEFT", 32.991719, -96.745661));
        points.add(new Point("THEFT", 32.991036, -96.755078));
        points.add(new Point("DAMAGES", 32.990586, -96.754437));
        points.add(new Point("THEFT", 32.980862, -96.755589));
        points.add(new Point("THEFT", 32.988886, -96.748763));
        points.add(new Point("DWI", 32.980949, -96.768148));
        points.add(new Point("THEFT", 32.986349, -96.750315));
        points.add(new Point("THEFT", 32.985033, -96.747034));
        points.add(new Point("THEFT", 32.985033, -96.747034));
        points.add(new Point("HARASSMENT", 32.985033, -96.747034));
        points.add(new Point("ACCIDENT", 32.990608, -96.750974));
        points.add(new Point("THEFT", 32.986896, -96.747634));
        points.add(new Point("THEFT", 32.986896, -96.747634));
        points.add(new Point("THEFT", 32.986896, -96.747634));
        points.add(new Point("THEFT", 32.994468, -96.752745));
        points.add(new Point("THEFT", 32.984431, -96.754923));
        points.add(new Point("SUICIDE", 32.985886, -96.749203));
        points.add(new Point("THEFT", 32.978240, -96.748483));
        points.add(new Point("THEFT", 32.986948, -96.746658));
        points.add(new Point("DAMAGES", 32.986315, -96.754205));
        points.add(new Point("ASSAULT", 32.990480, -96.754693));
        points.add(new Point("DRUGS", 32.990480, -96.754693));
        points.add(new Point("THEFT", 32.990480, -96.754693));
        points.add(new Point("THEFT", 32.985847, -96.747174));
        points.add(new Point("THEFT", 32.986105, -96.747796));
        return points;
    }

}
