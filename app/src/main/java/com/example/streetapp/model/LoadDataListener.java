package com.example.streetapp.model;

import com.example.streetapp.model.enity.Street;

import java.util.List;

public interface LoadDataListener {
    void onLoadSuccess(List<Street> data);
    void onLoadFailure();
}
