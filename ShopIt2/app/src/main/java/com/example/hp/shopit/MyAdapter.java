package com.example.hp.shopit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 6/7/2017.
 */
public class MyAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;


    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);


        mItems.add(new Item("Andhrapradesh",      R.drawable.vijayvada));
        mItems.add(new Item("Bihar",      R.drawable.bihar));
        mItems.add(new Item("Chhattisgarh",      R.drawable.bihar));
        mItems.add(new Item("Delhi", R.drawable.images));
        mItems.add(new Item("Goa", R.drawable.goa));
        mItems.add(new Item("Gujrat",      R.drawable.surat));
        mItems.add(new Item("HimachalPradesh",      R.drawable.shimla));
        mItems.add(new Item("Jammu&Kashmir",      R.drawable.jammu));
        mItems.add(new Item("Jharkhand",      R.drawable.jharkhand));
        mItems.add(new Item("Karnataka",      R.drawable.banlore));
        mItems.add(new Item("Kerala",      R.drawable.kerala));
        mItems.add(new Item("Maharastra",    R.drawable.mmumbai));
        mItems.add(new Item("Odisha",    R.drawable.odisha));
        mItems.add(new Item("Pondicherry",    R.drawable.pondichery));
        mItems.add(new Item("Punjab",      R.drawable.amritsar));
        mItems.add(new Item("Rajasthan",      R.drawable.jaipur));
        mItems.add(new Item("Sikkim",      R.drawable.darjeeling));
        mItems.add(new Item("TamilNadu",      R.drawable.chennai));
        mItems.add(new Item("Telangana",      R.drawable.hydrabad));
        mItems.add(new Item("UttarPradesh",      R.drawable.agra));
        mItems.add(new Item("Uttrakhand",      R.drawable.uttrakh));
        mItems.add(new Item("WestBengal",   R.drawable.kolkata));



    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.grid_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
        }

        picture = (ImageView) v.getTag(R.id.picture);
        name = (TextView) v.getTag(R.id.text);

         Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        

        return v;

    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }


}
