package com.example.hp.shopit.Models;

import android.content.Context;
import android.util.Log;

import com.example.hp.shopit.R;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 6/9/2017.
 */
public class TitleCreator {
    static TitleCreator _titleCreator;
    List<TitleParent> _titleParents;
    DatabaseReference mRef;

    public TitleCreator(Context context) {
        mRef= FirebaseDatabase.getInstance().getReference();
        _titleParents = new ArrayList<>();

        mRef.addValueEventListener(new com.google.firebase.database.ValueEventListener() {
            @Override
            public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {

                Log.d("data",dataSnapshot.toString());
                _titleParents.clear();
                for(com.google.firebase.database.DataSnapshot ds: dataSnapshot.child("andhra").child("TitleParent").getChildren()) {
                    TitleParent titleParent = new TitleParent();
                    //Toast.makeText(context,ds.getValue(TitleParent.class).getName(),Toast.LENGTH_LONG).show();
                    titleParent.setName(ds.getValue(TitleParent.class).getName());
                    titleParent.setUri(ds.getValue(TitleParent.class).getUri());
                    _titleParents.add(titleParent);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public static TitleCreator get(Context context){
        if(_titleCreator==null)
              _titleCreator=new TitleCreator(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
