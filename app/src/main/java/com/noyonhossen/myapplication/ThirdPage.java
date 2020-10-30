package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ThirdPage extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        listView = (ListView)findViewById(R.id.ListViewThirdPage);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("tag2");
            if(text.equals("Tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute") ;
                            startActivity(intent);
                        }
                    }
                });
            }
            else if(text.equals("Planting")){
                //Toast.makeText(ThirdPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop_planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute_planting") ;
                            startActivity(intent);
                        }
                    }
                });
            }
            else if(text.equals("Inter-cultural")){
                //Toast.makeText(ThirdPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop_Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute_Inter_cultural") ;
                            startActivity(intent);
                        }
                    }
                });
            }
            else if(text.equals("Irrigation")){
                //Toast.makeText(ThirdPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop_Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute_Irrigation") ;
                            startActivity(intent);
                        }
                    }
                });
            }
            else if(text.equals("Harvesting")){
                //Toast.makeText(ThirdPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop_Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute_Harvesting") ;
                            startActivity(intent);
                        }
                    }
                });
            }
            else if(text.equals("Threshing")){
                //Toast.makeText(ThirdPage.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                setTitle(text);
                listValue = getResources().getStringArray(R.array.third_page_content_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("Company")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_1.class);
                            intent.putExtra("tag3","Company_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Workshop")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_2.class);
                            intent.putExtra("tag3","Workshop_Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Institute")){
                            //Toast.makeText(ThirdPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(ThirdPage.this,FourthPage_3.class);
                            intent.putExtra("tag3","Institute_Threshing") ;
                            startActivity(intent);
                        }
                    }
                });
            }
        }
    }
}
