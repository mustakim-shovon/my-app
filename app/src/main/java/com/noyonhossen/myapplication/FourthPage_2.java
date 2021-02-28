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
            if(text.equals("Workshop_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_tillage") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_2.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_tillage") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Workshop_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_planting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Workshop_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_Inter_cultural") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Workshop_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_Irrigation") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Workshop_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_Harvesting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Workshop_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_2_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Uttaran")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Uttaran_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Krishi Engineering")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_2.this,FifthPage.class);
                            intent.putExtra("tag4","Workshop_Krishi_Engineering_Threshing") ;
                            startActivity(intent);
                        }

                    }
                });
            }
        }
    }
}
