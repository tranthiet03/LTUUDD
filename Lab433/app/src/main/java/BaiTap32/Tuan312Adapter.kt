package BaiTap32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lab433.R

class Tuan312Adapter(context: Context, ls: ArrayList<Tuan312Contact>):BaseAdapter() {
    var ls:ArrayList<Tuan312Contact> = ls
    var context: Context = context
    //lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }
    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //lay id cua item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //tao view
    //gan ru lieu cho view
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1.tao view
        //1.1 neu cho co view -> tao view moi
        var vax: ViewAX
        if(c == null)
        {
            vax = ViewAX() // tao view moi
            //anh xa layout
            c=LayoutInflater.from(context).inflate(R.layout.tuan312_item_view,null)
            //anh xa tung thanh phan cua layout
            vax.img_hinh = c.findViewById(R.id.tuan312ItemHinh)
            vax.tv_ten = c.findViewById(R.id.tuan312ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.tuan312ItemTuoi)
            //tao template cho lan sau su dung
            c.tag = vax
        }
        //1.2 neu co view -> su dung view cu
        else
        {
            vax=c!!.tag as ViewAX
        }
        //2.gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text=ls[position].ten!!
        vax.tv_tuoi!!.text=ls[position].tuoi!!
        return c!!
    }
    //khai bao lop anh xa ItemView
    inner class ViewAX{
        var img_hinh: ImageView?=null
        var tv_ten: TextView?=null
        var tv_tuoi: TextView?=null
    }
}