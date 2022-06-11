package com.campain;

import java.util.ArrayList;

public class CampainList {

    static ArrayList<Campain> campains=new ArrayList<>();

    public static ArrayList<Campain> getCampains() {
        return campains;
    }

    public static void addCampains(Campain campain) {
        CampainList.campains.add(campain);
    }
}
