package com.example.displaydata;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter adapter;
    List<DataModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Step 1: Define list
        dataList = new ArrayList<>();
        dataList.add(new DataModel("Item 1"));
        dataList.add(new DataModel("Item 2"));
        dataList.add(new DataModel("Item 3"));
        dataList.add(new DataModel("Item 4"));
        dataList.add(new DataModel("Item 5"));

        // Step 2: Bind adapter
        adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
