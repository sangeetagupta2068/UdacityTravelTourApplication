package com.sangeetagupta1998.udacitytraveltour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sangeetagupta1998 on 6/23/18.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null){

            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);

        }

        Place place = (Place) getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.place_name_view);
        nameTextView.setText(place.getPlaceName());

        TextView descriptionTextView = listItemView.findViewById(R.id.place_description_view);
        descriptionTextView.setText(place.getPlaceDescription());

        ImageView imageView = listItemView.findViewById(R.id.place_image_view);
        imageView.setImageResource(place.getImageResourceId());

        return listItemView;

    }

}
