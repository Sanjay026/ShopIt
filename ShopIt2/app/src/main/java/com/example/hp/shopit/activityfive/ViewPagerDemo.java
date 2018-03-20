package com.example.hp.shopit.activityfive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.hp.shopit.R;
import com.example.hp.shopit.Registration;

import java.util.ArrayList;
import java.util.List;


public class ViewPagerDemo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ViewPager viewpager;
    ViewPagerAdapter viewpageradapter;
    Spinner spinner;
    private int dotsCount;
    private ImageView[] dots;
    LinearLayout pager_indicator;
    List<String> list;
    ArrayAdapter<String> arrayAdapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfive);
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        spinner= (Spinner) findViewById(R.id.spinner);
        viewpageradapter=new ViewPagerAdapter(this);
        pager_indicator=(LinearLayout)findViewById(R.id.viewPagerCountDots);
        viewpager.setAdapter(viewpageradapter);
        list=new ArrayList<>();
        spinner.setOnItemSelectedListener(this);
        button=(Button)findViewById(R.id.addtocart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Registration.class));
            }
        });
        setUiPageViewController();
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotsCount; i++) {
                    dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem_dot));
                }

                dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        list.add("UK 7");
        list.add("UK 8");
        list.add("UK 9");
        list.add("UK 10");

        arrayAdapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,list);
        spinner.setAdapter(arrayAdapter);

    }

    private void setUiPageViewController() {

        dotsCount = viewpageradapter.getCount();
        dots = new ImageView[dotsCount];

        for (int i = 0; i < dotsCount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.nonselecteditem_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);

            pager_indicator.addView(dots[i], params);
        }

        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selecteditem_dot));
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //item is selected
        String item=parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(),"Seleted"+item,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}