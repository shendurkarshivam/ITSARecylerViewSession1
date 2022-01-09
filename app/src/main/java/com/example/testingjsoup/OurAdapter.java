package com.example.testingjsoup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OurAdapter extends RecyclerView.Adapter<OurAdapter.NameHolder> {
    Context context;
    ArrayList<String> names;
    public OurAdapter(Context context, ArrayList<String> names) {
        this.context=context;
        this.names=names;
    }

    @Override
    public NameHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.our_recycler_view, parent, false);
        return new NameHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameHolder holder, int position) {
        holder.name.setText(names.get(position));

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, names.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class NameHolder extends RecyclerView.ViewHolder{
        TextView name;

        public NameHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name);
        }
    }
}
