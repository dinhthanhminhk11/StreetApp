package com.example.streetapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.streetapp.adapter.StreetAdapter;
import com.example.streetapp.databinding.ActivityMainBinding;
import com.example.streetapp.model.enity.Family;
import com.example.streetapp.model.enity.People;
import com.example.streetapp.model.enity.Street;
import com.example.streetapp.persenter.MainPersenter;
import com.example.streetapp.persenter.MainView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    private ActivityMainBinding binding;
    private StreetAdapter adapter;
    private MainPersenter mainPersenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflate = getLayoutInflater();
        binding = ActivityMainBinding.inflate(inflate);
        setContentView(binding.getRoot());
        mainPersenter = new MainPersenter(this);
        mainPersenter.loadData();
        binding.fab.setOnClickListener(v->{
        });
        binding.horizontal.setOnClickListener(v->{
            binding.list.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL , false));
            Snackbar snackbar = Snackbar
                    .make(v, "horizontal", Snackbar.LENGTH_LONG)
                    .setAction("close", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            binding.list.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
                        }
                    });
            snackbar.show();
        });
        binding.vertical.setOnClickListener(v->{
            binding.list.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL , false));
            Snackbar snackbar = Snackbar
                    .make(v, "vertical", Snackbar.LENGTH_LONG)
                    .setAction("close", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            binding.list.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
                        }
                    });
            snackbar.show();
        });
    }
    @Override
    public void displayLoadData(List<Street> data) {
        adapter = new StreetAdapter(new MainHandler());
        binding.list.setLayoutManager(new GridLayoutManager(this, 2));
        binding.list.setAdapter(adapter);
        adapter.setData(data);
    }
    private static class MainHandler implements StreetAdapter.Callback {
    @Override
    public void onClickItem(View view, int position) {
        Toast.makeText(view.getContext(), "onclick " + position, Toast.LENGTH_SHORT).show();
    }
}
}