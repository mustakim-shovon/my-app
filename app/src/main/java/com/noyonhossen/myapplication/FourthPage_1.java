package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FourthPage_1 extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page_1);

        listView = (ListView)findViewById(R.id.ListViewFourthPage_1);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("tag3");
            if(text.equals("Company_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd.") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd.") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd.") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd.") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Company_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd._planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd._planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd._planting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd._planting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Company_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd._Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd._Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd._Inter_cultural") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd._Inter_cultural") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Company_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd._Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd._Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd._Irrigation") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd._Irrigation") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Company_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd._Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd._Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd._Harvesting") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd._Harvesting") ;
                            startActivity(intent);
                        }

                    }
                });
            }
            else if(text.equals("Company_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fourth_page_1_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        if(value.equals("ACI Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","ACI Ltd._Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Metal Private Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Metal Private Ltd._Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Alim Industries Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Alim Industries Ltd._Threshing") ;
                            startActivity(intent);
                        }
                        else if(value.equals("Abedin Equipment Ltd.")){
                            //Toast.makeText(FourthPage_1.this,"Features not implemented yet",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FourthPage_1.this,FifthPage.class);
                            intent.putExtra("tag4","Abedin Equipment Ltd._Threshing") ;
                            startActivity(intent);
                        }

                    }
                });
            }
        }
    }
}
