package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button textview;
    Button edittext;
    Button button;
    Button chip;
    Button bottomappbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        textview = findViewById(R.id.textview);
        edittext = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        chip = findViewById(R.id.chip);
        bottomappbar = findViewById(R.id.bottomappbar);

        textview.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TextviewActivity.class)));
        edittext.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, EdittextActivity.class)));
        button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ButtonActivity.class)));
        chip.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChipActivity.class)));
        bottomappbar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, BottomappbarActivity.class)));
    }
}
