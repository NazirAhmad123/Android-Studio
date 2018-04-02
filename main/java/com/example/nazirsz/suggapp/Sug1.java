package com.example.nazirsz.suggapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class Sug1 extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sug1);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a1, R.drawable.a2,
                R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6};

        placeNames = new String[]{"Navagio Beach", "Anse Source d'Argent Beach", "As Catedrais Beach",
                "La Concha Beach", "Bondi Beach", "Nissi Beach"};

        placeGuide = new String[]{"https://www.tripadvisor.com.my/Attraction_Review-g7777607-" +
                "d671779-Reviews-Navagio_Beach_Shipwreck_Beach-Anafonitria_Zakynthos_Ionian_Islands.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g477968-d637885-Reviews-Anse_Source_D_Argent" +
                        "-La_Digue_Island.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g609028-d1547522-Reviews-As_Catedrais_Beach-Ribadeo_" +
                        "Province_of_Lugo_Galicia.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g187457-d675885-Reviews-La_Concha_Beach-San_Sebastian" +
                        "_Donostia_Province_of_Guipuzcoa_Basque_Country.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g255060-d257354-Reviews-Bondi_Beach-Sydney_" +
                        "New_South_Wales.html",
                "https://www.tripadvisor.com.my/Attraction_Review-g262055-d1519581-Reviews-Nissi_Beach-Ayia_" +
                        "Napa_Famagusta_District.html"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Sug1.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdapter = new MyAdapter(Sug1.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapter);



    }
    public void showToast(View v){
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
    }
}
