package com.example.hp.shopit.activityfive;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.example.hp.shopit.R;

/**
 * Created by HP on 6/15/2017.
 */
public class ViewPagerAdapter extends PagerAdapter {
    private int[] image={R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im4} ;
    private Context context;
    private LayoutInflater inflater;

    public ViewPagerAdapter(Context context){
        this.context=context;

    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=inflater.inflate(R.layout.viewpagerimage,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.img_pager_item);
        imageView.setImageResource(image[position]);

        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
