package com.sangeetagupta1998.udacitytraveltour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalMonumentsActivity extends AppCompatActivity {

    ArrayList<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_monuments);
        initialize();
        displayView();

    }

    public void initialize() {

        placeList = new ArrayList<Place>();

        placeList.add(new Place(getResources().getString(R.string.sinhagad_fort_title)
                , getResources().getString(R.string.sinhagad_fort_description)
                , R.drawable.sinhagad_fort));
        placeList.add(new Place(getResources().getString(R.string.lohagad_fort_title)
                , getResources().getString(R.string.lohagad_fort_description)
                , R.drawable.lohagad_fort));
        placeList.add(new Place(getResources().getString(R.string.shanivar_wada_title)
                , getResources().getString(R.string.shanivar_wada_description)
                , R.drawable.shanivar_wada));
        placeList.add(new Place(getResources().getString(R.string.aga_khan_palace_title)
                , getResources().getString(R.string.aga_kha_palace_description)
                , R.drawable.aga_khan_palace));

    }

    public void displayView() {

        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeList);

        ListView listView = findViewById(R.id.his_list_view);
        listView.setAdapter(placeAdapter);

    }
}
