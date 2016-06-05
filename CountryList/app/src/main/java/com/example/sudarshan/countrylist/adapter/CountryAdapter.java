package com.example.sudarshan.countrylist.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sudarshan.countrylist.R;
import com.example.sudarshan.countrylist.model.Country;
import com.squareup.picasso.Picasso;
/**
 * Created by sudarshan on 27/3/16.
 */
//creating own adapter class to create a list view
public class CountryAdapter extends BaseAdapter {
    private Context context;
    private Country[] countries;
    private int mCount;
    public CountryAdapter(Context context, Country[] countries){
        this.context=context;
        this.countries=countries;
        this.mCount=countries.length;

    }
// this will return total number of items available
    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder")
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row_view, null);
        final ImageView countryFlag=(ImageView)view.findViewById(R.id.country_flag);
        final TextView rank=(TextView)view.findViewById(R.id.rank);
        final TextView countryName=(TextView)view.findViewById(R.id.country_name);
        final TextView population=(TextView)view.findViewById(R.id.population);

         //to download image view and directly map it to the imageview

        Picasso.with(context).load(countries[position].flag).fit().into(countryFlag);
        rank.setText(countries[position].rank);
        countryName.setText(countries[position].country);
        population.setText(countries[position].population);


        return view;
    }
}
