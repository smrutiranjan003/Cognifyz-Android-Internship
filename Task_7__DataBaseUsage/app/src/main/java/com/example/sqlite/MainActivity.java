package com.example.sqlite;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextPreference;
    Button buttonSave, buttonView;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);

        editTextName = findViewById(R.id.editTextName);
        editTextPreference = findViewById(R.id.editTextPreference);
        buttonSave = findViewById(R.id.buttonSave);
        buttonView = findViewById(R.id.buttonView);

        buttonSave.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String pref = editTextPreference.getText().toString();

            if (name.isEmpty() || pref.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                boolean inserted = dbHelper.insertData(name, pref);
                Toast.makeText(this, inserted ? "Saved Successfully!" : "Save Failed", Toast.LENGTH_SHORT).show();
            }
        });

        buttonView.setOnClickListener(v -> {
            String data = dbHelper.getAllData();
            if (data.isEmpty()) {
                showMessage("Error", "No data found");
            } else {
                showMessage("Stored Data", data);
            }
        });
    }

    private void showMessage(String title, String message) {
        new AlertDialog.Builder(this)
                .setCancelable(true)
                .setTitle(title)
                .setMessage(message)
                .show();
    }
}
