package com.example.baitap.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.baitap.R;

public class Phuongtrinhbac2 extends AppCompatActivity {
    EditText txt1, txt2, txt3;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phuongtrinhbac2);
        txt1 = findViewById(R.id.tuan2txts1);
        txt2 = findViewById(R.id.tuan2txts2);
        txt3 = findViewById(R.id.tuan2txts3);
        btn = findViewById(R.id.tuan2btn1);
        btn.setOnClickListener(v->{
            Intent t = new Intent(Phuongtrinhbac2.this,
                    DapanPTB2.class);
            t.putExtra("so1",txt1.getText().toString());
            t.putExtra("so2",txt2.getText().toString());
            t.putExtra("so3",txt3.getText().toString());
            startActivity(t);
        });

    }
}