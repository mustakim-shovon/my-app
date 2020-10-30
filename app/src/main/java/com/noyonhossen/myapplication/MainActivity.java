package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    String[] listValue = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.ListViewFirstPage);
        listValue = getResources().getStringArray(R.array.first_page_content);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = listValue[i];
                if(value.equals("Indigeneous")){
                    //Toast.makeText(MainActivity.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                }
                else if(value.equals("Intermediate")){
                    //Toast.makeText(MainActivity.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                }
                else if(value.equals("Modern")){
                    //Toast.makeText(MainActivity.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,SecondPage.class);
                    intent.putExtra("tag1",value) ;
                    startActivity(intent);
                }
            }
        });
    }
}
