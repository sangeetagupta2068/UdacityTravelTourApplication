package com.sangeetagupta1998.udacitytraveltour;

/**
 * Created by sangeetagupta1998 on 6/23/18.
 */

public class Place {

    private String name;

    private String description;

    private int imageResourceId;

    public Place(String name, String description, int imageResourceId) {

        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;

    }

    public Place(String name, int imageResourceId) {

        this.name = name;
        this.imageResourceId = imageResourceId;

    }

    public String getPlaceName() {

        if (this.name != null)
            return this.name;

        return "";

    }

    public String getPlaceDescription() {

        if (this.description != null)
            return this.description;

        return "";

    }

    public int getImageResourceId() {

        if (this.imageResourceId != 0)
            return this.imageResourceId;

        return 0;

    }

}
