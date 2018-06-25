package com.sangeetagupta1998.udacitytraveltour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    ImageView resView, hisView, sightView, mustView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initialize();
        setListener();

    }

    public void initialize() {

        resView = findViewById(R.id.resView);
        hisView = findViewById(R.id.hisView);
        sightView = findViewById(R.id.sightView);
        mustView = findViewById(R.id.mustView);

    }

    public void setListener() {

        resView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, RestaurentActivity.class);
                startActivity(intent);
            }
        });
        hisView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, HistoricalMonumentsActivity.class);
                startActivity(intent);
            }
        });
        sightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, SightSeeingActivity.class);
                startActivity(intent);
            }
        });
        mustView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListActivity.this, MustToVisitActivity.class);
                startActivity(intent);
            }
        });

    }

}
