package com.example.androiduiwidgetsthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingBarDemo extends AppCompatActivity {

    RatingBar my_ratings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar_demo);

        my_ratings=(RatingBar) findViewById(R.id.my_ratings);
    }

    public void getRatings(View view)
    {
        int no_of_stars=my_ratings.getNumStars();

        float f=my_ratings.getRating();
        Toast.makeText(this, "Rating is : "+f, Toast.LENGTH_SHORT).show();
    }
}