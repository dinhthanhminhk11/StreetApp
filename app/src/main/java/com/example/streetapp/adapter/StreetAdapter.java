package com.example.streetapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.streetapp.R;
import com.example.streetapp.model.enity.Family;
import com.example.streetapp.model.enity.Street;

import java.util.List;

public class StreetAdapter extends RecyclerView.Adapter<StreetAdapter.ViewHolder > {
    private List<Street> data;
    private Callback callback;
    public StreetAdapter(Callback callback) {
        this.callback = callback;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteminfo, parent, false);
        return new ViewHolder(itemView);
    }
    public void setData(List<Street> data) {
       this.data =data;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Street item = data.get(position);

       if(item != null){
           List<Family> dataFamily = item.getListFamily();
           int count = 0;
           try {
               count = dataFamily.size();
           }catch (Exception e){
               e.printStackTrace();
           }
           holder.nameSteet.setText(item.getNameStreet());
           holder.coutFamily.setText(String.format("%s Family" , dataFamily.size() ));
           holder.coutPeople.setText(String.format("%s People" , count ));
           holder.itemView.setOnClickListener(v->{
            callback.onClickItem(v , position);
           });
       }

    }
    @Override
    public int getItemCount() {
        return data.size() ;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView coutFamily;
        TextView nameSteet;
        TextView coutPeople;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             coutFamily = (TextView) itemView.findViewById(R.id.CoutFamily);
             nameSteet = (TextView) itemView.findViewById(R.id.NameSteet);
             coutPeople = (TextView) itemView.findViewById(R.id.coutPeople);
        }
    }
    public interface Callback {
        void onClickItem(View view , int position);
    }

}
