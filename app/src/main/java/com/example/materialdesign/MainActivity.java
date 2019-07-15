package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button textview;
    Button edittext;
    Button button;
    Button chip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textview);
        edittext = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        chip = findViewById(R.id.chip);

        textview.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TextviewActivity.class)));
        edittext.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, EdittextActivity.class)));
        button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ButtonActivity.class)));
        chip.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChipActivity.class)));
    }
}
