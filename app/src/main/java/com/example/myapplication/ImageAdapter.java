package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    public Context mContext;
    public int[]Image={R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image5};
    ImageAdapter(Context mContext){
        this.mContext=mContext;
    }
    @Override
    public int getCount() {
        return Image.length;
    }

    @Override
    public Object getItem(int i) {
        return Image[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imageView= new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(Image[1]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300, 300 ));
        return null;
    }
}
