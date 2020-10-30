package com.noyonhossen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SixthPage extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    String[] listValue = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_page);

        textView = (TextView) findViewById(R.id.TextViewSixthPageID);
        imageView = (ImageView) findViewById(R.id.ImageSixthPageID);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String text = bundle.getString("tag5");
            setTitle(text);
            String value = "";
            if (text.equals("SICMA Rotavator-CTS185")) {

                listValue = getResources().getStringArray(R.array.sixth_page_content_1);
                imageView.setImageResource(R.drawable.picture1);
            } else if (text.equals("SONALIKA Smart Rotavator")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_2);
                imageView.setImageResource(R.drawable.sonalika_s_r);
            }
            else if (text.equals("SICMA Rotavator-CTS165")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_3);
            }
            else if (text.equals("SICMA Rotavator-CTS155")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_4);
            }
            else if (text.equals("Power Tiller-R16")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_5);
                imageView.setImageResource(R.drawable.pt_1);
            }
            else if (text.equals("Power Tiller-R28")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_6);
                imageView.setImageResource(R.drawable.pt_2);
            }
            else if (text.equals("ACI Smart Power Tiller")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_7);
                imageView.setImageResource(R.drawable.aci_pt_1);
            }
            else if (text.equals("Tractor-DI35RX")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_8);
                imageView.setImageResource(R.drawable.tractor_1);
            }
            else if (text.equals("Tractor-DI45RX")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_9);
                imageView.setImageResource(R.drawable.tractor_1);
            }
            else if (text.equals("Tractor-DI50RX")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_10);
                imageView.setImageResource(R.drawable.tractor_1);
            }
            else if (text.equals("Tractor-DI60RX")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_11);
                imageView.setImageResource(R.drawable.tractor_4);
            }
            //2
            else if (text.equals("Power Tiller-GN121")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_12);
                imageView.setImageResource(R.drawable.pt1);
            }
            else if (text.equals("Power Tiller-GN121(16)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_13);
                imageView.setImageResource(R.drawable.pt2);
            }
            else if (text.equals("Power Tiller-GN121(20)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_14);
                imageView.setImageResource(R.drawable.pt3);
            }
            else if (text.equals("Rotavator MASCHIO H-145")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_15);
                imageView.setImageResource(R.drawable.rvt1);
            }
            else if (text.equals("Rotavator MASCHIO H-165")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_16);
                imageView.setImageResource(R.drawable.rvt2);
            }
            else if (text.equals("Rotavator MASCHIO H-185")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_17);
                imageView.setImageResource(R.drawable.rvt3);
            }
            else if (text.equals("Harrow")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_18);
                imageView.setImageResource(R.drawable.harrow1);
            }
            else if (text.equals("Disc Plow")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_19);
                imageView.setImageResource(R.drawable.dp1);
            }
            else if (text.equals("Tractor TAFE 7250DI")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_20);
                imageView.setImageResource(R.drawable.tract1);
            }
            else if (text.equals("Tractor TAFE 8502DI")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_21);
                imageView.setImageResource(R.drawable.tract2);
            }
            //2
            //3
            else if (text.equals("Power Tiller AL101")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_22);
                imageView.setImageResource(R.drawable.pot1);
            }
            else if (text.equals("Power Tiller GN121")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_23);
                imageView.setImageResource(R.drawable.pot2);
            }
            else if (text.equals("Power Tiller GN151")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_24);
                imageView.setImageResource(R.drawable.pot3);

            }
            //3
            //4
            else if (text.equals("Combined Harvester Kubota Pro 88")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_25);
                imageView.setImageResource(R.drawable.ch1);

            }
            else if (text.equals("Combined Harvester Kubota –DC-70G plus")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_26);
                imageView.setImageResource(R.drawable.ch2);
            }
            else if (text.equals("Combined Harvester Kubota –Pro-588i-G")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_27);
                imageView.setImageResource(R.drawable.ch3);
            }
            else if (text.equals("Combined Harvester Kubota – DC 70H plus")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_28);
                imageView.setImageResource(R.drawable.ch4);
            }
            else if (text.equals("Tractor CASEIH JX75T")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_29);
                imageView.setImageResource(R.drawable.tr1);
            }
            else if (text.equals("Tractor CASEIH JX70T")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_30);
                imageView.setImageResource(R.drawable.tr2);
            }
            else if (text.equals("Tractor CASEIH JX55T")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_31);
                imageView.setImageResource(R.drawable.tr3);
            }
            else if (text.equals("Tractor CASEIH JX50T")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_32);
                imageView.setImageResource(R.drawable.tr4);
            }
            else if (text.equals("BREVIGLIERI QA Rotavator")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_33);
                imageView.setImageResource(R.drawable.rt1);
            }
            else if (text.equals("Rotavator Model- B60WPS165")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_34);
                imageView.setImageResource(R.drawable.rt2);
            }
            else if (text.equals("Rotavator Model- B60WPS185")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_35);
                imageView.setImageResource(R.drawable.rt3);
            }
            else if (text.equals("Rotavator Model- B60WPS205")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_36);
                imageView.setImageResource(R.drawable.rt4);
            }
            else if (text.equals("Rice Transplanter Daedong Dp480")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_37);
                imageView.setImageResource(R.drawable.rit1);
            }
            else if (text.equals("Rice Transplanter Daedong S3-680")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_38);
                imageView.setImageResource(R.drawable.rit2);
            }
            else if (text.equals("YANMAR Rice Transplanter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_39);
                imageView.setImageResource(R.drawable.rit3);
            }
            else if (text.equals("ACI Seeder")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_40);
                imageView.setImageResource(R.drawable.seeder);
            }
            else if (text.equals("Thresher S-1100DF")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_41);
                imageView.setImageResource(R.drawable.thresher_aci);

            }
            else if (text.equals("Power Tiller DF12")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_42);
                imageView.setImageResource(R.drawable.pot4);

            }
            else if (text.equals("Power Tiller DF16")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_43);
                imageView.setImageResource(R.drawable.pot5);

            }
            else if (text.equals("Rice Transplanter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_44);
                imageView.setImageResource(R.drawable.rtp);

            }
            else if (text.equals("Seeder (Metal P. Ltd.)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_45);
                imageView.setImageResource(R.drawable.seeder1);

            }
            else if (text.equals("Bed Planter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_46);
                imageView.setImageResource(R.drawable.bedplanter1);

            }
            else if (text.equals("Fiona Seed drill")){
                listValue = getResources().getStringArray(R.array.sixth_page_content_47);
                imageView.setImageResource(R.drawable.sd1);

            }
            else if (text.equals("Vaccuum Precision Planter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_48);
                imageView.setImageResource(R.drawable.vacccuum_pp_abd);

            }
            else if (text.equals("ACI Reaper")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_49);
                imageView.setImageResource(R.drawable.acirpr);

            }
            else if (text.equals("YANMAR Mini Combine Harvester")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_50);
                imageView.setImageResource(R.drawable.aciharvester);

            }
            else if (text.equals("ACI Mini Combine Harvester")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_51);
                imageView.setImageResource(R.drawable.aciminicharvester);

            }
            else if (text.equals("Combine Harvester(Metal Pvt. Ltd.)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_52);
                imageView.setImageResource(R.drawable.metalcharvester);

            }
            else if (text.equals("Reaper(Metal Pvt. Ltd.)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_53);
                imageView.setImageResource(R.drawable.metalrpr);

            }
            else if (text.equals("Rice and Wheat Thresher(Metal Pvt. Ltd.)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_54);
                imageView.setImageResource(R.drawable.rice_wheat_thresher);

            }
            else if (text.equals("Metal Maize Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_55);
                imageView.setImageResource(R.drawable.metal_maize_thresher);

            }






            //4


            value = listValue[0] + "\n";
            value += listValue[1] + "\n";
            value += listValue[2] + "\n";
            value += listValue[3] + "\n";
            value += listValue[4] + "\n";
            value += listValue[5] + "\n";
            textView.setText(value);
        }
    }
}