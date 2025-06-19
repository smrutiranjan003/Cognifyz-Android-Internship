package com.example.simpleform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextEmail;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(view -> {
            String name = editTextName.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();

            if(name.isEmpty() || email.isEmpty()){
                Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this,
                        "Name: " + name + "\nEmail: " + email,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
