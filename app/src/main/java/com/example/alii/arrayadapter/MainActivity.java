package com.example.alii.arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
String [] name ={"pawan","raman","chaman","naman"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    listView=findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this,
                android.R.layout.simple_expandable_list_item_1, name);
    //to attach listview with adapter
    listView.setAdapter(arrayAdapter);
    //to click
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            //pass the data using intent
            intent.putExtra("keyname", position);
            startActivity(intent);
        }
    });
    }

}
