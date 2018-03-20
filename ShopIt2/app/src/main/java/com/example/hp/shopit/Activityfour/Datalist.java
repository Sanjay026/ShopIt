package com.example.hp.shopit.Activityfour;

import android.util.Log;

import com.example.hp.shopit.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 6/13/2017.
 */
public class Datalist {
    static int imageid = R.drawable.ind;
   static DatabaseReference mRef;
   static List<ListItem>data;

   public static List<ListItem> getListData(){
       mRef= FirebaseDatabase.getInstance().getReference();
       data=new ArrayList<>();
       mRef.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               Log.d("data",dataSnapshot.toString());
               data.clear();
               for(DataSnapshot ds:dataSnapshot.child("andhra").child("TitleParent").getChildren()){
                   ListItem item=new ListItem();
                   item.setName(ds.getValue(ListItem.class).getName());
                   item.setName2(ds.getValue(ListItem.class).getName());
                   item.setUri(ds.getValue(ListItem.class).getUri());
                   data.add(item);
               }


           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });

//       for(int x=0;x<15;x++){
//           ListItem item=new ListItem();
//
//           item.setId(imageid);
//           item.setString("Name");
//           item.setString2("Price");
//           data.add(item);
//
//
//       }
       return data;
   }
}
