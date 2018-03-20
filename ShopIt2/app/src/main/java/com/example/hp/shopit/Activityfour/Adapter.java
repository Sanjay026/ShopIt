package com.example.hp.shopit.Activityfour;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.shopit.R;
import com.example.hp.shopit.activityfive.ViewPagerDemo;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by HP on 6/13/2017.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    List<ListItem>list;
    LayoutInflater inflater;
    Context context;

    public Adapter(Context context, List<ListItem> list) {
        inflater=LayoutInflater.from(context);
        this.list = list;
        this.context=context;

    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, final int position) {
        ListItem listItem=list.get(position);
        Picasso.with(context).load(listItem.getUri()).fit().placeholder(R.drawable.goa).into(holder.imageView);
        holder.textView.setText(listItem.getName());
        holder.text1View.setText(listItem.getName2());
        holder.text2View.setText(listItem.getName2());
        holder.textView2.setText(listItem.getName());
        holder.cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        context.startActivity(new Intent(context,ViewPagerDemo.class));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        TextView textView,text1View;
        ImageView imageView;
        TextView textView2,text2View;
        ImageView imageView2;
        CardView cardView1,cardView2;
        public viewHolder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.textcard1);
            imageView=(ImageView)itemView.findViewById(R.id.imagecard1);
            textView2=(TextView)itemView.findViewById(R.id.text2card);
            imageView2=(ImageView)itemView.findViewById(R.id.imagecard2);
            text1View=(TextView)itemView.findViewById(R.id.textcard2);
            text2View=(TextView)itemView.findViewById(R.id.text2card2);
            cardView1=(CardView)itemView.findViewById(R.id.cardview1);
            cardView2=(CardView)itemView.findViewById(R.id.cardview2);


        }
    }
}
