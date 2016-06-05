//This project is all about getting the country flag , country name and it's population as the list view
//we will use Retrifit library and the picasso library in this project
//the data will be fetched from the internet
package com.example.sudarshan.countrylist.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.sudarshan.countrylist.R;
import com.example.sudarshan.countrylist.adapter.CountryAdapter;
import com.example.sudarshan.countrylist.model.CountryCollection;
import com.example.sudarshan.countrylist.web.adapter.CountryWebAdapter;
import com.example.sudarshan.countrylist.web.service.CountryService;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    ListView countryList;
    CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryList = (ListView) findViewById(R.id.country_list);
        CountryService countryService = new CountryWebAdapter().getCountryService();
        countryService.getCountryList(new Callback<CountryCollection>() {
            //for the successful response this method will be called
            @Override
            public void success(CountryCollection countryCollection, Response response) {
                adapter=new CountryAdapter(MainActivity.this,countryCollection.worldpopulation);
                countryList.setAdapter(adapter);

            }

            @Override
            public void failure(RetrofitError error) {
              error.printStackTrace();
            }
        });
    }
}

