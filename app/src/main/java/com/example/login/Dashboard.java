package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.login.helper.Helper;
import com.google.android.material.imageview.ShapeableImageView;

public class Dashboard extends AppCompatActivity {

    TextView tvUsername;
    ShapeableImageView imgBocil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        tvUsername = findViewById(R.id.tvUsername);
        imgBocil = findViewById(R.id.imgBocil);

        tvUsername.setText(Helper.getUsername());

        imgBocil.setOnClickListener(view -> startActivity(new Intent(this, Barang.class)));

    }
}