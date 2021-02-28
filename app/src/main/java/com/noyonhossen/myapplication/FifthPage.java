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

            /* --Company-- */
            //Tillage Company
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
            else if(text.equals("Alim Industries Ltd.")){
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
            //planting Company
            else if(text.equals("ACI Ltd._planting")){
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
            else if(text.equals("Alim Industries Ltd._planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industries_Ltd_planting);
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
            //Inter-cultural Company
            else if(text.equals("ACI Ltd._Inter_cultural")){
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
            else if(text.equals("Alim Industries Ltd._Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industries_Ltd_Inter_cultural);
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
            //Irrigation Company
            else if(text.equals("ACI Ltd._Irrigation")){
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
            else if(text.equals("Alim Industries Ltd._Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industries_Ltd_Irrigation);
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
            //Harvesting Company
            else if(text.equals("ACI Ltd._Harvesting")){
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
            else if(text.equals("Alim Industries Ltd._Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industries_Ltd_Harvesting);
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
            //Threshing Company
            else if(text.equals("ACI Ltd._Threshing")){
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
            else if(text.equals("Alim Industries Ltd._Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Alim_Industries_Ltd_Threshing);
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

            /* --Workshop-- */
            //tillage workshop
            else if(text.equals("Workshop_Uttaran_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_tillage);
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
            else if(text.equals("Workshop_Krishi_Engineering_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_tillage);
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
            //planting workshop
            else if(text.equals("Workshop_Uttaran_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_planting);
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
            else if(text.equals("Workshop_Krishi_Engineering_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_planting);
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
            //inter cultural workshop
            else if(text.equals("Workshop_Uttaran_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_Inter_cultural);
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
            else if(text.equals("Workshop_Krishi_Engineering_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_Inter_cultural);
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
            //irrigation workshop
            else if(text.equals("Workshop_Uttaran_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_Irrigation);
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
            else if(text.equals("Workshop_Krishi_Engineering_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_Irrigation);
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
            //harvesting workshop
            else if(text.equals("Workshop_Uttaran_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_Harvesting);
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
            else if(text.equals("Workshop_Krishi_Engineering_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_Harvesting);
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
            //Threshing workshop
            else if(text.equals("Workshop_Uttaran_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Uttaran_Threshing);
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
            else if(text.equals("Workshop_Krishi_Engineering_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.Workshop_Krishi_Engineering_Threshing);
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



            /* --Institute-- */
            //tillage Institute
            else if(text.equals("BMWRI_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_tillage);
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
            else if(text.equals("BARI_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_tillage);
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
            else if(text.equals("BRRI_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_tillage);
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
            else if(text.equals("BAU_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_tillage);
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
            else if(text.equals("HSTU_tillage")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_tillage);
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
            //planting Institute
            else if(text.equals("BMWRI_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_planting);
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
            else if(text.equals("BARI_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_planting);
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
            else if(text.equals("BRRI_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_planting);
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
            else if(text.equals("BAU_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_planting);
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
            else if(text.equals("HSTU_planting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_planting);
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
            //inter cultural Institute
            else if(text.equals("BMWRI_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_Inter_cultural);
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
            else if(text.equals("BARI_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_Inter_cultural);
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
            else if(text.equals("BRRI_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_Inter_cultural);
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
            else if(text.equals("BAU_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_Inter_cultural);
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
            else if(text.equals("HSTU_Inter_cultural")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_Inter_cultural);
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
            //irrigation Institute
            else if(text.equals("BMWRI_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_Irrigation);
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
            else if(text.equals("BARI_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_Irrigation);
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
            else if(text.equals("BRRI_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_Irrigation);
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
            else if(text.equals("BAU_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_Irrigation);
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
            else if(text.equals("HSTU_Irrigation")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_Irrigation);
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
            //harvesting Institute
            else if(text.equals("BMWRI_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_Harvesting);
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
            else if(text.equals("BARI_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_Harvesting);
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
            else if(text.equals("BRRI_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_Harvesting);
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
            else if(text.equals("BAU_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_Harvesting);
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
            else if(text.equals("HSTU_Harvesting")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_Harvesting);
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
            //Threshing Institute
            else if(text.equals("BMWRI_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BMWRI_Threshing);
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
            else if(text.equals("BARI_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BARI_Threshing);
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
            else if(text.equals("BRRI_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BRRI_Threshing);
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
            else if(text.equals("BAU_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.BAU_Threshing);
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
            else if(text.equals("HSTU_Threshing")){
                setTitle(text);
                listValue = getResources().getStringArray(R.array.HSTU_Threshing);
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
