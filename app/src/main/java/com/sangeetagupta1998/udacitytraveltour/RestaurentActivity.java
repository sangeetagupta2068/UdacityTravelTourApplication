package com.sangeetagupta1998.udacitytraveltour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurentActivity extends AppCompatActivity {

    ArrayList<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurent);
        initialize();
        displayView();

    }

    public void initialize() {

        placeList = new ArrayList<Place>();

        placeList.add(new Place(getResources().getString(R.string.baashos_title)
                , getResources().getString(R.string.baashos_description)
                , R.drawable.bashos));
        placeList.add(new Place(getResources().getString(R.string.gong_title)
                , getResources().getString(R.string.gong_description)
                , R.drawable.gong));
        placeList.add(new Place(getResources().getString(R.string.nawab_asia_title)
                , getResources().getString(R.string.nawab_asia_description)
                , R.drawable.nawab_asia));
        placeList.add(new Place(getResources().getString(R.string.eighteen_degree_title)
                , getResources().getString(R.string.eighteen_degree_description)
                , R.drawable.eighteen_degree));

    }

    public void displayView() {

        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeList);

        ListView listView = findViewById(R.id.res_list_view);
        listView.setAdapter(placeAdapter);

    }


}
