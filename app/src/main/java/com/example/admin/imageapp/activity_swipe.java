package com.example.admin.imageapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Loux on 20-November-2017.
 */
public class activity_swipe extends PagerAdapter {

    private int[] imageResources = {R.drawable.ima1, R.drawable.ima2, R.drawable.ima3, R.drawable.ima4};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public activity_swipe(Context c) {
        ctx=c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_swipe,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        imageView.setImageResource(imageResources[position]);
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}
