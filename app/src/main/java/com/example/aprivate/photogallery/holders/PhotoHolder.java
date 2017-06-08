package com.example.aprivate.photogallery.holders;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.aprivate.photogallery.GalleryItem;

public class PhotoHolder extends RecyclerView.ViewHolder{
    private TextView mTitleTextView;
    private Context mContext;

    public PhotoHolder(View itemView, Context context) {
        super(itemView);
        mContext = context;
        mTitleTextView = (TextView) itemView;
    }

    public void bindGalleryItem(GalleryItem item) {
        mTitleTextView.setText(item.toString());
    }
}
