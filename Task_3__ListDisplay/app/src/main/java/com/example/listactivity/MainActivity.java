package com.example.listactivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to the ListView
        ListView listView = findViewById(R.id.myListView);

        // Static list data
        String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grapes"};

        // Create ArrayAdapter with default simple list item layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        // Set adapter to the ListView
        listView.setAdapter(adapter);
    }
}
