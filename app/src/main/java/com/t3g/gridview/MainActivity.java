package com.t3g.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int[] gridViewImage = {
            R.drawable.as,
            R.drawable.db,
            R.drawable.fb,
            R.drawable.insta,
            R.drawable.ps,
            R.drawable.wp,
            R.drawable.ps,
            R.drawable.wp,
            R.drawable.ps,
            R.drawable.wp,


    };
    String[] gridViewText = {
            "Android Studio",
            "Dribbble",
            "Facebook",
            "Instagram",
            "Photoshop",
            "WhatsApp",
            "Photoshop",
            "WhatsApp",
            "Photoshop",
            "WhatsApp"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridView customGridView = new CustomGridView(MainActivity.this, gridViewImage, gridViewText);
        gridView = findViewById(R.id.gridViewImageText);
        gridView.setAdapter(customGridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You Choose "+gridViewText[+position], Toast.LENGTH_LONG);
            }
        });
    }
}
