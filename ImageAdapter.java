package com.example.adam.akproj;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

/**
 * Created by Adam on 2020-11-05.
 */
public class ImageAdapter extends BaseAdapter {
    public static int[] Images = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5};
    public static String [] description = {"Androidek","Oklachoma City","Miami Heat","Atlana Hawks","Clevleand Cavaliers"};

    private Context context;

    public ImageAdapter(Context applicationContext) {

        context=applicationContext;
    }

    @Override
    public int getCount() {

        return Images.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv;

        if(convertView!=null)
        {
            iv=(ImageView)convertView;
        }
        else
        {
            iv=new ImageView(context);
            iv.setLayoutParams(new GridView.LayoutParams(150,150));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            iv.setPadding(5,5,5,5);

        }

        iv.setImageResource(Images[position]);
        return iv;
    }
}
