package com.example.streetapp.model.enity;

import java.util.List;

public class Street {
    private int id;
    private String nameStreet;
    private List<Family> listFamily;


    public Street(int id, String nameStreet, List<Family> listFamily) {
        this.id = id;
        this.nameStreet = nameStreet;
        this.listFamily = listFamily;
    }

    public int getId() {
        return id;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public List<Family> getListFamily() {
        return listFamily;
    }
}
