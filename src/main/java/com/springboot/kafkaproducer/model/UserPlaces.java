package com.springboot.kafkaproducer.model;

public class UserPlaces {
    private String home;
    private double lat;
    private double lon;

    public UserPlaces(String home, double lat,double lon) {
        this.home = home;
        this.lat = lat;
        this.lon = lon;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "UserPlaces{" +
                "home='" + home + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
