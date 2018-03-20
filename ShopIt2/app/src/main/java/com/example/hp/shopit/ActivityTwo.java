package com.example.hp.shopit;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity{
    Button buttonshop;
    ImageView imageView;
    TextView textview;
    String categories[];
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);
        final CollapsingToolbarLayout collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collaspingtoolbar);
        imageView=(ImageView)findViewById(R.id.toolbarImage);
        textview=(TextView)findViewById(R.id.textactivity2);
        Bundle extras=getIntent().getExtras();
        i=extras.getInt("shop");
        switch (i){
            case 1:
                imageView.setImageResource(R.drawable.andra2);
                collapsingToolbarLayout.setTitle("AndhraPradesh");
                categories=getResources().getStringArray(R.array.andra);
                StringBuilder builder=new StringBuilder();
                for(String c:categories){
                    builder.append(c+"\n");
                }
                textview.setText(builder.toString());
                break;
            case 2:
                imageView.setImageResource(R.drawable.bihar2);
                collapsingToolbarLayout.setTitle("Bihar");
                categories=getResources().getStringArray(R.array.bihar);
                StringBuilder builder1=new StringBuilder();
                for(String b:categories)
                      builder1.append(b+"\n");
                textview.setText(builder1.toString());
                break;
            case 3:
                imageView.setImageResource(R.drawable.chhatisgarh2);
                collapsingToolbarLayout.setTitle("Chhattisgarh");
                categories=getResources().getStringArray(R.array.chhatis);
                StringBuilder builder2=new StringBuilder();
                for(String b:categories)
                    builder2.append(b+"\n");
                textview.setText(builder2.toString());
                break;
            case 4:
                imageView.setImageResource(R.drawable.delhi2);
                collapsingToolbarLayout.setTitle("Delhi");
                categories=getResources().getStringArray(R.array.Delhi);
                StringBuilder builder3=new StringBuilder();
                for(String b:categories)
                    builder3.append(b+"\n");
                textview.setText(builder3.toString());
                break;
            case 5:
                imageView.setImageResource(R.drawable.goa2);
                collapsingToolbarLayout.setTitle("Goa");
                categories=getResources().getStringArray(R.array.Goa);
                StringBuilder builder4=new StringBuilder();
                for(String b:categories)
                    builder4.append(b+"\n");
                textview.setText(builder4.toString());
                break;
            case 6:
                imageView.setImageResource(R.drawable.gujrat2);
                collapsingToolbarLayout.setTitle("Gujrat");
                categories=getResources().getStringArray(R.array.Gujrat);
                StringBuilder builder5=new StringBuilder();
                for(String b:categories)
                    builder5.append(b+"\n");
                textview.setText(builder5.toString());
                break;
            case 7:
                imageView.setImageResource(R.drawable.himachal2);
                collapsingToolbarLayout.setTitle("HimachalPradesh");
                categories=getResources().getStringArray(R.array.Himachal);
                StringBuilder builder6=new StringBuilder();
                for(String b:categories)
                    builder6.append(b+"\n");
                textview.setText(builder6.toString());
                break;
            case 8:
                imageView.setImageResource(R.drawable.kash2);
                collapsingToolbarLayout.setTitle("Jammu&Kashmir");
                categories=getResources().getStringArray(R.array.Jammu);
                StringBuilder builder7=new StringBuilder();
                for(String b:categories)
                    builder7.append(b+"\n");
                textview.setText(builder7.toString());
                break;
            case 9:
                imageView.setImageResource(R.drawable.jhar2);
                collapsingToolbarLayout.setTitle("Jharkhand");
                categories=getResources().getStringArray(R.array.Jhar);
                StringBuilder builder8=new StringBuilder();
                for(String b:categories)
                    builder8.append(b+"\n");
                textview.setText(builder8.toString());
                break;
            case 10:
                imageView.setImageResource(R.drawable.karn2);
                collapsingToolbarLayout.setTitle("Karnataka");
                categories=getResources().getStringArray(R.array.Karnat);
                StringBuilder builder9=new StringBuilder();
                for(String b:categories)
                    builder9.append(b+"\n");
                textview.setText(builder9.toString());
                break;
            case 11:
                imageView.setImageResource(R.drawable.keral2);
                collapsingToolbarLayout.setTitle("Kerala");
                categories=getResources().getStringArray(R.array.Kerala);
                StringBuilder builder10=new StringBuilder();
                for(String b:categories)
                    builder10.append(b+"\n");
                textview.setText(builder10.toString());
                break;
            case 12:
                imageView.setImageResource(R.drawable.mahar2);
                collapsingToolbarLayout.setTitle("Maharashatra");
                categories=getResources().getStringArray(R.array.Maha);
                StringBuilder builder11=new StringBuilder();
                for(String b:categories)
                    builder11.append(b+"\n");
                textview.setText(builder11.toString());
                break;
            case 13:
                imageView.setImageResource(R.drawable.ori2);
                collapsingToolbarLayout.setTitle("Odisha");
                categories=getResources().getStringArray(R.array.ori);
                StringBuilder builder12=new StringBuilder();
                for(String b:categories)
                    builder12.append(b+"\n");
                textview.setText(builder12.toString());
                break;
            case 14:
                imageView.setImageResource(R.drawable.pond2);
                collapsingToolbarLayout.setTitle("Pondicherry");
                categories=getResources().getStringArray(R.array.pondi);
                StringBuilder builder13=new StringBuilder();
                for(String b:categories)
                    builder13.append(b+"\n");
                textview.setText(builder13.toString());
                break;
            case 15:
                imageView.setImageResource(R.drawable.pun2);
                collapsingToolbarLayout.setTitle("Punjab");
                categories=getResources().getStringArray(R.array.Punjab);
                StringBuilder builder14=new StringBuilder();
                for(String b:categories)
                    builder14.append(b+"\n");
                textview.setText(builder14.toString());
                break;
            case 16:
                imageView.setImageResource(R.drawable.raj2);
                collapsingToolbarLayout.setTitle("Rajasthan");
                categories=getResources().getStringArray(R.array.Raj);
                StringBuilder builder15=new StringBuilder();
                for(String b:categories)
                    builder15.append(b+"\n");
                textview.setText(builder15.toString());
                break;
            case 17:
                imageView.setImageResource(R.drawable.skm2);
                collapsingToolbarLayout.setTitle("Sikkim");
                categories=getResources().getStringArray(R.array.skim);
                StringBuilder builder16=new StringBuilder();
                for(String b:categories)
                    builder16.append(b+"\n");
                textview.setText(builder16.toString());
                break;
            case 18:
                imageView.setImageResource(R.drawable.tami2);
                collapsingToolbarLayout.setTitle("TamilNadu");
                categories=getResources().getStringArray(R.array.tamil);
                StringBuilder builder17=new StringBuilder();
                for(String b:categories)
                    builder17.append(b+"\n");
                textview.setText(builder17.toString());
                break;
            case 19:
                imageView.setImageResource(R.drawable.tel2);
                collapsingToolbarLayout.setTitle("Telangana");
                categories=getResources().getStringArray(R.array.telan);
                StringBuilder builder18=new StringBuilder();
                for(String b:categories)
                    builder18.append(b+"\n");
                textview.setText(builder18.toString());
                break;
            case 20:
                imageView.setImageResource(R.drawable.up2);
                collapsingToolbarLayout.setTitle("UttarPradesh");
                categories=getResources().getStringArray(R.array.up);
                StringBuilder builder19=new StringBuilder();
                for(String b:categories)
                    builder19.append(b+"\n");
                textview.setText(builder19.toString());
                break;
            case 21:
                imageView.setImageResource(R.drawable.uttr2);
                collapsingToolbarLayout.setTitle("Uttrakhand");
                collapsingToolbarLayout.setContentScrimColor(0xFFDD0D);
                break;
            case 22:
                imageView.setImageResource(R.drawable.west2);
                collapsingToolbarLayout.setTitle("WestBengal");
                categories=getResources().getStringArray(R.array.wb);
                StringBuilder builder21=new StringBuilder();
                for(String b:categories)
                    builder21.append(b+"\n");
                textview.setText(builder21.toString());
                break;
        }


        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.transparent));
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        buttonshop=(Button)findViewById(R.id.shop);
        buttonshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ActivityThree.class));
            }
        });

    }
}
