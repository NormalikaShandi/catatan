package com.example.kelash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tombol1,tombol_keluar,tombol_browser;
        tombol1 = findViewById(R.id.tombol1);
        tombol_keluar = findViewById(R.id.tombol_keluar);
        tombol_browser = findViewById(R.id.btn_url);
        tombol1.setOnClickListener(this);
        tombol_keluar.setOnClickListener(this);
        tombol_browser.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.tombol1:
                Intent ke_halaman_2 = new Intent(MainActivity.this,halaman2.class);
                startActivity(ke_halaman_2);
                break;
            case R.id.btn_url:
                Intent ke_url = new Intent(Intent.ACTION_VIEW);
                ke_url.setData(Uri.parse("https://facebook.com"));
                startActivity(ke_url);
            case R.id.tombol_keluar:
                finish();
                break;    
        }
    }
}