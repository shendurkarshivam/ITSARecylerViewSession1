package com.example.testingjsoup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView, ourScore;
    EditText editText;
    Button button;
    ImageView image;
    RecyclerView recView;
    OurAdapter ourAdapter;
    ArrayList<String> names = new ArrayList<>();

    //String wordArr[] = {"Shivam", "Ansh", "ABC", "PQR"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView = findViewById(R.id.rec);


        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setHasFixedSize(true);
        recView.setLayoutManager(linearLayoutManager);

        ourAdapter = new OurAdapter(getApplicationContext(), names);
        recView.setAdapter(ourAdapter);
        //ourAdapter.notifyDataSetChanged();







    }

}