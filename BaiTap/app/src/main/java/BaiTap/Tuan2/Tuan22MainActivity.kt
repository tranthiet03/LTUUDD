package BaiTap.Tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.baitap.R

class Tuan22MainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        txt1 = findViewById(R.id.tuan22Txt1);
        txt2 = findViewById(R.id.tuan22Txt2);
        btn1 = findViewById(R.id.tuan22btn1);
        btn1 !!.setOnClickListener(View.OnClickListener {
            var i = Intent(this@Tuan22MainActivity,
                    Tuan22SecondActivity::class.java)
            i.putExtra("so1",txt1 !!.text.toString())
            i.putExtra("so2",txt2 !!.text.toString())
            startActivity(i)
        })
    }
}