package BaiTap.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.baitap.R;

public class MainActivity_Tuan2_Second extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan2_second);
        tv1 = findViewById(R.id.dapan);
        //don du lieu
        Intent i1 = getIntent();
        //Dỡ hàng
        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 = i1.getExtras().getString("so2");
        //-----
        float so1 = Float.parseFloat(chuoi1);
        float so2 = Float.parseFloat(chuoi2);
        float tong = so1 + so2;
        //hien thi
        tv1.setText(String.valueOf(tong));
    }
}