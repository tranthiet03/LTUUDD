package com.example.lab433;

import static java.lang.String.*;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public CustomAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        //thiết lập ViewHolder
        if(convertView == null)//nếu view chưa có sẵn
        {

            convertView = inflater.inflate(R.layout.item_listview,null);
            holder.tvAvatar = (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            holder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);

            convertView.setTag(holder);
        }
        else//nếu view có sẵn
        {
            //lấy về ViewHolder
            holder= (ViewHolder) convertView.getTag();
        }
        //Gắn dữ liệu cho view
        Contact contact = objects.get(position);
        holder.tvAvatar.setText(contact.getAvatar());//lấy về text avatar
        holder.tvAvatar.setBackgroundColor(Color.RED);
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        return convertView;
    }

    public class ViewHolder{
        TextView tvAvatar,tvName,tvPhone;
    }
}
