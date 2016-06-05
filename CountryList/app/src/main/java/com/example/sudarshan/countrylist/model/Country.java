package com.example.sudarshan.countrylist.model;

/**
 * Created by sudarshan on 27/3/16.
 */
//this class contains all the key values of json file as variables
public class Country {
    public final String rank;
    public final String country;
    public final String flag;
    public final String population;
    public Country( String rank, String country, String flag, String population){
        this.rank = rank;
        this.country=country;
        this.flag=flag;
        this.population=population;

    }
}
