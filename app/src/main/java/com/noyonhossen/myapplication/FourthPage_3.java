package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FourthPage_3 extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page_3);

        listView = (ListView)findViewById(R.id.ListViewFourthPage_3);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("tag3");
            if(text.equals("Institute")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            /*Toast.makeText(FourthPage_3.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd.") ;
                            startActivity(intent);*/
                        }
                        else if(value.equals("BARI")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("BSRI")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("BRRI")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("RDA")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("BAU")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }
                        else if(value.equals("HSTU")){
                            Toast.makeText(FourthPage_3.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        }
    }
}
