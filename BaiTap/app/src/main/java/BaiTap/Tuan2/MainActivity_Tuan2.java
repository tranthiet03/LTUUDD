package BaiTap.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.baitap.R;

public class MainActivity_Tuan2 extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan2);
        txt1 = findViewById(R.id.tuan2txt1);
        txt2 = findViewById(R.id.tuan2txt2);
        btn1 = findViewById(R.id.tuan2btn);
        //su kien khi click button
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i = new Intent(MainActivity_Tuan2.this,
                    MainActivity_Tuan2_Second.class);
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}