package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FifthPage extends AppCompatActivity {
    ListView listView;
    String[] listValue = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);

        listView = (ListView)findViewById(R.id.ListViewFifthPage);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String text = bundle.getString("tag4");
            //ACI Ltd
            if(text.equals("ACI Ltd.")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fifth_page_content);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd.")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fifth_page_content_2);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd.")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fifth_page_content_3);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd.")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fifth_page_content_4);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            //planting
            if(text.equals("ACI Ltd._planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.AC_Ltd_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd._planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Metal_Private_Ltd_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd._planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.fifth_page_content_3);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd._planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Abedin_Equipment_Ltd_planting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            //Inter-cultural
            if(text.equals("ACI Ltd._Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.AC_Ltd_Inter_cultural);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd._Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Metal_Private_Ltd_Inter_cultural);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd._Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industires_Ltd_Inter_cultural);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd._Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Abedin_Equipment_Ltd_Inter_cultural);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            //Irrigation
            if(text.equals("ACI Ltd._Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.AC_Ltd_Irrigation);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd._Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Metal_Private_Ltd_Irrigation);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd._Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industires_Ltd_Irrigation);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd._Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Abedin_Equipment_Ltd_Irrigation);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            //Harvesting
            if(text.equals("ACI Ltd._Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.AC_Ltd_Harvesting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd._Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Metal_Private_Ltd_Harvesting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd._Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industires_Ltd_Harvesting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd._Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Abedin_Equipment_Ltd_Harvesting);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            //Threshing
            if(text.equals("ACI Ltd._Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.AC_Ltd_Threshing);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });
            }
            else if(text.equals("Metal Private Ltd._Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Metal_Private_Ltd_Threshing);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Alim Industires Ltd._Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industires_Ltd_Threshing);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }
            else if(text.equals("Abedin Equipment Ltd._Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Abedin_Equipment_Ltd_Threshing);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_layout, R.id.sample_layout_id,listValue );
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String value = listValue[i];
                        Intent intent = new Intent(FifthPage.this,SixthPage.class);
                        /*if(value.equals("SICMA Rotavator")){
                            //Toast.makeText(FifthPage.this,"Value: "+value,Toast.LENGTH_SHORT).show();
                            intent.putExtra("tag5","SICMA Rotavator") ;
                        }*/
                        intent.putExtra("tag5",value) ;
                        startActivity(intent);
                    }
                });

            }

        }
    }
}
