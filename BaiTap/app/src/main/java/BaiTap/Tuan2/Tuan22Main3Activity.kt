package BaiTap.Tuan2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.baitap.R

class Tuan22Main3Activity : AppCompatActivity() {
    var lv:ListView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main3)
        lv = findViewById(R.id.tuan22Lv);
        //nguon du lieu
        val arr = arrayOf("item 1","item 2","item 3","item 4","item 5","item 6","item 7")
        //adapter
        val ad = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,arr)
        //hien thi len listview
        lv!!.adapter = ad;
    }
}