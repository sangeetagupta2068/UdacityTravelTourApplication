package com.sangeetagupta1998.udacitytraveltour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightSeeingActivity extends AppCompatActivity {

    ArrayList<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_seeing);
        initialize();
        displayView();

    }

    public void initialize() {

        placeList = new ArrayList<Place>();

        placeList.add(new Place(getResources().getString(R.string.pawna_lake_title)
                , getResources().getString(R.string.pawna_lake_description)
                , R.drawable.pawna_lake));
        placeList.add(new Place(getResources().getString(R.string.mahabaleshwar_title)
                , getResources().getString(R.string.mahabaleshwar_description)
                , R.drawable.mahabaleshwar));
        placeList.add(new Place(getResources().getString(R.string.elphinstone_point_title)
                , getResources().getString(R.string.elphinstone_point_description)
                , R.drawable.elphinstone_point));
        placeList.add(new Place(getResources().getString(R.string.fireflies_camp_title)
                , getResources().getString(R.string.fireflies_camp_description)
                , R.drawable.fireflies_camp));

    }

    public void displayView() {

        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeList);

        ListView listView = findViewById(R.id.sight_list_view);
        listView.setAdapter(placeAdapter);

    }

}
