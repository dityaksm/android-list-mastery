package com.example.gema.listorder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ListModel> listOrder = new ArrayList<>();

    String[] statusOrder = {
            "Selesai",
            "Selesai",
            "Selesai",
            "Selesai"
    };

    String[] timeOrder = {
            "28 Jan, 06:36 PM",
            "10 Feb, 12:13 PM",
            "15 Jul, 23:20 PM",
            "20 Jul, 14:48 PM"
    };

    String[] locationOrder = {
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali",
            "Jln. Teuku Umar, Kel. Dauh Puri Klod Kec. Denpasar Barat Kota Denpasar Bali"
    };

    int[] imageOrder = {
            R.drawable.food_gojek,
            R.drawable.transport_gojek,
            R.drawable.transport_gojek,
            R.drawable.food_gojek
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recycler = findViewById(R.id.recycler_view);


        for (int i = 0; i < statusOrder.length; i++) {
            ListModel buah = new ListModel(statusOrder[i], timeOrder[i], locationOrder[i], imageOrder[i]);
            listOrder.add(buah);
        }

        // adapter
        recycler.setAdapter(new RecyclerAdapter(RecyclerActivity.this, listOrder));

        // layoutmanager
        recycler.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));

    }
}
