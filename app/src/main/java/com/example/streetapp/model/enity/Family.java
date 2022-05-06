package com.example.streetapp.model.enity;

import java.util.List;

public class Family {
    private int id  ;
    private String nameFamily ;
    private List<People> listPeople;
    public Family(int id, String nameFamily, List<People> listPeople) {
        this.id = id;
        this.nameFamily = nameFamily;
        this.listPeople = listPeople;
    }

    public int getId() {
        return id;
    }

    public String getNameFamily() {
        return nameFamily;
    }


    public List<People> getListPeople() {
        return listPeople;
    }
}
