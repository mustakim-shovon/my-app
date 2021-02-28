package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        listView = (ListView)findViewById(R.id.ListViewSecondPage);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("Modern");
            if(text.equals("Modern")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.second_page_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Tillage")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                        else if(value.equals("Planting")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                        else if(value.equals("Inter-cultural")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            //Toast.makeText(SecondPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                        else if(value.equals("Irrigation")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            //Toast.makeText(SecondPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                        else if(value.equals("Harvesting")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            //Toast.makeText(SecondPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                        else if(value.equals("Threshing")){
                            //Toast.makeText(SecondPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            //Toast.makeText(SecondPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SecondPage.this,ThirdPage.class);
                            intent.putExtra("tag2",value) ;
                            startActivity(intent);
                        }
                    }
                });
            }

        }
    }
}
