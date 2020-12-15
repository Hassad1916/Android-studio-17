package com.example.listview20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String[] values = new String[]{
            "item 1","item 2","item 3","item 4"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview =(ListView) findViewById(R.id.list);
        ListAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                TextView k = (TextView)findViewById(R.id.tv);
                k.setText("點選第"+(i+1)+"個\n內容:"+values[i]);
            }


        });
    }
}