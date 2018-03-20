package com.example.hp.shopit.ViewHolder;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.hp.shopit.R;


/**
 * Created by HP on 6/9/2017.
 */
public class TitleParentViewHolder extends ParentViewHolder {
    public TextView _textView;
    public ImageView imageView;
   // public static ImageButton imageButton;
    public CardView cardView;

    public TitleParentViewHolder(final View itemView) {
        super(itemView);
        _textView=(TextView)itemView.findViewById(R.id.parenttext);
       // imageButton=(ImageButton)itemView.findViewById(R.id.expandArrow);
        cardView=(CardView)itemView.findViewById(R.id.cardd);
        imageView=(ImageView)itemView.findViewById(R.id.parentImage);



    }


}
