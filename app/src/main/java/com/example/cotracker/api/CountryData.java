package com.example.cotracker.api;


import com.google.gson.annotations.SerializedName;

public class CountryData {


    private String updated;
    private String country;
    private String cases;
    private String todayCases;
    private String deaths;
    private String todayDeaths;
    private String recovered;
    private String todayRecovered;
    private String active;
    private String  tests;


    public CountryData(String updated,String active,String country,String cases,String todayCases,String recovered,String todayRecovered,String deaths,String todayDeaths,String tests){
        this.updated = updated;
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths=todayDeaths;
        this.recovered=recovered;
        this.todayRecovered=todayRecovered;
        this.active=active;
        this.tests=tests;
    }

    public String getUpdated(){
        return updated;
    }
    public void setupdated(String updated){
        this.updated = updated;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCases(){
        return cases;
    }
    public void setCases(String cases){
        this.cases = cases;
    }
    public String getTodayCases(){
        return todayCases;
    }
    public void setTodaycases(String todayCases){
        this.todayCases = todayCases;
    }
    public String getRecovered(){
        return recovered;
    }
    public void setRecovered(String recovered){
        this.recovered = recovered;
    }
    public String getTodayDeaths(){
        return todayRecovered;
    }
    public void setTodayDeaths(String todayDeaths){
        this.todayDeaths = todayDeaths;
    }
    public String getTodayRecovered(){
        return todayRecovered;
    }
    public void setTodayRecovered(String todayRecovered){
        this.todayRecovered = todayRecovered;
    }
    public String getDeaths(){
        return deaths;
    }
    public void setDeaths(String deaths){
        this.deaths = deaths;
    }
    public String getActive(){
        return active;
    }
    public void setActive(String active){
        this.active = active;
    }
    public String getTests(){
        return tests;
    }
    public void setTests(String tests){
        this.tests = tests;
    }

}

