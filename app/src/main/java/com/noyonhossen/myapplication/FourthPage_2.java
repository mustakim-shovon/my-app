package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FourthPage_2 extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page_2);

        listView = (ListView)findViewById(R.id.ListViewFourthPage_2);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("tag3");
            if(text.equals("Workshop")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            /*Toast.makeText(FourthPage_2.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd.") ;
                            startActivity(intent);*/
                        }
                        else if(value.equals("Krishi Engineering")){
                            Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("Janata Engineering")){
                            Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("Mahabub Engineering")){
                            Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        }
    }
}
