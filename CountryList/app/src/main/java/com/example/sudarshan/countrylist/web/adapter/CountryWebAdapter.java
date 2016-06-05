package com.example.sudarshan.countrylist.web.adapter;

import com.example.sudarshan.countrylist.web.service.CountryService;

import retrofit.RestAdapter;


/**
 * Created by sudarshan on 27/3/16.
 */
public class CountryWebAdapter {
    public CountryService getCountryService(){
        RestAdapter restAdapter=new RestAdapter.Builder()
                .setEndpoint("http://www.androidbegin.com/tutorial") // setting the first part of the url (http://www.androidbegin.com/tutorial)/jsonparsetutorial.txt
                .build();
        return  restAdapter.create(CountryService.class);
    }
}
