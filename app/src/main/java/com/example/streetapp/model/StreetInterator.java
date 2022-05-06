package com.example.streetapp.model;

import com.example.streetapp.model.enity.Family;
import com.example.streetapp.model.enity.People;
import com.example.streetapp.model.enity.Street;

import java.util.ArrayList;
import java.util.List;

public class StreetInterator {
    private final LoadDataListener loaData;
    public static List<People> people = new ArrayList<>();
    public static List<Family> families = new ArrayList<>();
    public static List<Street> streets = new ArrayList<>();
    public StreetInterator(LoadDataListener loaddata) {
        this.loaData = loaddata;
    }
    public void createData() {
        people.add(new People("030202005697", 20, "minh", "dev"));
        people.add(new People("030202005697", 20, "minh", "dev"));
        people.add(new People("030202005697", 20, "minh", "dev"));
        people.add(new People("030202005697", 20, "minh", "dev"));
        people.add(new People("030202005697", 20, "minh", "dev"));


        families.add(new Family(1, "family1", people));
        families.add(new Family(1, "family1", people));
        families.add(new Family(1, "family1", people));
        families.add(new Family(1, "family1", people));
        families.add(new Family(1, "family1", people));
        families.add(new Family(1, "family1", people));


        streets.add(new Street(1, "street1", families));
        streets.add(new Street(1, "street2", families));
        streets.add(new Street(1, "street3", families));
        streets.add(new Street(1, "street4", families));
        streets.add(new Street(1, "street5", families));
        loaData.onLoadSuccess(streets);
    }
}