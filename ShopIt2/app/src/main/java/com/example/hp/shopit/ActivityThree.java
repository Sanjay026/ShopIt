package com.example.hp.shopit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.hp.shopit.Adapter.ThisAdapter;
import com.example.hp.shopit.Models.TitleCreator;
import com.example.hp.shopit.Models.TitleParent;

import java.util.ArrayList;
import java.util.List;

public class ActivityThree extends AppCompatActivity {
    private RecyclerView recyclerView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final ThisAdapter adapter=new ThisAdapter(this,initData());
        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        TitleCreator titleCreator=TitleCreator.get(this);
        List<TitleParent>titles=titleCreator.getAll();
        List<ParentObject>parentObject=new ArrayList<>();
        for(TitleParent title:titles){
//            List<Object> childList=new ArrayList<>();
//            childList.add(new TitleChild(getString(R.string.cardview)));
//            title.setChildObjectList(childList);
            parentObject.add(title);
        }
        return parentObject;
    }


}

