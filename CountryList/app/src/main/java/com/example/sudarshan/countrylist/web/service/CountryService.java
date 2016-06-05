package com.example.sudarshan.countrylist.web.service;

import com.example.sudarshan.countrylist.model.CountryCollection;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by sudarshan on 27/3/16.
 */
public interface CountryService {
    @GET("/jsonparsetutorial.txt") // setting the last part of the url http://www.androidbegin.com/tutorial(/jsonparsetutorial.txt)
    void getCountryList(Callback<CountryCollection> callback);

}
