package com.sangeetagupta1998.udacitytraveltour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MustToVisitActivity extends AppCompatActivity {

    ArrayList<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_must_to_visit);
        initialize();
        displayView();

    }

    public void initialize() {

        placeList = new ArrayList<Place>();

        placeList.add(new Place(getResources().getString(R.string.bahubali_thali_title)
                , getResources().getString(R.string.bahubali_thali_description)
                , R.drawable.bahubali_thali));
        placeList.add(new Place(getResources().getString(R.string.good_luck_cafe_title)
                , getResources().getString(R.string.good_luck_cafe_description)
                , R.drawable.goodluck_cafe));
        placeList.add(new Place(getResources().getString(R.string.dagdusheth_title)
                , getResources().getString(R.string.dagdusheth_description)
                , R.drawable.dagdusheth));
        placeList.add(new Place(getResources().getString(R.string.pashan_lake_title)
                , getResources().getString(R.string.pashan_lake_description)
                , R.drawable.pashan_lake));

    }

    public void displayView() {

        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeList);

        ListView listView = findViewById(R.id.must_list_view);
        listView.setAdapter(placeAdapter);

    }

}
