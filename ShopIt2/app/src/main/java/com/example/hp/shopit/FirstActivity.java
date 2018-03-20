package com.example.hp.shopit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent=new Intent(FirstActivity.this, ActivityTwo.class);
                        intent.putExtra("shop",1);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent1.putExtra("shop",2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(FirstActivity.this, ActivityTwo.class);
                        intent2.putExtra("shop",3);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent3.putExtra("shop",4);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent4.putExtra("shop",5);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent5.putExtra("shop",6);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent6.putExtra("shop",7);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent7.putExtra("shop",8);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent8.putExtra("shop",9);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent9.putExtra("shop",10);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent10.putExtra("shop",11);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent11.putExtra("shop",12);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent12.putExtra("shop",13);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent13.putExtra("shop",14);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent14.putExtra("shop",15);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent15.putExtra("shop",16);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent16.putExtra("shop",17);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent17.putExtra("shop",18);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent18.putExtra("shop",19);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent19.putExtra("shop",20);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent20.putExtra("shop",21);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21=new Intent(FirstActivity.this,ActivityTwo.class);
                        intent21.putExtra("shop",22);
                        startActivity(intent21);
                        break;
                }
            }
        });
    }


}
