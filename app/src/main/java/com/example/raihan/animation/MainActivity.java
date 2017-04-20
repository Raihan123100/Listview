package com.example.raihan.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b;
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lv=(ListView) findViewById(R.id.listView);



       final String[]pcs={"Macbook pro","Macbook","Imac","Asus","Fujitsu","Apple","Hp"};
        ArrayAdapter adapter= new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid,pcs );
        lv.setAdapter(adapter);

     lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


             Toast.makeText(getApplicationContext(),"Clicked on "+pcs[position]
                     ,Toast.LENGTH_LONG).show();



         }
     });









    }





}
