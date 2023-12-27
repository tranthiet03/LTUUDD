package com.example.baitap.tuan2;

import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.baitap.R;

public class DapanPTB2 extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dapan_ptb2);
        tv1 = findViewById(R.id.ketqua);

        Intent t1 = getIntent();
        String chuoi1 = t1.getExtras().getString("so1");
        String chuoi2 = t1.getExtras().getString("so2");
        String chuoi3 = t1.getExtras().getString("so3");

        int a = Integer.parseInt(chuoi1);
        int b = Integer.parseInt(chuoi2);
        int c = Integer.parseInt(chuoi3);

        float delta = b*b - 4*a*c;
        if (delta < 0)
        {
            tv1.setText("Phuong trinh vo nghiem");

        }else if (delta == 0)
        {
            float x1 = (-b)/(2*a);
            tv1.setText("Phuong trinh co nghiem kep x="+x1+"");

        }else
        {
            float x1 =(float) (-b + sqrt(delta))/(2*a);
            float x2 =(float) (-b - sqrt(delta))/(2*a);
            tv1.setText("Phuong trinh co 2 nghiem x1 ="+x1+" va x2 = "+x2+" ");

        }
    }
}