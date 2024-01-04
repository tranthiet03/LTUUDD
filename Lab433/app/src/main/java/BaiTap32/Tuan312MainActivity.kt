package BaiTap32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.lab433.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter?=null
    var ls:ArrayList<Tuan312Contact> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)//anh xa
        // tao nguon du lieu
        ls.add(Tuan312Contact("Nguyen Van A","18",R.drawable.android))
        ls.add(Tuan312Contact("Tran Van B","20",R.drawable.apple))
        ls.add(Tuan312Contact("Lai Trong C","17",R.drawable.dell))
        ls.add(Tuan312Contact("Nguyen Duy P","21",R.drawable.hp))
        ls.add(Tuan312Contact("Nguyen Van A","18",R.drawable.android))
        //gan vao adapter
        adap = Tuan312Adapter(this,ls)
        lv.adapter = adap
    }
}