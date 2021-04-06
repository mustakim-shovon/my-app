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
            else if (text.equals("Rice Transplanter Daedong S3680")) {
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
            else if (text.equals("BRRI Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_55);
                imageView.setImageResource(R.drawable.brri_thresher);

            }
            ///Tillage workshop
            else if (text.equals("BRRI Open Drum Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_56);
                imageView.setImageResource(R.drawable.brri_odt);

            }
            else if (text.equals("BRRI Power Tiller")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_57);
                imageView.setImageResource(R.drawable.brri_pt);

            }
            ///Tillge institute
            else if (text.equals("Rice and Wheat Cutter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_58);
                imageView.setImageResource(R.drawable.brri_rwc);

            }
            else if (text.equals("BRRI Weeder")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_59);
                imageView.setImageResource(R.drawable.brri_weeder);

            }
            else if (text.equals("BARI High Speed Rotary Tiller")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_60);
                imageView.setImageResource(R.drawable.bari_tiller);

            }
            else if (text.equals("BARI PTOS")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_61);
                imageView.setImageResource(R.drawable.bari_ptos);

            }
            else if (text.equals("Bed Planter(BARI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_62);
                imageView.setImageResource(R.drawable.bed_planter);

            }
            else if (text.equals("Zero Tillage Planter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_63);
                imageView.setImageResource(R.drawable.zero_tp);

            }
            else if (text.equals("USG Applicator")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_64);
                imageView.setImageResource(R.drawable.usg_app);

            }
            else if (text.equals("BARI Reaper")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_65);
                imageView.setImageResource(R.drawable.bari_reaper);

            }
            else if (text.equals("Potato Harvester")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_66);
                imageView.setImageResource(R.drawable.p_harvester);

            }
            else if (text.equals("Multi Crop Thresher(BARI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_67);
                imageView.setImageResource(R.drawable.multi_crop);

            }
            else if (text.equals("Hand Maize Sheller(BARI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_68);
                imageView.setImageResource(R.drawable.hand_maize);

            }
            else if (text.equals("Power maize Sheller(BARI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_69);
                imageView.setImageResource(R.drawable.power_maize);

            }
            else if (text.equals("Garden boom Sprayer")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_70);
                imageView.setImageResource(R.drawable.garden_bsprayer);

            }
            else if (text.equals("Solar Pump")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_71);
                imageView.setImageResource(R.drawable.solar_pump);

            }
            else if (text.equals("Axial Flow Pump")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_72);
                imageView.setImageResource(R.drawable.axial_flow);

            }
            else if (text.equals("Ground Nut Sheller")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_73);
                imageView.setImageResource(R.drawable.groundnut_sheller);

            }
            else if (text.equals("Multi-crop Planter (AVMP101)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_74);
                imageView.setImageResource(R.drawable.multi_cropalim);

            }
            else if (text.equals("Power tiller operator seeder (APTOS101)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_75);
                imageView.setImageResource(R.drawable.pt_seeder_alim);

            }
            else if (text.equals("Bed planter (ABP101)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_76);
                imageView.setImageResource(R.drawable.bedplanter_alim);

            }
            else if (text.equals("Rice transplanting planting(Alim)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_77);
                imageView.setImageResource(R.drawable.rtp_alim);

            }
            else if (text.equals("U.S.G Applicator A20USG")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_78);
                imageView.setImageResource(R.drawable.usg_alim);

            }
            else if (text.equals("Hand sprayer A18L")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_79);
                imageView.setImageResource(R.drawable.hsprayer_alim1);

            }
            else if (text.equals("Hand sprayer A16L")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_80);
                imageView.setImageResource(R.drawable.hsprayer_alim2);

            }
            else if (text.equals("Food pump sprayer APP07")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_81);
                imageView.setImageResource(R.drawable.food_sprayeralim);

            }
            else if (text.equals("Low lift pump (ALP101)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_82);
                imageView.setImageResource(R.drawable.llp_alim);

            }
            else if (text.equals("Axial Flow low lift pump (AAFP101)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_83);
                imageView.setImageResource(R.drawable.axial_alim);

            }
            else if (text.equals("Power reaper APR101")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_84);
                imageView.setImageResource(R.drawable.pr_alim1);

            }
            else if (text.equals("Power reaper APR102")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_85);
                imageView.setImageResource(R.drawable.pr_alim2);

            }
            else if (text.equals("Hand reaper CG430F")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_86);
                imageView.setImageResource(R.drawable.hand_reaper_alim);

            }
            else if (text.equals("Maize Thresher BARI Design")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_87);
                imageView.setImageResource(R.drawable.maize_alim1);

            }
            else if (text.equals("Rice Thresher BRRI Design")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_88);
                imageView.setImageResource(R.drawable.rice_threshe_alim);

            }
            else if (text.equals("Open drum Thresher A30ODT")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_89);
                imageView.setImageResource(R.drawable.open_drum_alim);

            }
            else if (text.equals("Power Tiller Operated Moldboard Plow")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_90);
                imageView.setImageResource(R.drawable.plow_bmwri);

            }
            else if (text.equals("Electrical Seeder (BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_91);
                imageView.setImageResource(R.drawable.eseeder_bmwri);

            }
            else if (text.equals("Power Tiller Operated seeder(BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_92);
                imageView.setImageResource(R.drawable.ptos_bmwri);

            }
            else if (text.equals("Bed Planter(BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_93);
                imageView.setImageResource(R.drawable.bed_bmwri);

            }
            else if (text.equals("Potato Planter(BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_94);
                imageView.setImageResource(R.drawable.pplanter_bmwri);

            }
            else if (text.equals("Multi Nozzle Sprayer (BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_95);
                imageView.setImageResource(R.drawable.mn_bmwri);

            }
            else if (text.equals("Boom Sprayer (BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_96);
                imageView.setImageResource(R.drawable.bsprayer_bmwri);

            }
            else if (text.equals("Portable Reaper(BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_97);
                imageView.setImageResource(R.drawable.preaper_bmwri);

            }
            else if (text.equals("Mobile Maize Sheller (BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_98);
                imageView.setImageResource(R.drawable.bmwri_maize);

            }
            else if (text.equals("Power Maize Sheller (BMWRI)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_99);
                imageView.setImageResource(R.drawable.power_bmwri);

            }
            else if (text.equals("Mold Board Plow (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_100);
                imageView.setImageResource(R.drawable.krishi_mbplow);
            }
            else if (text.equals("Potato Planter 1 (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_101);
                imageView.setImageResource(R.drawable.krishi_pp);

            }
            else if (text.equals("Potato Planter 2 (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_102);
                imageView.setImageResource(R.drawable.krishi_pp2);

            }
            else if (text.equals("Maize Planter and Seeder (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_103);
                imageView.setImageResource(R.drawable.krishi_mplanter);

            }
            else if (text.equals("Zero tillage Wheat")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_104);
                imageView.setImageResource(R.drawable.krishi_zerotill);

            }
            else if (text.equals("Bed planter(Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_105);
                imageView.setImageResource(R.drawable.krishi_bed);

            }
            else if (text.equals("Reaper (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_106);
                imageView.setImageResource(R.drawable.krishi_reaper);

            }
            else if (text.equals("Maize Sheller(Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_107);
                imageView.setImageResource(R.drawable.krishi_maize);

            }
            else if (text.equals("Thresher (Krishi)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_108);
                imageView.setImageResource(R.drawable.krishi_thresher);

            }
            else if (text.equals("Rice Transplanter (Uttaran)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_109);
                imageView.setImageResource(R.drawable.uttaran_rt);

            }
            else if (text.equals("Power Tiller Seeder (BARI Model)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_110);
                imageView.setImageResource(R.drawable.uttaran_pt);

            }
            else if (text.equals("Uttaran Power Weeder (BARI Model)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_111);
                imageView.setImageResource(R.drawable.uttaran_pw);

            }
            else if (text.equals("Battery Operated Power Weeder (BARI Model)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_112);
                imageView.setImageResource(R.drawable.uttaran_bopw);

            }
            else if (text.equals("Uttaran Power Tiller Operated Reaper")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_113);
                imageView.setImageResource(R.drawable.uttaran_ptor);

            }
            else if (text.equals("Potato Harvester (BARI Model)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_114);
                imageView.setImageResource(R.drawable.uttaran_ph);

            }
            else if (text.equals("Uttaran Reaper Binder")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_115);
                imageView.setImageResource(R.drawable.uttaran_rb);

            }
            else if (text.equals("Uttaran Reaper")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_116);
                imageView.setImageResource(R.drawable.uttaran_reaper);

            }
            else if (text.equals("Uttaran Maize Sheller")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_117);
                imageView.setImageResource(R.drawable.uttaran_maize);

            }
            else if (text.equals("Uttaran Wheat and Maize Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_118);
                imageView.setImageResource(R.drawable.uttaran_mwt);

            }
            else if (text.equals("Metal Maize Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_119);
                imageView.setImageResource(R.drawable.metal_maize_thresher);

            }
            else if (text.equals("BAU Urea Applicator (1)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_120);
                imageView.setImageResource(R.drawable.bau_inter1);

            }
            else if (text.equals("BAU Urea Applicator (2)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_121);
                imageView.setImageResource(R.drawable.bau_inter2);

            }
            else if (text.equals("BAU Urea Applicator (3)")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_122);
                imageView.setImageResource(R.drawable.bau_inter3);

            }
            else if (text.equals("BAU Hand Sprayer")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_123);
                imageView.setImageResource(R.drawable.bau_inter4);

            }
            else if (text.equals("BAU ZIA Fertilizer and Seed Applicator")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_124);
                imageView.setImageResource(R.drawable.bau_inter5);

            }
            else if (text.equals("Germinated Seed Applicator")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_125);
                imageView.setImageResource(R.drawable.bau_planting1);

            }
            else if (text.equals("BAU Transplanter")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_126);
                imageView.setImageResource(R.drawable.bau_planting2);

            }
            else if (text.equals("BAU Maize Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_127);
                imageView.setImageResource(R.drawable.bau_thresher1);

            }
            else if (text.equals("BAU Open Drum Thresher")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_128);
                imageView.setImageResource(R.drawable.bau_thresher2);

            }
            else if (text.equals("Rice or Wheat Cutter Machine")) {
                listValue = getResources().getStringArray(R.array.sixth_page_content_129);
                imageView.setImageResource(R.drawable.bau_harvesting);

            }



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