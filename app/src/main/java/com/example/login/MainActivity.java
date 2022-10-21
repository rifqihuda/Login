package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.login.helper.Helper;

public class MainActivity extends AppCompatActivity {
    EditText txUsername, txPassword;
    Button btnLogin;
    TextView tvDaftar;
    String username = "rifqi";
    String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txUsername = findViewById(R.id.txUsername);
        txPassword = findViewById(R.id.txPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvDaftar = findViewById(R.id.tvDaftar);

        btnLogin.setOnClickListener(view -> {
            String user = txUsername.getText().toString();
            String pass = txPassword.getText().toString();

            if ((user.equals(username)) && (pass.equals(password))){
                Toast.makeText(this, "Sukses Login", Toast.LENGTH_SHORT).show();
                Helper.setUsername(user);
                startActivity(new Intent(this, Dashboard.class));
            } else {
                Toast.makeText(this, "Gagal Login", Toast.LENGTH_SHORT).show();
            }
        });
    }
}