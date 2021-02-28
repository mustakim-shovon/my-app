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
            if(text.equals("Institute_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_tillage") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_tillage") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_tillage") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_tillage") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_tillage") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            if(text.equals("Institute_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_planting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            if(text.equals("Institute_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_Inter_cultural") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            if(text.equals("Institute_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_Irrigation") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            if(text.equals("Institute_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_Harvesting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            if(text.equals("Institute_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_3_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("BMWRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BMWRI_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BARI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BARI_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BRRI")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BRRI_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("BAU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","BAU_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("HSTU")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_3.this,FifthPage.class);
                            intent.putExtra("tag4","HSTU_Threshing") ;
                            startActivity(intent);
                        }

                    }
                });
            }
        }
    }
}
