package com.example.hp.shopit.Adapter;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import com.example.hp.shopit.Activity4;
import com.example.hp.shopit.Models.TitleParent;
import com.example.hp.shopit.R;
import com.example.hp.shopit.ViewHolder.TitleParentViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by HP on 6/9/2017.
 */
public class ThisAdapter extends RecyclerView.Adapter<TitleParentViewHolder> {
   // public Context context;
    LayoutInflater inflater;
    Context contextm;
    List<ParentObject>list;
    ProgressDialog progressDialog;

    public ThisAdapter(Context context, List<ParentObject> parentItemList) {
        inflater=(LayoutInflater.from(context));
        contextm=context;
        list=parentItemList;



    }

    @Override
    public TitleParentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_parent,parent,false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TitleParentViewHolder holder, final int position) {
        ParentObject pr=list.get(position);
        TitleParent title=(TitleParent)pr;
        holder._textView.setText(title.getName());
        Picasso.with(contextm).load(title.getUri()).fit().placeholder(R.drawable.goa).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        contextm.startActivity(new Intent(contextm, Activity4.class));
                        break;
                    case 1:
                        Toast.makeText(contextm,"second",Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

//
//    @Override
//    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
//        View view=inflater.inflate(R.layout.list_child,viewGroup,false);
//        return new TitleChildViewHolder(view);
//    }
//
//    @Override
//    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
//        TitleParent title=(TitleParent)o;
//        titleParentViewHolder._textView.setText(title.getTitle());
//        titleParentViewHolder.imageView.setImageResource(title.getImageid());
//
//    }
//
//    @Override
//    public void onBindChildViewHolder(final TitleChildViewHolder titleChildViewHolder, int i, Object o) {
//
//         TitleChild title=(TitleChild)o;
//        titleChildViewHolder.option1.setText(title.getOption1());
//
//        titleChildViewHolder.buttonshop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                  int position=titleChildViewHolder.getAdapterPosition();
//                  switch (position){
//                      case 1:{
//                          v.getContext().startActivity(new Intent(v.getContext(), Activity4.class));
//                          break;
//                      }
//
//                      case 2:
//                          Toast.makeText(v.getContext(),"This is two",Toast.LENGTH_SHORT).show();
//                  }
//
//
//
//
//                }
//
//        });


    }

