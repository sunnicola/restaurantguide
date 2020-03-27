package com.example.restaurantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private Restaurant mRestaurant;
    private TextView mName;
    private TextView mCuisine;
    private TextView mLocation;
    private TextView mRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mName = findViewById(R.id.tvName);
        mCuisine = findViewById(R.id.tvCuisine);
        mLocation = findViewById(R.id.tvLocation);
        mRating = findViewById(R.id.tvRating);


        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);

        mRestaurant = Restaurant.getRestaurant().get(position);
        setTitle(mRestaurant.getName());
        mName.setText(mRestaurant.getName());
        mCuisine.setText(mRestaurant.getCuisine());
        mLocation.setText(mRestaurant.getLocation());
        mRating.setText(String.valueOf(mRestaurant.getRating()));
    }

}


