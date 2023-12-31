package com.example.lab433;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("RED","Nguyen Van A","0912345678");
        Contact contact2 = new Contact("RED","Tran Van B","0123456789");
        arrContact.add(contact1);
        arrContact.add(contact2);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.item_listview,arrContact);
        lvContact.setAdapter(adapter);
    }
}


