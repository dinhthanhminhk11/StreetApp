package com.example.streetapp.persenter;

import com.example.streetapp.model.LoadDataListener;
import com.example.streetapp.model.StreetInterator;
import com.example.streetapp.model.enity.Street;

import java.util.List;

public class MainPersenter implements LoadDataListener {
    private StreetInterator streetInterator;
    private MainView mainView;

    public MainPersenter( MainView mainView) {

        this.mainView = mainView;
        streetInterator = new StreetInterator(this);
    }
    public void loadData(){
        streetInterator.createData();
    }

    @Override
    public void onLoadSuccess(List<Street> data) {
        mainView.displayLoadData(data);
    }

    @Override
    public void onLoadFailure() {

    }
}
