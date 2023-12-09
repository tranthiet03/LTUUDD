package com.example.baitap.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.baitap.R;

public class MainActivity extends AppCompatActivity {
    //khai bao cac control
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa cac control
        txt1 = findViewById(R.id.number1);
        txt2 = findViewById(R.id.number2);
        btn1 = findViewById(R.id.button1);
        tv1 = findViewById(R.id.answer1);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();
        });
    }

    //dinh nghia ham tinh tong
    private void tinhTong() {
        //lay du lieu nhap vao tu EditText
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);//chuyen du lieu sang so
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);
        //tinh tong
        float tong = so1+so2;
        //in ra man hinh
        tv1.setText(String.valueOf(tong));

    }
}