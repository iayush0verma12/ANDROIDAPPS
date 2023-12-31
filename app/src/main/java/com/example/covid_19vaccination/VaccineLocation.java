package com.example.covid_19vaccination;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.LocAdapter;
import Model.ListLocation;

public class VaccineLocation extends AppCompatActivity {
    private List<ListLocation> listLoc;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccine_location);
        setTitle("Locations");
        //Recycler View setup
        recyclerView = findViewById(R.id.recyclerViewLc);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listLoc = new ArrayList<>();

        ListLocation loc1 = new ListLocation(getString(R.string.vi));
        ListLocation loc2 = new ListLocation(getString(R.string.aiims));
        ListLocation loc3 = new ListLocation(getString(R.string.balakRam));
        ListLocation loc4 = new ListLocation(getString(R.string.nmdc));
        ListLocation loc5 = new ListLocation(getString(R.string.ssv));
        ListLocation loc6 = new ListLocation(getString(R.string.skmch));
        ListLocation loc7 = new ListLocation(getString(R.string.iris));
        ListLocation loc8 = new ListLocation(getString(R.string.apollo));
        ListLocation loc9 = new ListLocation(getString(R.string.bansal));
        ListLocation loc10 = new ListLocation(getString(R.string.max));
        ListLocation loc11 = new ListLocation(getString(R.string.vaccineworld));
        ListLocation loc12 = new ListLocation(getString(R.string.spectra));
        ListLocation loc13 = new ListLocation(getString(R.string.amrita));
        ListLocation loc14 = new ListLocation(getString(R.string.nair));
        ListLocation loc15 = new ListLocation(getString(R.string.inhs));
        ListLocation loc16 = new ListLocation(getString(R.string.smhs));

        //Insert into List
        listLoc.add(loc1);
        listLoc.add(loc2);
        listLoc.add(loc3);
        listLoc.add(loc4);
        listLoc.add(loc5);
        listLoc.add(loc6);
        listLoc.add(loc7);
        listLoc.add(loc8);
        listLoc.add(loc9);
        listLoc.add(loc10);
        listLoc.add(loc11);
        listLoc.add(loc12);
        listLoc.add(loc13);
        listLoc.add(loc14);
        listLoc.add(loc15);
        listLoc.add(loc16);

        mAdapter = new LocAdapter(this, listLoc);
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.faq_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_homeFaq:
                Intent intent = new Intent(this, Dashboard.class);
                startActivity(intent);
                break;

            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
}