package com.example.fahrenheit_celsius;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtF, edtC;
    Button btnCel, btnFah;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtF = findViewById(R.id.edtF);
        edtC = findViewById(R.id.edtC);
        btnCel = findViewById(R.id.btnFah);
        btnFah = findViewById(R.id.btnCel);
        btnFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Auto-generate method stub
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = edtF.getText() + "";
                //
                int C = Integer.parseInt(doC);
                edtC.setText("" + dcf.format(C * 1.8 + 32));
            }
        });
        btnCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                //TODO Auto-generate method stub
                String doF = edtC.getText() + "";
                int F = Integer.parseInt(doF);
                edtF.setText("" + dcf.format((F - 32) / 1.8));
            }
        });
    }
}